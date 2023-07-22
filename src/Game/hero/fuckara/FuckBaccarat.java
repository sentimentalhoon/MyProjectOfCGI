package Game.hero.fuckara;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class FuckBaccarat {
	
	// 계산할 정수형 카드, 출력할 문자형 숫자카드, 출력할 카드 문양
	private int[] cardNum = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10 };
	private String[] cardNumString = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
	private String[] cardShape = { "H", "D", "C", "S" };
	boolean bl = true;
	// 점수
	private int totalPoint = 100;
	private int battingPoint;
	// 랜덤으로 돌린 카드 입력받을 ArrayList 배열
	private ArrayList<FuckCard> playerCards = new ArrayList<FuckCard>();
	private ArrayList<FuckCard> bankerCards = new ArrayList<FuckCard>();
	
	private int winnerSelect;
	Random rd = new Random();
	Scanner sc = new Scanner(System.in);
	
	public void scoreBattingMachine() {
		while(true) {
			System.out.println("배팅할 포인트를 입력해주세요.");
			System.out.println("현재 포인트 : "+totalPoint);
			System.out.print("배팅할 포인트 : ");
			battingPoint = sc.nextInt();
			totalPoint -= battingPoint;
			if(battingPoint <= totalPoint) {
				break;
			}
		}
		
	}
	
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
			totalPoint += battingPoint;
		} else if (totalPlayer > totalBanker) {
			System.out.println(totalPlayer + "Player 우승!");
			if(winnerSelect == 1) {
				totalPoint += battingPoint*2;
				System.out.println("현재 포인트 : " + totalPoint);
			}else {
				System.out.println("현재 포인트 : " + totalPoint);
			}
			
		} else if (totalPlayer < totalBanker) {
			System.out.println(totalBanker + "Banker 우승!");
			if(winnerSelect == 2) {
				totalPoint += battingPoint*2;
				System.out.println("현재 포인트 : " + totalPoint);
			}else {
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
	public boolean ssd() {
		if(totalPoint <= 0) {
			System.out.println("남은 포인트가 없습니다.");
			return false;
		}else {
			return true;
			
		}
		}
	
	// 게임진행 메인 메서드
	public void gameStart() {
		
		while (bl) {
			if(!ssd()) break;
			listClear();
			System.out.println("Baccarat 게임을 시작합니다!");
			scoreBattingMachine();
			//첫번째 카드 뽑기
			shuffle();
			playerCards.add(cardDraw());
			shuffle();
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
	
	public void test2() {
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


//	public void tset1() {
//		System.out.println();
//		for (int i = 0; i < drowCardNum.size(); i++) {
//			System.out.print(drowCardNum.get(i)+"\t");
//		}
//		System.out.println();
//	}

}