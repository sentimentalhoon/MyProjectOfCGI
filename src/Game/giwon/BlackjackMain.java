package Game.giwon;

import java.util.Scanner;

public class BlackjackMain {

	public static void main(String[] args) {
		
		

		Scanner sc = new Scanner(System.in);
		Blackjack card = new Blackjack();

		while (true) {
			
			System.out.println("===== Welcome to Blackjack Game ======");
			System.out.println("[1] 게임 시작 [2] 게임 종료");
			int select = sc.nextInt();

			if (select == 1) {
				
				card.gameStart();
				
			} else if (select == 2) {
				
				card.stop();
				break;

			} else {
				
				System.out.println("지원하지 않는 버튼입니다. 다시 입력해주세요");
				
			}

		}
		sc.close();
	}

}
