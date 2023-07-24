package Game.miniproject_mom;

public class MomAscii {

	private static MomAscii _instance = null;

	public static MomAscii getInstance() {
		if (_instance == null) {
			_instance = new MomAscii();
		}
		return _instance;
	}

	public MomAscii() {
	}

	public String[] getGameEndAsciiArt() {

		String[] gameEndList = new String[10];

		gameEndList[0] = "			 ██████╗  █████╗ ███╗   ███╗███████╗    ███████╗███╗   ██╗██████╗ ██╗    \n"
				+ "			██╔════╝ ██╔══██╗████╗ ████║██╔════╝    ██╔════╝████╗  ██║██╔══██╗██║    \n"
				+ "			██║  ███╗███████║██╔████╔██║█████╗      █████╗  ██╔██╗ ██║██║  ██║██║    \n"
				+ "			██║   ██║██╔══██║██║╚██╔╝██║██╔══╝      ██╔══╝  ██║╚██╗██║██║  ██║╚═╝    \n"
				+ "			╚██████╔╝██║  ██║██║ ╚═╝ ██║███████╗    ███████╗██║ ╚████║██████╔╝██╗    \n"
				+ "			 ╚═════╝ ╚═╝  ╚═╝╚═╝     ╚═╝╚══════╝    ╚══════╝╚═╝  ╚═══╝╚═════╝ ╚═╝    \n";

		gameEndList[1] = "			 ██████╗                                                                 \n"
				+ "			██╔════╝                                                                 \n"
				+ "			██║  ███╗                                                                \n"
				+ "			██║   ██║                                                                \n"
				+ "			╚██████╔╝                                                                \n"
				+ "			 ╚═════╝                                                                 \n";

		gameEndList[2] = "			          █████╗                                                         \n"
				+ "			         ██╔══██╗                                                        \n"
				+ "			         ███████║                                                        \n"
				+ "			         ██╔══██║                                                        \n"
				+ "			         ██║  ██║                                                        \n"
				+ "			         ╚═╝  ╚═╝                                                        \n";
		;

		gameEndList[3] = "			                 ███╗   ███╗                                             \n"
				+ "			                 ████╗ ████║                                             \n"
				+ "			                 ██╔████╔██║                                             \n"
				+ "			                 ██║╚██╔╝██║                                             \n"
				+ "			                 ██║ ╚═╝ ██║                                             \n"
				+ "			                 ╚═╝     ╚═╝                                             \n";
		;

		gameEndList[4] = "			                            ███████╗                                     \n"
				+ "			                            ██╔════╝                                     \n"
				+ "			                            █████╗                                       \n"
				+ "			                            ██╔══╝                                       \n"
				+ "			                            ███████╗                                     \n"
				+ "			                            ╚══════╝                                     \n";

		gameEndList[5] = "			                                        ███████╗                         \n"
				+ "			                                        ██╔════╝                         \n"
				+ "			                                        █████╗                           \n"
				+ "			                                        ██╔══╝                           \n"
				+ "			                                        ███████╗                         \n"
				+ "			                                        ╚══════╝                         \n";

		gameEndList[6] = "			                                                ███╗   ██╗               \n"
				+ "			                                                ████╗  ██║               \n"
				+ "			                                                ██╔██╗ ██║               \n"
				+ "			                                                ██║╚██╗██║               \n"
				+ "			                                                ██║ ╚████║               \n"
				+ "			                                                ╚═╝  ╚═══╝               \n";

		gameEndList[7] = "			                                                          ██████╗        \n"
				+ "			                                                          ██╔══██╗       \n"
				+ "			                                                          ██║  ██║       \n"
				+ "			                                                          ██║  ██║       \n"
				+ "			                                                          ██████╔╝       \n"
				+ "			                                                          ╚═════╝        \n";

		gameEndList[8] =

				"			                                                                  ██╗    \n"
						+ "			                                                                  ██║    \n"
						+ "			                                                                  ██║    \n"
						+ "			                                                                  ╚═╝    \n"
						+ "			                                                                  ██╗    \n"
						+ "			                                                                  ╚═╝    \n";

		gameEndList[9] = "			 ██████╗  █████╗ ███╗   ███╗███████╗    ███████╗███╗   ██╗██████╗ ██╗    \n"
				+ "			██╔════╝ ██╔══██╗████╗ ████║██╔════╝    ██╔════╝████╗  ██║██╔══██╗██║    \n"
				+ "			██║  ███╗███████║██╔████╔██║█████╗      █████╗  ██╔██╗ ██║██║  ██║██║    \n"
				+ "			██║   ██║██╔══██║██║╚██╔╝██║██╔══╝      ██╔══╝  ██║╚██╗██║██║  ██║╚═╝    \n"
				+ "			╚██████╔╝██║  ██║██║ ╚═╝ ██║███████╗    ███████╗██║ ╚████║██████╔╝██╗    \n"
				+ "			 ╚═════╝ ╚═╝  ╚═╝╚═╝     ╚═╝╚══════╝    ╚══════╝╚═╝  ╚═══╝╚═════╝ ╚═╝    \n";
		return gameEndList;
	}
}
