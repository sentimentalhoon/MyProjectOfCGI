package Game.hero.fuckara;

import java.util.ArrayList;

import Utils.SC;

public class fuckText {
	
	private int enter;
	
	private void slowTime() {
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void mainPage() {
		ArrayList<String> art = new ArrayList<String>();

		String str = ":::       ::: :::::::::: :::         ::::::::   ::::::::  ::::    ::::  ::::::::::  :::::::::::  ::::::::  a"
				+ ":+:       :+: :+:        :+:        :+:    :+: :+:    :+: +:+:+: :+:+:+ :+:             :+:     :+:    :+: a"
				+ "+:+       +:+ +:+        +:+        +:+        +:+    +:+ +:+ +:+:+ +:+ +:+             +:+     +:+    +:+ a"
				+ "+#+  +:+  +#+ +#++:++#   +#+        +#+        +#+    +:+ +#+  +:+  +#+ +#++:++#        +#+     +#+    +:+ a"
				+ "+#+ +#+#+ +#+ +#+        +#+        +#+        +#+    +#+ +#+       +#+ +#+             +#+     +#+    +#+ a"
				+ " #+#+# #+#+#  #+#        #+#        #+#    #+# #+#    #+# #+#       #+# #+#             #+#     #+#    #+# a"
				+ "  ###   ###   ########## ##########  ########   ########  ###       ### ##########      ###      ########  a"
				+ "              :::::::::      :::      ::::::::   ::::::::      :::     :::::::::      :::     ::::::::::: a"
				+ "             :+:    :+:   :+: :+:   :+:    :+: :+:    :+:   :+: :+:   :+:    :+:   :+: :+:       :+:      a"
				+ "            +:+    +:+  +:+   +:+  +:+        +:+         +:+   +:+  +:+    +:+  +:+   +:+      +:+      a"
				+ "           +#++:++#+  +#++:++#++: +#+        +#+        +#++:++#++: +#++:++#:  +#++:++#++:     +#+      a"
				+ "          +#+    +#+ +#+     +#+ +#+        +#+        +#+     +#+ +#+    +#+ +#+     +#+     +#+      a"
				+ "         #+#    #+# #+#     #+# #+#    #+# #+#    #+# #+#     #+# #+#    #+# #+#     #+#     #+#      a"
				+ "        #########  ###     ###  ########   ########  ###     ### ###    ### ###     ###     ###      a"
				+ "                               ::::::::      :::     ::::    ::::  :::::::::: a"
				+ "      >> [1] 게임 시작          :+:    :+:   :+: :+:   +:+:+: :+:+:+ :+:a"
				+ "                              +:+         +:+   +:+  +:+ +:+:+ +:+ +:+a"
				+ "      >> [2] 게임 종료          :#:  #+#+# +#++:++#++: +#+  +:+  +#+ +#++:++#a"
				+ "                              +#+    #+# +#+     +#+ +#+       +#+ +#+a"
				+ "      >> [3] 게임 설명          #+#    #+# #+#     #+# #+#       #+# #+#a"
				+ "                               ########  ###     ### ###       ### ########## a"
				+ "       * 도박 중독은 질병입니다.* ";
		for(String s : str.split("a")) {
			art.add(s);
			
		}
		for (int i = 0; i < art.size(); i++) {
			System.out.println(art.get(i).toString());
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}

	}

	public void playerWinner() {
		
		slowTime();
		
		
		System.out.println(
				":::::::::  :::            :::   :::   ::: :::::::::: :::::::::      :::       ::: ::::::::::: ::::    ::: ");
		System.out.println(
				":+:    :+: :+:          :+: :+: :+:   :+: :+:        :+:    :+:     :+:       :+:     :+:     :+:+:   :+: ");
		System.out.println(
				"+:+    +:+ +:+         +:+   +:+ +:+ +:+  +:+        +:+    +:+     +:+       +:+     +:+     :+:+:+  +:+ ");
		System.out.println(
				"+#++:++#+  +#+        +#++:++#++: +#++:   +#++:++#   +#++:++#:      +#+  +:+  +#+     +#+     +#+ +:+ +#+ ");
		System.out.println(
				"+#+        +#+        +#+     +#+  +#+    +#+        +#+    +#+     +#+ +#+#+ +#+     +#+     +#+  +#+#+# ");
		System.out.println(
				"#+#        #+#        #+#     #+#  #+#    #+#        #+#    #+#      #+#+# #+#+#      #+#     #+#   #+#+# ");
		System.out.println(
				"###        ########## ###     ###  ###    ########## ###    ###       ###   ###   ########### ###    #### ");
		System.out.println("");
		System.out.println("");
	}

	public void bankerWinner() {
		
		slowTime();
		
		System.out.println(
				":::::::::      :::     ::::    ::: :::    ::: :::::::::: :::::::::      :::       ::: ::::::::::: ::::    ::: ");
		System.out.println(
				":+:    :+:   :+: :+:   :+:+:   :+: :+:   :+:  :+:        :+:    :+:     :+:       :+:     :+:     :+:+:   :+: ");
		System.out.println(
				"+:+    +:+  +:+   +:+  :+:+:+  +:+ +:+  +:+   +:+        +:+    +:+     +:+       +:+     +:+     :+:+:+  +:+ ");
		System.out.println(
				"+#++:++#+  +#++:++#++: +#+ +:+ +#+ +#++:++    +#++:++#   +#++:++#:      +#+  +:+  +#+     +#+     +#+ +:+ +#+ ");
		System.out.println(
				"+#+    +#+ +#+     +#+ +#+  +#+#+# +#+  +#+   +#+        +#+    +#+     +#+ +#+#+ +#+     +#+     +#+  +#+#+# ");
		System.out.println(
				"#+#    #+# #+#     #+# #+#   #+#+# #+#   #+#  #+#        #+#    #+#      #+#+# #+#+#      #+#     #+#   #+#+# ");
		System.out.println(
				"#########  ###     ### ###    #### ###    ### ########## ###    ###       ###   ###   ########### ###    #### ");
		System.out.println();
		System.out.println();
	}

	public void loserText() {
		slowTime();
		System.out.println("                           ♠ ♣ ♦ ♥ ♦ ♣ ♠ ! 배 팅 결 과 ! ♠ ♣ ♦ ♥ ♦ ♣ ♠                ");
		slowTime();
		ArrayList<String> art = new ArrayList<String>();
		String str ="            ======================================================================  a"+
		"            ::    ::  ::::::  ::    ::    ::       ::::::  ::::::: ::::::: ::::::   a"+
				"             :+  :+  :+    :+ :+    :+    :+      :+    +: :+      :+      :+   +:  a"+
		"              +#+#   +#    +# +#    +#    +#      +#    +# +#+:+#+ +#+:#   +#+:#+   a"+
				"               #+    #+    #+ #+    #+    #+      #+    #+      +# +#      #+   +#  a"+
		"               ##     ######   ######     #######  ######  ####### ####### ##   ##  a"+
				"            ======================================================================  ";
		
		for(String s : str.split("a")) {
			art.add(s);
			
		}
		for (int i = 0; i < art.size(); i++) {
			System.out.println(art.get(i).toString());
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}

	public void winnerText() {
		slowTime();
		System.out.println("                               ♠ ♣ ♦ ♥ ♦ ♣ ♠ ! 배 팅 결 과 ! ♠ ♣ ♦ ♥ ♦ ♣ ♠                   ");
		slowTime();
		ArrayList<String> art = new ArrayList<String>();
		String str ="            ============================================================================== a"+
		"            ::    ::  ::::::  ::    ::    ::     :: :: :::    :: :::    :: ::::::: ::::::  a"+
				"             :+  :+  :+    :+ :+    :+    :+     +: :+ :+:+   +: :+:+   :+ :+      :+   +: a"+
		"              +#+#   +#    +# +#    +#    +#  #  #+ +# +# +#  +# +# +#  +# +#+:+   +#+:+#  a"+
				"               #+    #+    #+ #+    #+    #+ +#+ +# #+ #+  #+ #+ #+  #+ #+ #+      #+   #+ a"+
		"               ##     ######   ######      ### ###  ## ##   #### ##   #### ####### ##   ## a"+
				"            ============================================================================== ";
		
		for(String s : str.split("a")) {
			art.add(s);
			
		}
		for (int i = 0; i < art.size(); i++) {
			System.out.println(art.get(i).toString());
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
	
	public void gameRules() {
		System.out.println("      ╭ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝╮");
		System.out.println("           친.절.한 내가 게임 룰을 설명 해줘야겠군!");
		System.out.println("      ╰ ◟◞ ͜ ◟◞ ͜ ◟◞ ͜ ◟◞ ͜ ◟◞ ͜ ◟◞ ͜ ◟◞ ͜ ◟◞ ͜ ◟◞ ╯");
		System.out.println("          O");
		System.out.println("        °");
		System.out.println("      /}__/}  잘 들어보렴!");
		System.out.println("     ( • ▼•)  ┌───────────────────────────────────────────────────────┐");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("                게임을 설명해줄게 ");
		System.out.println();
		next();
		System.out.println("                카드는 Player 와 Banker 에게 각각 2장의 카드를 줄거야");
		System.out.println();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("                카드 숫자의 총 합의 수가 '9'에 가까운 유저가 승리하는거야! ");
		System.out.println();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("                !! 이때 카드 숫자의 총 합이 10을 넘어가면 10의자리수는 0으로 간주해!");
		System.out.println();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("                참고로 10, J , Q , K 카드도 모두 0의로 간주할거야");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("              └───────────────────────────────────────────────────────┘");
		System.out.println();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("      /}_/}");
		System.out.println("    ( ´ ㅅ`)   알겠지? 이제 게임 규칙을 설명해주갓어");
		System.out.println("              ┌───────────────────────────────────────────────────────┐");
		System.out.println("                게임 규칙은 아주 간단해 잘 들어봐");
		System.out.println();
		next();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("                첫째! 어느정도의 금액(포인트) 를 배팅할건지 입력해야해");
		System.out.println();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("                둘째! 첫번째 카드를 받고 우승 확률이 높은 유저에게 ㅂㅐ팅을 하는거야!");
		System.out.println();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("                셋째! 배팅 한 유저가 우승했을 시 배팅 금액의 2배를 받아! ");
		System.out.println();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("                마지막으로 배팅 한 유저가 졌을땐 배팅 금액을 잃는 간단한 게임이야~");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("              └───────────────────────────────────────────────────────┘");
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("                 /}__/} ||  ⋆⁺₊ 𓆉 ⋆⁺₊⋆ ‧͙ *̩͙⋆⁺₊ 𓆉 ⋆⁺₊⋆ ‧͙ *̩͙");
		System.out.println("                ( • ▼•) ||  알겠지? 그럼 이제 게임하러 G O G O!");
		System.out.println("                /   .. づ|              ⋆⁺₊ 𓆉 ⋆⁺₊⋆ ‧͙ *̩͙⋆⁺₊ 𓆉 ⋆⁺₊⋆ ");
		System.out.println();
		next();
	}
	
	private void next() {
		
		System.out.println("             [0] >> 다음 ");
		enter = SC.getScanner().nextInt();
		
		while(true) {
			if(enter == 0) {
				break;
			}else {
				System.out.println(" [0]번만! 눌러! 주세요! ");
			}
		}
	}
	
	private int i = 0;
	public void firstGameRoles() {
		while(i == 0) {
			gameRules();
			i++;
			break;
		}
		
	}

	
//	public static void getCardArt(List<String> cards) {
//
//		String[] art = new String[7];
//
//		// null 방지 코드
//		for (int i = 0; i < art.length; i++) {
//			art[i] = "";
//		}
//
//		for (String card : cards) {
//			String[] cardParts = card.split(" ");
//			String rank = cardParts[0];
//			String suit = cardParts[1];
//
//			// 각 줄 배열 저장
//			art[0] += " ┌─────────┐ ";
//			art[1] += String.format(" │%2s       │ ", rank);
//			art[2] += " │         │ ";
//			art[3] += String.format(" │    %s    │ ", suit);
//			art[4] += " │         │ ";
//			art[5] += String.format(" │       %2s│ ", rank);
//			art[6] += " └─────────┘ ";
//		}
//	}
}
