package Game.giwon;

import java.util.ArrayList;

import java.util.List;
import java.util.Random;

import Account.Account;
import DAO.DBFactory;
import Game.GameDAO.BlackjackDataTable;
import Main.Server;
import Utils.SC;
import javazoom.jl.player.MP3Player;

/*
*목적 :Blackjack 본체.
*개정이력 :박기원,  2023.07.24, 
*최신 수정한 것 : 
*1)  배경음악 소리 줄임 bj_Big_Sleep_sound_down
*2) 페이지 디자인 (딜러 이김, 플레이어 이김, 비김) 추가



*문제점 : 
*1)배경 음악 종료 안됨
*
*/

public class Blackjack {

	
	Blackjack_text_image black_mainpage = new Blackjack_text_image();
	
	// 음악 넣기
	static MP3Player mp3 = new MP3Player();
	static String comPath = "data\\song\\BlackjackSong\\"; // 블랙잭 음악 파일 경로
	
	
	
	// 점수
	private int totalPoint = 0;
	private int battingPoint;

	boolean bl = true;
	// 음악
	MP3Player mp3_1 = new MP3Player();
	MP3Player mp3_2 = new MP3Player();
	MP3Player mp3_3 = new MP3Player();
	// 선언
	Account account = new Account();

	public Blackjack(Account account) {
		this.account = account;
	}

	public void gameStart() {

		totalPoint = account.get_totalpoint();
		bl = true;
		while (bl) {
			if (!ssd())
				break;

			// 음악 재생
			playMusic1("bj_Big_Sleep_sound_down.mp3"); // 배경음악

			// 배팅
			scoreBattingMachine();

			// 카드 덱 생성
			List<String> deck = createDeck();
			// 딜러와 플레이어 카드 리스트 생성

			List<String> dealerHand = new ArrayList<>(); // 딜러
			List<String> playerHand = new ArrayList<>(); // 플레이어

			// 게임 시작
			dealInitialCards(deck, dealerHand, playerHand);
			playGame(deck, dealerHand, playerHand);

			// 게임 결과 출력
			determineWinner(dealerHand, playerHand);

			bl = choiceEnd();

		}
	}

//남은 포인트 없을 때
	public boolean ssd() {
		if (totalPoint <= 0) {
			System.out.println("남은 포인트가 없습니다.");
			return false;
		} else {
			return true;

		}
	}

	// 바카라 점수 배팅
	public void scoreBattingMachine() {
		while (true) {
			System.out.println("현재 포인트 : " + account.get_totalpoint());
			System.out.println("배팅할 포인트를 입력해주세요.");
			System.out.print("배팅할 포인트 : ");
			battingPoint = SC.getScanner().nextInt();
			if (battingPoint <= totalPoint) {
				account.set_totalpoint(account.get_totalpoint() - battingPoint);
				break;
			} else {
				System.out.println("배팅 금액이 넘었습니다.");
				System.out.println();
			}
		}
	}

	// 카드 덱 생성
	public static List<String> createDeck() {
		List<String> deck = new ArrayList<>();
		String[] suits = { "♥", "♦", "♣", "♠" };
		String[] ranks = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };

		for (String suit : suits) {
			for (String rank : ranks) {
				deck.add(rank + " " + suit);
			}
		}

