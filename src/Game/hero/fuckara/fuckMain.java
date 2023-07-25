package Game.hero.fuckara;

import Account.Account;
import Utils.SC;

public class fuckMain {

	public static void FuckarratGameStart(Account account) {

		fuckText text = new fuckText();
		
		FuckBaccarat card = new FuckBaccarat(account);
		while (true) {
			text.mainPage();
			int select = SC.getScanner().nextInt();
			
			if (select == 1) {
				
				card.gameStart();
				
			}else if (select == 2) {
				break;
				
			} else if (select == 3) {
				
				text.gameRules();
				
			}else {
				System.out.println("지원하지 않는 버튼입니다. 다시 입력해주세요");
			}
		}
		
	}

}
