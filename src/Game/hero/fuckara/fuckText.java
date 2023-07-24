package Game.hero.fuckara;

import java.util.ArrayList;

public class fuckText {
	
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
				+ ">> [1] 게임 시작                :+:    :+:   :+: :+:   +:+:+: :+:+:+ :+:a"
				+ "                              +:+         +:+   +:+  +:+ +:+:+ +:+ +:+a"
				+ ">> [2] 게임 종료                :#:  #+#+# +#++:++#++: +#+  +:+  +#+ +#++:++#a"
				+ "                              +#+    #+# +#+     +#+ +#+       +#+ +#+a"
				+ "                              #+#    #+# #+#     #+# #+#       #+# #+#a"
				+ " * 도박 중독은 질병입니다.*          ########  ###     ### ###       ### ########## ";
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
