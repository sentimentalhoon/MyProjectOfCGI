package Game.giwon;

import Account.Account;
import Utils.SC;

public class BlackjackMain {

	public static void BlackGameStart(Account account) {
		
		
		
		
		Blackjack_text_image black_mainpage = new Blackjack_text_image();

		Blackjack card = new Blackjack(account);
		account.getName();
		while (true) {
			
			
			black_mainpage.b_mainpage();
			
			black_mainpage.walcom();
			System.out.println("[1] 게임 시작 [2] 게임 종료");
			int select = SC.getScanner().nextInt();

			if(select == 1) {

				card.gameStart();

			} else if (select == 2) {
				break;

			} else {

				System.out.println("지원하지 않는 버튼입니다. 다시 입력해주세요");

			}

		}
	}

}
