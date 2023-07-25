package Game.giwon;

import Account.Account;
import Utils.SC;


/*
*목적 :Blackjack main.
*개정이력 :박기원,  2023.07.26, 
*최신 수정한 것 : 
*1)  블랙잭 설명 아스키 코드 삽입!!!
*/


public class BlackjackMain {

	public static void BlackGameStart(Account account) {
		
		
		
		
		Blackjack_text_image black_mainpage = new Blackjack_text_image();

		Blackjack card = new Blackjack(account);
		account.getName();
		while (true) {
			
			
			black_mainpage.b_mainpage();
			
			black_mainpage.walcom();
			System.out.println("[1] 게임 시작 [2] 게임 설명 [3] 게임 종료");
			int select = SC.getScanner().nextInt();

			if(select == 1) {

				card.gameStart();

			} else if (select == 2) {
				black_mainpage.explanation(); // 블랙잭 설명 

			}else if (select == 3) {
				break;

			} else {

				System.out.println("지원하지 않는 버튼입니다. 다시 입력해주세요");

			}

		}
	}

}
