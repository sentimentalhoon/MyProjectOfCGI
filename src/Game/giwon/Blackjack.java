package Game.giwon;

import java.util.ArrayList;

import java.util.List;
import java.util.Random;
import Utils.SC;

/*
*목적 :Blackjack 본체.
*개정이력 :박기원,  2023.07.23, 
*최신 수정한 것 : getCardArt-블랙잭 카드 이미지 출력 및 가로로 출력 완료!
*문제점 : getCardArt 카드 이미지 ◆ 출력하면 한칸씩 밀림
*/



public class Blackjack {

	public void gameStart() {

		
		// 카드 덱 생성
		List<String> deck = createDeck();
//        account.getName() + "님 반갑습니다."
		// 딜러와 플레이어 카드 리스트 생성
		List<String> dealerHand = new ArrayList<>(); // 딜러
		List<String> playerHand = new ArrayList<>(); // 플레이어

		// 게임 시작
		dealInitialCards(deck, dealerHand, playerHand);
		playGame(deck, dealerHand, playerHand);

		// 게임 결과 출력
		determineWinner(dealerHand, playerHand);
	}

	// 카드 덱 생성
	public static List<String> createDeck() {
		List<String> deck = new ArrayList<>();
		String[] suits = { "♥", "◆", "♣", "♠" };
		String[] ranks = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };

		for (String suit : suits) {
			for (String rank : ranks) {
				deck.add(rank + " " + suit);
			}
		}

		return deck;
	}

	// 카드 덱에서 카드를 한 장 뽑는 메서드
	public static String drawCard(List<String> deck) {
		Random random = new Random();
		int index = random.nextInt(deck.size());
		return deck.remove(index);
	}

	// 초기 카드를 나누는 메서드
	public static void dealInitialCards(List<String> deck, List<String> dealerHand, List<String> playerHand) {
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
	        art[1] += String.format(" │ %s       │ ", rank);
	        art[2] += " │         │ ";
	        art[3] += String.format(" │   %s     │ ", suit);
	        art[4] += " │         │ ";
	        art[5] += String.format(" │      %s  │ ", rank);
	        art[6] += " └─────────┘ ";
	    }

	    // 카드 그림 출력
	    for (int i = 0; i < art.length; i++) {
	        System.out.println(art[i]);
	    }
	}
	


	// 게임 플레이
	public static void playGame(List<String> deck, List<String> dealerHand, List<String> playerHand) {

		// 플레이어가 추가 카드를 뽑을지 여부를 입력받는다
		while (true) {
			// 현재 상태 출력
			System.out.println("Banker's Card: " + dealerHand.get(0) + ", [숨김 카드]");
			System.out.println("Player Card: ");
			getCardArt(playerHand);  //플레이어 이미지 카드 출력

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

	// 승자 결정
	public static void determineWinner(List<String> dealerHand, List<String> playerHand) {
		int dealerSum = calculateHandSum(dealerHand);
		int playerSum = calculateHandSum(playerHand);

		System.out.println("딜러 카드: " + dealerHand);
		System.out.println("딜러 카드 합: " + dealerSum);
		System.out.println("플레이어 카드: " + playerHand);
		System.out.println("플레이어 카드 합: " + playerSum);

		if (playerSum > 21) {
			System.out.println("플레이어가 21을 초과하여 게임에서 패배했습니다.");
		} else if (dealerSum > 21) {
			System.out.println("딜러가 21을 초과하여 게임에서 승리했습니다.");
		} else if (playerSum > dealerSum) {
			System.out.println("플레이어가 딜러를 이겨 게임에서 승리했습니다.");
		} else if (playerSum < dealerSum) {
			System.out.println("플레이어가 딜러에게 패배하여 게임에서 패배했습니다.");
		} else {
			System.out.println("게임이 비겼습니다.");
		}

	}

	public void stop() {
		System.out.println("Blackjack 게임을 종료합니다");
		
	}
}
