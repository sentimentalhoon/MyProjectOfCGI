package Game.hero.fuckara;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class FuckBaccarat {

	private int[] cardNum = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10 };
	private String[] cardNumString = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
	private String[] cardShape = { "H", "D", "C", "S" };
	
	private ArrayList<String> drowCardNumString = new ArrayList<String>();
	private ArrayList<Integer> drowCardNum = new ArrayList<Integer>(); 
	
	private ArrayList<FuckCard> playerCards = new ArrayList<FuckCard>();
	private ArrayList<FuckCard> bankerCards = new ArrayList<FuckCard>();

	private int winnerSelect;
	Random rd = new Random();
	Scanner sc = new Scanner(System.in);
	
	//카드를 섞는 메서드. 리턴값은 없음
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
	
	//카드를 섞고, 섞은 카드의 가장 윗 카드(0번쨰)를 줌. 리턴값은 해당 카드(0번째) 객체
	public FuckCard cardDraw() {
		FuckCard topCard = new FuckCard(cardNum[0], cardNumString[0], cardShape[0]);
		
		return topCard;
	}

	public void name() {
		System.out.println();
		for (int i = 0; i < 13; i++) {
			System.out.print(cardNum[i] + "\t");
		}
		System.out.println();
		for (int i = 0; i < 13; i++) {
			System.out.print(cardNumString[i] + "\t");
		}
		System.out.println();
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
		winnerSelect = sc.nextInt();
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
		System.out.println(totalPlayer);
		System.out.println(totalBanker);

		if (totalPlayer == totalBanker) {
			System.out.println("비겼습니다.");
		} else if (totalPlayer > totalBanker) {
			System.out.println(totalPlayer + "Player 우승!");
		} else if (totalPlayer < totalBanker) {
			System.out.println(totalBanker + "Banker 우승!");
		}

	}

	public void name1() {
		System.out.println();
		for (int i = 0; i < drowCardNum.size(); i++) {
			System.out.print(drowCardNum.get(i)+"\t");
		}
		System.out.println();
	}

	// ArrayList 초기화 메서드
	public void listClear() {
		playerCards.clear();
		bankerCards.clear();
	}
	
	public Boolean choiceEnd() {
		while (true) {
			String select1 = "Yes";
			String select2 = "no";
			String choice;
			System.out.println("게임을 계속 하시겠습니까? [Yes] or [no] 중 하나를 입력해주세요");
			choice = sc.next();
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

	public void gameStart() {
		boolean bl = true;
		while (bl) {
			name();
			listClear();
			System.out.println("Baccarat 게임을 시작합니다!");
			
			//첫번째 카드 뽑기
			shuffle();
			name();
			playerCards.add(cardDraw());
			shuffle();
			name();
			bankerCards.add(cardDraw());
			
			//뽑은 카드 출력
			cardOutput1();
			
			//두번째 카드 뽑기
			shuffle();
			playerCards.add(cardDraw());
			shuffle();
			bankerCards.add(cardDraw());
			
			winnerSelect();
			
			cardOutput2();
			
			winner();
			bl = choiceEnd();
		}

	}

	public void stop() {
		System.out.println("Baccarat 게임을 종료합니다");

	}

}
