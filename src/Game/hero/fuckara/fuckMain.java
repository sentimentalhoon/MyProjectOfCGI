package Game.hero.fuckara;

import java.util.Scanner;

import Utils.SC;

public class fuckMain {

	public static void main(String[] args) {

		FuckBaccarat card = new FuckBaccarat();
		while (true) {
			
			System.out.println("===== Welcome to Baccarat Game ======");
			System.out.println("[1] 게임 시작 [2] 게임 종료");
			int select = SC.getScanner().nextInt();

			if (select == 1) {
				
				card.gameStart();
				
			} else if (select == 2) {
				
				card.stop();
				card.musicStop();
				break;

			} else {
				
				System.out.println("지원하지 않는 버튼입니다. 다시 입력해주세요");
				
			}
		}
		
	}

}