		return deck;
	}

	// 카드 덱에서 카드를 한 장 뽑는 메서드
	public String drawCard(List<String> deck) {
		playMusic2("bj_Card_Sound_Effects.mp3"); // 카드 드로우 효과음
		Random random = new Random();
		int index = random.nextInt(deck.size());
		return deck.remove(index);
	}

	// 초기 카드를 나누는 메서드
	public void dealInitialCards(List<String> deck, List<String> dealerHand, List<String> playerHand) {
		for (int i = 0; i < 2; i++) {
			dealerHand.add(drawCard(deck));
			playerHand.add(drawCard(deck));
		}
	}

	// 카드에 대한 ASCII 아트 추가
	// 가로로 출력
	public static void getCardArt(List<String> cards) {

		String[] art = new String[7];

		// null 방지 코드
		for (int i = 0; i < art.length; i++) {
			art[i] = "";
		}

		for (String card : cards) {
			String[] cardParts = card.split(" ");
			String rank = cardParts[0];
			String suit = cardParts[1];

			// 각 줄 배열 저장
			art[0] += " ┌─────────┐ ";
			art[1] += String.format(" │%2s       │ ", rank);
			art[2] += " │         │ ";
			art[3] += String.format(" │    %s    │ ", suit);
			art[4] += " │         │ ";
			art[5] += String.format(" │       %2s│ ", rank);
			art[6] += " └─────────┘ ";
		}

		// 카드 그림 출력
		for (int i = 0; i < art.length; i++) {
			System.out.println(art[i]);
		}
	}
	// 게임 플레이
	public void playGame(List<String> deck, List<String> dealerHand, List<String> playerHand) {

		// 플레이어가 추가 카드를 뽑을지 여부를 입력받는다
		while (true) {
			// 현재 상태 출력
			System.out.println("=========Dealer Card========= ");
			System.out.println(dealerHand.get(0) + ", [숨김 카드]");

			System.out.println("=========Player Card========= ");
			getCardArt(playerHand); // 플레이어 이미지 카드 출력

			System.out.print("카드를 더 뽑으시겠습니까? (y/n): ");
			String input = SC.getScanner().nextLine();

			if (input.equalsIgnoreCase("y")) {
				// 플레이어가 카드를 뽑음
				playerHand.add(drawCard(deck));

				// 플레이어의 카드 합 계산
				int playerSum = calculateHandSum(playerHand);
				if (playerSum > 21) {
					System.out.println("플레이어가 21을 초과하여 게임에서 패배했습니다.");
					break;
				}
			} else {
				// 플레이어가 더 이상 카드를 뽑지 않음
				break;
			}
		}

		// 딜러의 카드 합 계산
		int dealerSum = calculateHandSum(dealerHand);

		// 딜러가 16 이하일 경우 카드를 더 뽑음
		while (dealerSum <= 16) {
			dealerHand.add(drawCard(deck));
			dealerSum = calculateHandSum(dealerHand);
		}
	}

	// 카드 합 계산
	public static int calculateHandSum(List<String> hand) {
		int sum = 0;
		int numOfAces = 0;

		for (String card : hand) {
			String rank = card.split(" ")[0];

			if (rank.equals("A")) {
				sum += 11;
				numOfAces++;
			} else if (rank.equals("Q") || rank.equals("K") || rank.equals("J")) {
				sum += 10;
			} else {
				sum += Integer.parseInt(rank);
			}
		}

		// 에이스 처리
		while (sum > 21 && numOfAces > 0) {
			sum -= 10;
			numOfAces--;
		}

		return sum;
	}

	// 음악을 재생하는 메소드
	public void playMusic1(String songName) {
		try {
			mp3_1 = new MP3Player();

			mp3_1.play(comPath + songName);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void playMusic2(String songName) {
		try {
			mp3_2 = new MP3Player();

			mp3_2.play(comPath + songName);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void playMusic3(String songName) {
		try {
			mp3_3 = new MP3Player();

			mp3_3.play(comPath + songName);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 승자 결정
	public void determineWinner(List<String> dealerHand, List<String> playerHand) {
		int dealerSum = calculateHandSum(dealerHand);
		int playerSum = calculateHandSum(playerHand);

		System.out.println("딜러 카드: " + dealerHand);
		System.out.println("딜러 카드 합: " + dealerSum);
		System.out.println("플레이어 카드: " + playerHand);
		System.out.println("플레이어 카드 합: " + playerSum);

		if (playerSum > 21) {
			playMusic3("Fail.mp3"); // 실패 효과음
			System.out.println("플레이어가 21을 초과하여 게임에서 패배했습니다.");

			account.set_totalpoint(account.get_totalpoint() - battingPoint); // 배팅
			black_mainpage.delarwinimage(); // 딜러 이긴 이미지
			
			
			
			System.out.println("현재 포인트 : " + account.get_totalpoint());
		} else if (dealerSum > 21) {
			System.out.println("딜러가 21을 초과하여 게임에서 승리했습니다.");
			account.set_totalpoint(account.get_totalpoint() + battingPoint * 2);
			System.out.println("현재 포인트 : " + account.get_totalpoint());
			
			black_mainpage.playwinimage(); // 플레이어 win 이미지
			
		} else if (playerSum > dealerSum) {
			System.out.println("플레이어가 딜러를 이겨 게임에서 승리했습니다.");
			account.set_totalpoint(account.get_totalpoint() + battingPoint * 2);
			System.out.println("현재 포인트 : " + account.get_totalpoint());
			
			black_mainpage.playwinimage(); // 플레이어 win 이미지
		} else if (playerSum < dealerSum) {
			playMusic3("Fail.mp3"); // 실패 효과음
			System.out.println("플레이어가 딜러에게 패배하여 게임에서 패배했습니다.");
			account.set_totalpoint(account.get_totalpoint() - battingPoint); // 배팅
			System.out.println("현재 포인트 : " + account.get_totalpoint());
			
			black_mainpage.delarwinimage(); // 딜러 이긴 이미지
			
		} else {
			System.out.println("게임이 비겼습니다.");
			account.set_totalpoint(account.get_totalpoint() + battingPoint);
			
			black_mainpage.drawimage(); // 비겼을 때 이미지
			
		}
		Account.updateTotalPoint(account);
	}

	// 게임 재게 메서드
	public Boolean choiceEnd() {
		while (true) {
			String select1 = "Yes";
			String select2 = "no";
			String choice;
			System.out.println("게임을 계속 하시겠습니까? [Yes] or [no] 중 하나를 입력해주세요");
			choice = SC.getScanner().next();
			if (choice.equalsIgnoreCase(select1)) {
				System.out.println("게임을 계속 진행합니다.");
				return true;
			} else if (choice.equalsIgnoreCase(select2)) {
				System.out.println("게임을 종료합니다.");
				return false;
			} else {
				System.out.println("다시 입력 해주세요");
			}
		}
	}

	public void stop() {
		mp3_1.stop(); // 음악 중지
		mp3_2.stop(); // 음악 중지
		mp3_3.stop(); // 음악 중지
		System.out.println("Blackjack 게임을 종료합니다");

	}

}
