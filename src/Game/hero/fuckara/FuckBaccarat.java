package Game.hero.fuckara;

import java.util.ArrayList;
import java.util.Random;
import Account.Account;
import Main.Server;
import Utils.SC;
import javazoom.jl.player.MP3Player;

public class FuckBaccarat {

	// 계산할 정수형 카드, 출력할 문자형 숫자카드, 출력할 카드 문양
	private int[] cardNum = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10 };
	private String[] cardNumString = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
	private String[] cardShape = { "♥", "♦", "♣", "♠" };
	boolean bl = true;
	// 점수
	private int totalPoint = 0;
	private int battingPoint;
	
	MP3Player mp3_1 = new MP3Player();
	MP3Player mp3_2 = new MP3Player();
	MP3Player mp3_3 = new MP3Player();

	static String comPath = "data\\song\\BlackjackSong\\"; // 블랙잭 음악 파일 경로

	Account account = new Account();
	
	fuckText text = new fuckText();
	
	// 랜덤으로 돌린 카드 입력받을 ArrayList 배열
	private ArrayList<FuckCard> playerCards = new ArrayList<FuckCard>();
	private ArrayList<FuckCard> bankerCards = new ArrayList<FuckCard>();

	private int winnerSelect;
	Random rd = new Random();

	public FuckBaccarat(Account account) {

		this.account = account;

	}

	public void scoreBattingMachine() {

		while (true) {
			System.out.println();
			System.out.println("배팅할 포인트를 입력해주세요.");
			System.out.println("현재 포인트 : " + totalPoint);
			System.out.print("배팅할 포인트 : ");
			battingPoint = SC.getScanner().nextInt();
			if (battingPoint <= totalPoint) {
				totalPoint -= battingPoint;
				break;
			}
		}

	}

	// 카드를 섞는 메서드. 리턴값은 없음
	public void shuffle() {
		for (int i = 0; i < cardNum.length; i++) {
			int randum = rd.nextInt(cardNum.length - i) + i;

			int num = cardNum[i];
			cardNum[i] = cardNum[randum];
			cardNum[randum] = num;

			String numString = cardNumString[i];
			cardNumString[i] = cardNumString[randum];
			cardNumString[randum] = numString;
		}

		for (int i = 0; i < cardShape.length; i++) {
			int randum = rd.nextInt(cardShape.length - i) + i;

			String temp = cardShape[i];
			cardShape[i] = cardShape[randum];
			cardShape[randum] = temp;
		}
	}

	// 카드를 섞고, 섞은 카드의 가장 윗 카드(0번쨰)를 줌. 리턴값은 해당 카드(0번째) 객체
	public FuckCard cardDraw() {
		FuckCard topCard = new FuckCard(cardNum[0], cardNumString[0], cardShape[0]);

		return topCard;
	}

	// 첫번째 드로우한 카드 출력 메소드
	public void cardOutput1() {
		System.out.println("Player's first Card : " + playerCards.get(0).printCard());
		System.out.println("Banker's first Card : " + bankerCards.get(0).printCard());
	}

	// 우승자 배팅 메소드
	public void winnerSelect() {
		System.out.println("배팅을 진행합니다.");
		System.out.println("[1] Player" + "\t" + "[2] Banker");
		winnerSelect = SC.getScanner().nextInt();
		if (winnerSelect == 1) {
			System.out.println(" 'Player' 를 선택하셨습니다!");
		} else if (winnerSelect == 2) {
			System.out.println(" 'Banker' 를 선택하셨습니다!");
		}
	}

	// 2번째 카드 출력 메서드
	public void cardOutput2() {
		System.out.print("Player's first Card : " + playerCards.get(0).printCard() + "\t");
		System.out.println(playerCards.get(1).printCard());
		System.out.print("Banker's first Card : " + bankerCards.get(0).printCard() + "\t");
		System.out.println(bankerCards.get(1).printCard());
	}

	// 우승자 계산 및 출력 메소드
	public void winner() {
		int totalPlayer = playerCards.get(0).getCardNum() + playerCards.get(1).getCardNum();
		int totalBanker = bankerCards.get(0).getCardNum() + bankerCards.get(1).getCardNum();

		if (totalPlayer >= 10) {
			totalPlayer %= 10;
		}
		if (totalBanker >= 10) {
			totalBanker %= 10;
		}
		System.out.println();
		System.out.println("Player's Card total score : "+totalPlayer);
		System.out.println("Banker's Card total score : "+totalBanker);
		System.out.println();

		if (totalPlayer == totalBanker) {
			System.out.println("비겼습니다.");
			totalPoint += battingPoint;
		} else if (totalPlayer > totalBanker) {
			text.playerWinner();
			if (winnerSelect == 1) {
				text.winnerText();
				totalPoint += (battingPoint + (battingPoint*2));
				System.out.println();
				System.out.println("현재 포인트 : " + totalPoint);
			} else {
				text.loserText();
				System.out.println();
				System.out.println("현재 포인트 : " + totalPoint);
			}

		} else if (totalPlayer < totalBanker) {
			text.bankerWinner();
			if (winnerSelect == 2) {
				text.winnerText();
				totalPoint += (battingPoint + (battingPoint*2));
				System.out.println();
				System.out.println("현재 포인트 : " + totalPoint);
			} else {
				text.loserText();
				System.out.println();
				System.out.println("현재 포인트 : " + totalPoint);
			}
		}

	}

	// ArrayList 초기화 메서드
	public void listClear() {
		playerCards.clear();
		bankerCards.clear();
	}

	// 게임 재게 메서드
	public Boolean choiceEnd() {
		while (true) {
			String select1 = "Yes";
			String select2 = "no";
			String choice;
			System.out.println();
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

	public boolean ssd() {
		if (totalPoint <= 0) {
			System.out.println("남은 포인트가 없습니다.");
			return false;
		} else {
			return true;

		}
	}

	// 게임진행 메인 메서드
	public void gameStart() {
		Server.getInstance();
		playMusic1("minifi.mp3");
		totalPoint = account.get_totalpoint();
		bl = true;
		
		while (bl) {
			if (!ssd())
				break;

			listClear();
			System.out.println("Baccarat 게임을 시작합니다!");
			text.firstGameRoles();
			scoreBattingMachine();
			// 첫번째 카드 뽑기
			shuffle();
			playerCards.add(cardDraw());
			shuffle();
			bankerCards.add(cardDraw());

			// 첫번째 뽑은 카드 텍스트 출력
			playMusic2("bj_Card_Sound_Effects.mp3");
			CardImage(playerCards.get(0), "Player");
			CardImage(bankerCards.get(0), "Banker");

			// 뽑은 카드 출력
//			cardOutput1();
			// 두번째 카드 뽑기
			shuffle();
			playerCards.add(cardDraw());
			shuffle();
			bankerCards.add(cardDraw());

			System.out.println();
			winnerSelect();
			// 두번째 뽑은 카드 텍스트 출력
			playMusic3("bj_Card_Sound_Effects.mp3");
			CardImage(playerCards.get(0), playerCards.get(1), "Player");
			CardImage(bankerCards.get(0), bankerCards.get(1), "Banker");
//			cardOutput2();
			winner();

			bl = choiceEnd();

		}

		stop();
		musicStop();
		account.set_totalpoint(totalPoint);
		Account.updateTotalPoint(account);

	}

	public void stop() {
		System.out.println();
		System.out.println(" Baccarat 게임을 종료합니다 ");
		System.out.println();

	}

	// 테스트용 메서드
//	public void test2() {
//		System.out.println();
//		for (int i = 0; i < 13; i++) {
//			System.out.print(cardNum[i] + "\t");
//		}
//		System.out.println();
//		for (int i = 0; i < 13; i++) {
//			System.out.print(cardNumString[i] + "\t");
//		}
//		System.out.println();
//	}

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

	public void musicStop() {
			mp3_1.stop(); // 음악 중지
			mp3_2.stop(); // 음악 중지
			mp3_3.stop(); // 음악 중지

	}

	public void CardImage(FuckCard card, String name) {
		System.out.println();
		System.out.println(" _______");
		System.out.println("|" + " ".repeat(7 - card.getCardNumString().length()) + card.getCardNumString() + "|");
		System.out.println("|       |");
		System.out.println("|   " + card.getCardShape() + "   |");
		System.out.println("|       |");
		System.out.println("|" + card.getCardNumString() + "_".repeat(7 - card.getCardNumString().length()) + "|");
		System.out.println(name + "'s Card");
	}

	public void CardImage(FuckCard card1, FuckCard card2, String name) {
		System.out.println();
		System.out.println(" _______      _______ ");
		System.out.println("|" + " ".repeat(7 - card1.getCardNumString().length()) + card1.getCardNumString() + "|    |"
				+ " ".repeat(7 - card2.getCardNumString().length()) + card2.getCardNumString() + "|");
		System.out.println("|       |    |       |");
		System.out.println("|   " + card1.getCardShape() + "   |    |   " + card2.getCardShape() + "   |");
		System.out.println("|       |    |       |");
		System.out.println("|" + card1.getCardNumString() + "_".repeat(7 - card1.getCardNumString().length()) + "|    |"
				+ card2.getCardNumString() + "_".repeat(7 - card2.getCardNumString().length()) + "|");
		System.out.println(name + "'s Card");
	}

//	public void tset1() {
//		System.out.println();
//		for (int i = 0; i < drowCardNum.size(); i++) {
//			System.out.print(drowCardNum.get(i)+"\t");
//		}
//		System.out.println();
//	}

}
