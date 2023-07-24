package Game.Dain;

public class CinemaAscii {
    private static CinemaAscii _instance = null;

    public static CinemaAscii getInstance() {
        if (_instance == null) {
            _instance = new CinemaAscii();
        }
        return _instance;
    }

    public CinemaAscii() {
    }

    public void openingAsciiArt() {
        try {
            print(
                    "\n\n\n\n\n\n\n\n\n\n\n  ====================================================================================\n");
            Thread.sleep(100); // 0.1초 대기
            print(
                    "                                                                                      \n");
            Thread.sleep(100);
            print(
                    "   ██████╗██╗███╗   ██╗███████╗███╗   ███╗ █████╗      ██████╗ ██╗   ██╗██╗███████╗██╗\n");
            Thread.sleep(100);
            print(
                    "  ██╔════╝██║████╗  ██║██╔════╝████╗ ████║██╔══██╗    ██╔═══██╗██║   ██║██║╚══███╔╝██║\n");
            Thread.sleep(100);
            print(
                    "  ██║     ██║██╔██╗ ██║█████╗  ██╔████╔██║███████║    ██║   ██║██║   ██║██║  ███╔╝ ██║\n"); // 5
            Thread.sleep(100);
            print(
                    "  ██║     ██║██║╚██╗██║██╔══╝  ██║╚██╔╝██║██╔══██║    ██║▄▄ ██║██║   ██║██║ ███╔╝  ╚═╝\n");
            Thread.sleep(100);
            print(
                    "  ╚██████╗██║██║ ╚████║███████╗██║ ╚═╝ ██║██║  ██║    ╚██████╔╝╚██████╔╝██║███████╗██╗\n");
            Thread.sleep(100);
            print(
                    "   ╚═════╝╚═╝╚═╝  ╚═══╝╚══════╝╚═╝     ╚═╝╚═╝  ╚═╝     ╚══▀▀═╝  ╚═════╝ ╚═╝╚══════╝╚═╝\n");
            Thread.sleep(100);
            print("                                     영화 퀴즈                                  \n");
            Thread.sleep(100);
            print(
                    "  ====================================================================================\n");
            print("                                    LOADING....                             \n"); // 10
        } catch (InterruptedException e) {
            e.printStackTrace();
        } // 0.1초 대기
    }

    public void getCinemaPosterAsciiArt(int page) {
        if (page == 1) {
            try {
                System.out.print("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣤⣴⢴⡶⣴⣤⣠⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
                        + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⠋⣼⣿⣿⣸⡇⣾⣿⣄⠘⢷⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
                        + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⡇⠀⣿⣿⣿⣿⣆⣿⣾⠇⣢⣸⣗⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
                        + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣽⣷⠀⢿⣽⣿⣿⣿⣿⣿⡤⢻⣹⣿⡅⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
                        + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣥⣾⣿⣿⣿⡯⣿⣿⣷⣷⣿⣿⡷⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
                        + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣿⣿⣿⣿⣽⣿⣷⣿⣿⠃⣿⣿⣿⣿⣧⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
                        + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣽⣿⣿⣿⣿⣿⣛⡿⢿⣷⡗⣾⣿⣿⣿⣿⣗⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
                        + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢼⣿⣿⣿⣿⣿⣿⣿⣷⣾⣯⣷⢿⣿⣿⣿⣿⣯⡧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
                        + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢐⣿⣿⣿⣿⣿⣿⣾⣿⣿⣿⣿⣿⣟⣿⣿⣿⣿⣿⣿⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
                        + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
                        + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠙⠛⠻⣿⣿⣿⣿⣿⣿⣿⣿⣭⣿⣿⣿⣿⣷⣦⣄⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
                        + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣨⣿⢿⠿⢝⣿⣷⣾⣿⠫⠛⠿⣻⣿⣿⣿⣿⣿⣿⣿⣶⣤⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
                        + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣿⣿⡟⡓⡼⢾⣿⣿⡿⢁⠠⣡⣾⠟⠡⠀⣠⣾⣿⣟⣿⣿⣿⣿⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
                        + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣘⣿⣿⡩⢱⢁⡾⣻⠏⠠⢂⣽⡿⢓⠀⣣⣾⣿⣿⣿⣷⡬⣿⣿⣿⣿⣄⠀⠀⠀⠀⠀⠀⠀⠀\n"
                        + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡠⢂⡿⢢⣼⣿⣣⢢⢃⠋⢽⠏⠀⣠⣿⠟⡐⢢⣡⣿⣿⣿⣿⣿⣿⡿⣿⣿⣿⣿⣿⣦⠀⠀⠀⠀⠀⠀⠀\n"
                        + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡠⠎⣿⡋⣵⢠⢧⡎⡎⠬⣼⣏⣠⣴⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⠐⣿⣿⣿⣿⣿⡅⠀⠀⠀⠀⠀⠀\n"
                        + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⢐⢣⣲⣏⣮⣏⣥⣵⣾⣶⣿⣟⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣆⣸⣿⣿⣿⣿⣷⡄⠀⠀⠀⠀⠀\n"
                        + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⣾⣿⣿⣿⣿⣿⣿⣿⣿⣹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣯⠀⠀⠀⠀⠀\n"
                        + "⠀⠀⠀⠀⠀⠀⠀⠀⢸⡿⢷⣿⣿⡟⣿⣷⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡃⠀⠀⠀⠀\n"
                        + "⠀⠀⠀⠀⠀⠀⠀⠀⣼⣿⣿⣿⣿⡧⣿⣿⢿⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⠀⠀⠀⠀\n"
                        + "⠀⠀⠀⠀⠀⠀⠀⠀⠈⢹⣿⣿⣿⣷⣗⣿⣸⣵⣿⡧⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⡀⠀⠀⠀\n"
                        + "⠀⠀⠀⠀⠀⠀⠀⠀⣠⣿⣿⣿⣿⣽⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀\n"
                        + "⠀⠀⠀⠀⠀⠀⠀⢀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⣿⣿⣿⣿⡷⠀⠀⠀\n"
                        + "⠀⠀⠀⠀⠀⠀⢀⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⣾⣻⣿⣿⣿⣿⡀⠀⠀\n");
                Thread.sleep(200);
                System.out.print("     ██ ███    ███     ██    ██  ██████  ██    ██ ██████           \n");
                Thread.sleep(200);
                System.out.print("     ██ ████  ████      ██  ██  ██    ██ ██    ██ ██   ██          \n");
                Thread.sleep(200);
                System.out.print("     ██ ██ ████ ██       ████   ██    ██ ██    ██ ██████           \n");
                Thread.sleep(200);
                System.out.print("     ██ ██  ██  ██        ██    ██    ██ ██    ██ ██   ██          \n");
                Thread.sleep(200);
                System.out.print("     ██ ██      ██        ██     ██████   ██████  ██   ██ ██ ██ ██ \n");

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else if (page == 2) {
            try {
                System.out.print("~!!~~~~^^^^~!7~^??^^::::::::::::::::::::::::::^^^^^^^^^^^^^^\n"
                        + "!~~~~~~?7~!7J77~7YPJ~~:::::::::::::::::::::^^^^^^^^^^^^^^^^^\n"
                        + "!~~~~~5BYY?!7!~!777?5?:::::::::::::::::::::^^^^^^^^^^^::^^^^\n"
                        + "~~~~~5#BBBGPP5?77?JJ?^:::::::::::::::::::::^^^:^^^^^^^::::::\n"
                        + "~~~^?#BB##GJ5J5PG5?7?7~~7~^::::::::::::::::^^^::::^^::::::::\n"
                        + "^^^^7GBB##BBBGGGBGP555PPGG5~::::::::::::::^^^^::::::::::::::\n"
                        + "^^^^^Y#B#BBBGGBGGGGGPPPP5JJ!~!!^::::::::::::::::::::::::::::\n"
                        + "^^^^:JBBGPPPPGGB#BGBGPPPP5J?7?J57:::::::::::::::::::::::::::\n"
                        + "P57!~?GGGPPBBBB##BGGGBGGPPPJ77!?5?!^.:::::::::::::::::::::::\n"
                        + "&##BGGGGGBBB#####BBGGGGGBGG5YJ?77??Y?^.:::::::::::::::::::::\n"
                        + "#####GBBBB#######BBGGGGGGBBB5??7777JP5!::::::::::::::.......\n"
                        + "##########BJ7P###BBBGGGGGGGBBY7??777JP5::::..........:^~!7^.\n"
                        + "?YPB##&##Y~..:!P##BBGGGGGGGGBB?!77???YB!........:^::~J5P5PJ~\n"
                        + ":::^!?J?~:::::.:JBBBBBGGGGGGGB57!!77??55~!!7???J5P5YPY55YPP!\n"
                        + "::::::..::::::::.?BBBBBGGGGGBBGJ??7777?5GGGPPGGGGGGGGJ!!!~^.\n"
                        + "::::::::::::::::::P#BBBBGGBBBGBBBBBGGP5PPGGGGGBBBBBPY~ .....\n"
                        + ":::::::::::::::::.Y#BBGGGBBBBBBGGGGB#&&&#GGGGPPPPPY:........\n"
                        + ":::::::::::::::..:PBGGGGBBBBBBBGGGGGBBB###?:::::::..........\n"
                        + "::::::::...:::...:PBGGGGBBBBBBBGGGGGBBBB##B7................\n"
                        + ":::::::...:....::~GBGGGGGBBBBBBBGGGGBBBBB###7...............\n"
                        + "::^~~~^::::...:::7BBBGGGGBBBBBBGBGGGBBBBBBB##7..............\n"
                        + "^^~7!~^:::::::^^^YBBGGGGBBBBB#BGGGGBB#####BBBP?:....:::....:\n"
                        + "~~!7777!^:::::^^~PBBBB########BGGBBBBB##BB##BGGP?^...:::...^\n"
                        + "!!777??7~^^^:^~~7B###########BGGBBBBB###B###BGGGGP?^::::...!\n"
                        + "!77777?7~~~~~~~~!JPB###&#####BGBBBBBB######BBBBGGGGPJ!::.::!\n"
                        + "!777777!!!!!!!!~~~~!?JY5PG##BBBBBBGBB#############BGGPY!:::7\n"
                        + "!7????~~!!!!!!!!!!!!7777??G#BBGGGGGGB#####BBBBBBBBGGGGGG5!:~\n"
                        + "?JJJ??~~!!!!!!!!!!!!777???G#BBGGGGGBB#BGGB######BBBBGGGGGGY!\n"
                        + "YYYJ??7!!7?77777!!77?????5##BBGGGGBB##G???JYPGBBBBB#BBBBBGBP\n"
                        + "YYJJJJJYJJYJ?7777???????YB#BBGGGGBBB#BY?!!!!!7?YP#BBGGGGGGGG\n"
                        + "JJJJJJJYYYYYJ????JJJ?77?JG#BBBBBB###B5??!!!!!!!!!5BBGGGGGGG5\n");
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else if (page == 3) {
            try {
                System.out.print("⣿⣿⣿⣿⣿⣿⣿⠟⠛⠛⠋⠉⠉⠉⠉⠉⠉⠁⠀⠀⠀⠀⠀⣐⠚⢋⣶⣶⣿⣯⣀⣀⣀⣸⣷⣄⡀⠀⠀⠀⠀⠀⢸⣿⣿⡿⠋⠉⠉⠉⠉⠉⢉⣿⣿⣿⣿⣿⣿⣿⣿⣆⠀⢩⣀\n"
                        + "⣿⣿⣿⣿⣿⣿⣉⣤⠄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠉⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣶⣤⡀⠀⠈⣿⣿⡧⠀⢀⠀⠀⠀⠀⣽⣿⣿⣿⣿⣿⣿⣿⣿⣿⣦⣸⣿\n"
                        + "⠘⠛⣿⣿⣿⣿⣿⡿⠦⠄⠀⠀⠀⠀⠀⢠⡴⣋⣠⣶⠶⢶⣟⠛⠉⣉⣽⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⠀⣤⡄⠀⢀⣴⣶⣶⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡹⣿⣿⣿\n"
                        + "⠁⠀⢸⡏⣸⣿⣾⣿⡄⠀⠀⠀⠀⠀⠀⣟⣿⣿⣿⣶⣿⣿⣷⣴⣾⣿⢟⣿⣿⣿⣿⣿⣿⣿⣿⢿⣿⣿⣿⣿⣿⣷⢬⣄⠀⠈⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣇⠸⣿⣿\n"
                        + "⠀⢠⣿⡇⢾⣿⣿⣿⡇⠀⠀⠀⠀⠀⣴⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⡿⣯⡙⣆⠀⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⢸⣿\n"
                        + "⠀⣼⣿⡆⢨⣿⣿⣿⣿⡆⠀⠀⠀⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣷⣿⣿⣦⣤⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡏⠉⠉⠁⠀⠀⠀\n"
                        + "⣿⣿⣿⠇⠀⣸⣿⣿⣏⣭⣻⣶⣶⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣿⣿⣿⣿⣿⣿⣿⢟⠻⣿⣽⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣦⣤⡀⠀⠀⠀\n"
                        + "⣿⣿⠏⠀⢠⣿⣿⣿⣿⣿⣿⣿⢑⣵⣿⣿⣿⢋⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣾⣷⣖⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡛⠋⠁⠉⠁⠀⠀⠀⠀⢀⣀\n"
                        + "⠛⣰⣄⠀⣸⣿⣿⣿⣿⣿⣿⣧⣿⣯⣿⣿⢃⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠛⠿⣿⢿⣿⡄⠙⢿⣜⠉⠹⣏⣻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣦⠀⠀⠛⣛⣛⣛⣛⣿\n"
                        + "⣾⠋⠙⢠⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡘⠇⠀⠀⢿⣯⠙⣿⣦⠀⠙⠳⣄⡈⢿⡻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
                        + "⣻⡀⠀⣿⣿⣿⣿⣿⣿⣿⣭⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⢨⡿⣦⢦⠀⠈⢻⠳⣌⠻⣷⡀⠀⠈⠛⢶⣽⢦⢹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
                        + "⣿⣧⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⣈⣀⡈⠯⢃⠀⠈⠀⢸⠀⠀⢘⣤⣶⣾⣋⣉⡉⠸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
                        + "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⢿⣿⣿⣿⣿⣆⠀⠀⠀⣼⡿⢿⣿⡷⣦⡘⣷⣿⣿⡛⣿⣿⣿⣿⣌⣽⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
                        + "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠟⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠿⢀⣴⣿⢿⣿⣿⣿⣿⣧⣤⠰⣿⠡⣀⣛⡯⠟⠀⣼⣿⡟⢷⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
                        + "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣦⣨⣿⣿⣥⡤⠍⠁⠨⣿⣿⣇⠀⠈⢦⡀⠁⠀⣀⠴⠁⣿⢷⡄⠉⠙⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
                        + "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠉⠉⠙⣧⡀⠀⠀⠀⣠⠿⣿⣿⡄⠀⠀⠉⠉⠉⠁⠀⠀⣿⡀⠀⠰⢶⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
                        + "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣿⠿⣿⣿⠣⣄⠀⠀⠀⠉⠓⠋⠉⠁⣴⡿⣿⡅⠀⠀⣀⠀⠀⠀⠀⠀⣿⡇⠀⠀⠀⢀⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
                        + "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠟⣿⣿⣿⣿⣷⣯⣿⡄⠙⡄⠀⠀⠀⠀⠀⠀⠀⠿⠿⣿⣿⠷⠆⠁⠀⠀⠀⠀⢀⡇⠀⠀⠀⠀⠀⠙⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
                        + "⠀⠉⠻⠿⢿⣿⡿⠿⠛⠛⠉⠁⠀⠀⠀⠙⢿⣿⣿⣿⣿⣿⣷⠀⣿⣶⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣀⣠⡤⠴⠀⠀⣾⠃⠀⠀⠀⠀⣴⣶⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
                        + "⠀⠀⢠⡴⠏⠁⠀⠀⠀⣀⡤⠤⠒⠂⠀⠀⠀⠈⢻⡿⠟⠻⠿⣷⣻⣿⣿⣧⣶⡄⠀⠀⠛⠛⠛⠉⠉⠉⠀⠀⠀⠀⡼⣿⠀⠀⠀⠀⠀⠈⣩⣍⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
                        + "⠀⠀⠀⠀⠀⣀⣴⠶⠿⠋⠉⠉⠉⠀⠀⠑⢦⣄⡀⢳⡄⠀⠠⣾⣿⣿⣿⣿⣿⣿⣦⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠇⢻⣦⣄⠀⠀⠀⠀⠉⢻⡄⢹⣿⣏⣽⣿⣿⣿⣿⣿⣿⣿⣿\n"
                        + "⠀⠀⠀⢀⡾⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣉⣠⣷⢀⡄⣿⣟⣿⣿⣿⣿⣿⣿⣷⣤⡀⠀⠀⠀⠀⠀⣀⣠⠟⠀⢸⣿⣿⣟⡛⠲⣶⣴⣷⣿⣆⠹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
                        + "⣖⣦⣠⣾⣧⠀⠀⠀⢀⣀⣀⣤⣤⠶⣒⣛⣋⣉⣩⣤⣤⣴⡇⢸⣿⣿⡟⠁⠛⣯⠻⠮⠟⠻⠶⠶⠒⠛⠉⣼⠏⠀⢀⣾⣿⣿⣿⡇⢀⠁⠀⣅⠀⣹⣿⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
                        + "⣿⣿⣿⣿⣿⡷⠾⠿⠛⠛⠛⠛⠛⠛⠛⠋⠉⠁⢀⣼⣿⣿⡇⠀⠀⠙⠻⣦⡀⠀⠀⠀⠀⠀⠀⠀⠀⣠⡾⠃⡀⠀⣼⣿⣿⣿⣿⣿⣿⠂⠀⠀⢠⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
                        + "⣿⣿⡿⠟⠛⠂⢒⣀⣀⣠⣤⣤⣤⣤⣤⣶⣶⣶⣿⣿⣿⣿⣷⡀⠀⠀⠀⠀⠙⢦⣀⠀⠀⠀⠀⣤⣾⡿⢁⣾⡿⣼⣿⣿⣿⣿⣿⣿⣿⠀⢀⢰⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
                        + "⣶⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠿⠿⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡀⠴⣴⣦⡀⠀⠈⠙⠶⣴⣶⣿⠟⢁⣼⣿⢱⣿⣿⣿⣿⣿⣿⣿⡇⡸⢡⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
                        + "⣟⣛⣿⣽⣿⣿⣿⣶⣶⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⢸⣿⣿⣿⣶⣤⣤⣄⣸⠟⠁⣠⣞⣻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
                        + "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡀⠀⠙⢿⣿⣿⣿⣿⣧⣤⣾⣷⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
                        + "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⠀⠀⠀⠉⠻⣿⣿⣿⡻⢭⡏⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
                        + "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢨⡆⠀⠀⠀⣿⣿⣿⣿⣿⡇⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
                        + "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣏⢸⣿⠀⠀⠀⢹⣿⣿⣿⣿⣷⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
                        + "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⢰⣿⣿⣿⡟⣽⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
                        + "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡀⠀⢸⣿⣿⣛⡾⣻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n\"");
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else if (page == 4) {
            try {
                System.out.print("$$$$$$$$$$$$$$$$$$$$$$$**$$$$$ `$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ \n"
                        + "$$$$$$$$$$$$$$$$$$$$$$$We:~`#Rk''$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ \n"
                        + "$$$$$$$$$$$$$$$$$$$$$$*****i)!!<%'*$$$$$$$$$$$$$$$$$$*$$$$$$$$$$ \n"
                        + "$$$$$$$$$$$$$$$$*#)!-- -<:x!!Xt!:!:(#*$$$$$$$$$$$*\".uec(*$$$$$$$ \n"
                        + "$$$$$$$$$$$$$$6UWf. -~~!!!!Xt!!MMXX%!XX\"*$$$$$$*~.X$$TM*X.#$$$$$ \n"
                        + "$$$$$$$$$$$$$$$$`':d*.!!!Xt!!K9!!&MHt!?!X.\"$*\".x@@$TRE\"  `!.#$$$ \n"
                        + "$$$$$$$$$$$$$$$\\Ld* :!!!!??@t?!K9!X%~   `\\.:<tM@NR*E9`     ~:?$$ \n"
                        + "$$$$$$$$$$$$$$$$$\"> !!!%MXX?ME9!UR~       `!M!X*M@tTf         #$ \n"
                        + "$$$$$$$$$$$$$$$# ! '!!M!!?@Kt@TEM~  '    ~ '!!MXt%?K          `$ \n"
                        + "$$$$$$$*******F !!.!!!!!?Xt?T@@!! '         !!!??Kt!           $ \n"
                        + "$$$PXUX@WX:!<: !!!!!!!!!!%?XtT?Kf  ~ .umL '  !?!X?!>           $ \n"
                        + "!$Ft$$$9%RM!~ <!~``!!!!??!X!!KM!> '' @$#*\\   '!!!X!            $ \n"
                        + "X#:*\"#*E9!!!     : `<!!!!!!!X!!!!   '$ .     '!!~`            '$ \n"
                        + "M>K:r `\"!!!! '~     !<!!!!!!!!!!! ~ '%     :!'!!!>            9$ \n"
                        + "!\\@~    `!!! ':<@$%  !!!!!!!!!!!!    %   .dT !!!!!           :$$ \n"
                        + "!         ~`< ~!$    '~`!!!!!!! `> --->!!#\"!!~!!!<.          @$$ \n"
                        + "!.              #    :!!<!!!!!!! ':!!<!!~~. .!!>!!~.       u$$$$ \n"
                        + "!N             :.  .!!!!!!!!!!!! :`!!~`:<~~~` :!!:>~   .xd$$$$$$ \n"
                        + "U$L            `\"  !!!!!!!!!~~~! 9:  ~~  ::`~!!/:!! <9$$$$$$$$$$ \n"
                        + "$$$c          `:! /!!!!!!~`:!!!~:?!>. :  `~~`  \\`>` d$$$$$$$$$$$ \n"
                        + "$$$$k.         !~ ~~~~~`.:!!~`~x$I!=( : ::!.<!!!!! x$$$$$$$$$$$$ \n"
                        + "$$$$$$bu.     ` \\ ~!~!!!M!!~  z$$k4!``) ::.:!!!!!  #$$$$$$$$$$$$ \n"
                        + "$$$$$$$$$NWW@   ` tX. `~!?~ :@R$$!(C ().``~~~!!~ :! $$$$$$$$$$$$ \n"
                        + "$$$$$$$$$/dbW* .- M$$Ibcu x@$$$B$$$~d$$R !!!~  .'.!! #$$$$$$$$$$ \n"
                        + "$$$$$$$/W$$$$Wo#u. `#$$$R>'\"\"\"***\".z$$$$L~~  :!/ !!Xh #$$$$$$$$$ \n"
                        + "$$$$$$$$$$$$$$/@$$$Wc.\"\".sWNWWbeeW$$$$$$& <!!~!~'!X%?K:\"$$$$$$$$ \n"
                        + "$$$$$$$$$$$$Pd$$$$$$$$k N$$$$$$$$$$$$$$E? !<!!~.!!MXt*Mk'$$$$$$$ \n"
                        + "$$$$$$$$$$$$$$$$$$$$$$N $$$$$$$$$$$$$$$  '/!!` !?!t%7@$S!'$$$$$$ \n"
                        + "$$$$$$$$$$$$$$$$$$$$$$$.\"$$$$$$$$$$$$$~ :!!!~.!!X%M@NT*@9!`$$$$$ \n"
                        + "$$$$$$$$$$$$$$$$$$$$$$$$ `~$$T$$R6B$#  <!!!f !!%@UW*@69T!E!?$$$$ \n"
                        + "$$$$$$$$$$$$$$$$$$$$$$$*::..`  ``` .::!!!!! <!MXUN@$$*!Et!! $$$$ \n"
                        + "$$$$$$$$$$$$$$$$$$$$$$$ M!!!! !!!!!!!!!!!! <!!!%@UN$$@N?!!M R$$$ \n"
                        + "$$$$$$$$$$$$$$$$$$$$$$F'!!!!! !!~~~~.u+~.>:!!!t!N$$$W*TKt!!:?$$$ \n"
                        + "$$$$$$$$$$$$$$$$$$$$$$ !?!!!>' xWK:W$&d@$>~!!!!&9@$$$$B!!!!!'$$$ \n");
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else if (page == 5) {
            try {
                System.out.print("⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⠄⠀⠀⠈⠉⠉⠉⠉⠀⠀⠀⠠⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
                        + "⠀⠀⠀⠀⠀⠀⠀⡠⠊⣠⠖⠁⣠⡤⠖⠂⠀⠀⠀⠒⠦⢤⣀⠑⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
                        + "⠀⠀⠀⠀⠀⠀⡼⠀⢰⠃⠀⣾⡏⠀⢀⡠⠴⠒⠒⠦⣄⡀⠈⠓⠆⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
                        + "⠀⠀⠀⠀⢀⠌⠀⠀⠸⡀⠀⣿⠀⠠⠋⠀⠀⠀⠀⠀⠀⠉⠒⢄⠀⠀⠀⠠⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
                        + "⠀⠀⠀⢠⣾⣆⠀⠀⠀⠁⠀⠙⢀⠤⠶⠦⣄⠀⠀⠀⠀⠀⠀⠀⠈⠂⢄⣰⡄⠆⠐⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
                        + "⠀⠀⢀⣿⣿⣿⣿⣿⣦⣀⠀⢠⣧⠴⠂⠀⠘⣏⠙⠦⣍⠂⢄⣀⠀⠀⠀⠈⠁⠀⢂⡇⠀⠀⣀⣠⣴⣶⣿⣿⣿⣿⠻⣶⣄⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
                        + "⠀⠀⢸⣿⡿⣫⣷⠞⠀⠈⠁⠈⠁⠀⠀⠀⠀⠹⡄⠀⠈⠳⣦⣌⡉⠓⠶⠶⠶⠶⢻⣠⣴⣿⣿⡯⠋⠉⠙⢛⣿⣯⣤⣼⠟⠛⠋⠓⠂⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
                        + "⠀⠀⠀⠠⣿⣿⡏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠙⠻⣿⣿⣍⠀⢀⣾⣿⣿⣿⣿⣾⣿⣦⣄⣈⠉⠻⠿⢿⣄⡀⠀⠀⠀⠀⢡⡀⠀⠀⠀⠀⠀⠀⠀⠀\n"
                        + "⠀⠀⠀⠀⢠⣿⣇⣀⣀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣀⠤⠄⠀⠀⠀⠀⢩⠻⣿⣷⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⡿⠀⠀⠀⠀⠉⠻⢦⡀⠀⠀⠀⢳⠀⠀⠀⠀⠀⠀⠀⠀\n"
                        + "⠀⠀⠀⠀⢸⣿⡏⠀⠉⠛⠓⠀⠀⠀⠰⠚⠛⣩⠄⢀⣠⣤⡤⠀⠀⢸⠀⣿⣿⣿⣿⢋⣾⣿⣿⡿⠋⠁⠈⠀⠀⠀⠀⠀⠀⠀⠀⠑⢄⠱⣼⣦⣧⡀⠀⠀⠀⠀⠀⠀\n"
                        + "⠀⠀⠀⠀⠈⢿⣇⠺⠀⠀⠀⠀⠀⠀⠀⠀⠈⠠⠈⠉⠶⠒⠁⠀⠀⠀⡆⣿⣿⡿⢡⣿⠿⠋⠉⠉⠙⠂⠀⠀⠀⠐⠶⠒⠛⠉⠁⠀⠀⢷⡜⢿⣿⡇⠀⠀⠀⠀⠀⠀\n"
                        + "⠀⠀⠀⠀⠀⠀⠙⢿⣀⣈⣺⡦⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠻⣿⣿⢁⣿⠃⣤⣶⣤⣀⠀⠀⠀⠀⠀⠀⢀⡤⠖⠶⠷⣦⠀⠘⣿⣾⣿⣿⠀⠀⠀⠀⠀⠀\n"
                        + "⠀⠀⠀⠀⠀⠀⠀⢀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣶⣿⡇⣾⣿⠈⠏⠾⠯⠀⠡⠀⠀⠀⠀⠀⡻⢗⠀⠀⡀⠄⠀⠀⡗⠉⢻⣿⡄⠀⠀⠀⠀⠀\n"
                        + "⠀⠀⠀⠀⠀⠀⠀⠈⠀⠀⠀⠀⠀⠀⢀⡀⠀⠀⢀⠀⠀⠀⠀⠀⠀⣸⠉⣿⡇⡏⢹⠀⠈⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠁⠁⢸⢿⡇⠀⠀⠀⠀⠀\n"
                        + "⠀⠀⠀⠀⠀⠀⠀⠀⠐⠀⠀⠀⠀⣈⣀⠠⡄⠂⠀⠀⠀⠀⠀⠀⣼⡿⠀⠸⡇⣇⠘⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢾⢸⠇⠀⠀⠀⠀⠀\n"
                        + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠁⠠⡀⠙⠓⠈⠀⠀⠀⠀⣠⡴⠂⠀⡟⠁⠀⠀⢳⢿⡄⠀⠀⠀⠀⠀⠀⠈⠓⠒⠂⠀⠀⠠⠄⠀⠀⠀⠀⣰⣤⠞⠈⢸⠀⠀⠀⠀⠀⠀\n"
                        + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣠⣤⣶⡾⠋⠀⠀⠀⡇⠀⠀⠀⠀⢻⣿⣾⣆⠀⠀⠀⠰⢒⠒⢒⠲⠔⠈⠀⠀⠀⠀⠀⣰⣿⡿⠀⢀⡇⠀⠀⠀⠀⠀⠀\n"
                        + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⠏⠀⠀⠀⠀⠀⣇⡀⠀⠈⢂⡀⢻⣿⣿⣦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⡎⠀⢻⡇⠀⣼⠃⠀⠀⠀⠀⠀⠀\n"
                        + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⠿⠃⠀⠀⠀⠀⠀⠀⡟⠉⠓⢤⡀⢱⣿⠙⠻⣿⣿⡷⣤⣀⡀⠀⠀⢀⣀⣤⣶⡟⠟⠓⠀⡈⢷⢠⠷⡀⠀⠀⠀⠀⠀⠀\n"
                        + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡀⠀⠀⠁⠀⣾⡦⣄⢹⣿⣿⣾⣭⣍⣉⣛⠓⠢⢭⣹⢹⡗⣄⠀⠀⠸⠂⠀⢡⠀⠀⠀⠀⠀⠀\n"
                        + "⠀⠀⠀⠀⠀⠀⠀⢀⡠⠴⠶⢶⣾⠟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⠂⠀⠀⣀⣿⡇⠀⠀⠀⢹⣿⣿⣿⣿⣿⣿⣿⣿⣦⡙⡇⠈⣷⠶⠆⠀⢀⡆⠀⠀⠀⠀⠀⠀\n"
                        + "⠀⠀⠀⠀⠀⠀⡀⠁⠀⠀⠀⠘⠁⠀⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠛⣿⣷⣤⣴⡿⠈⠛⠛⠛⠛⠛⠛⠛⠛⠛⠿⣮⡀⠻⣄⠀⢠⠛⠳⡀⠀⠀⠀⠀⠀\n"
                        + "⠀⠀⠀⠀⠀⣼⣇⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣤⣤⣶⣶⣶⣾⣿⡿⠋⠒⠒⢦⡀⠀⠀⠀⠀⠀⠀⠈⠷⢱⣶⣶⡟⠳⣾⠀⢰⠁⠀⠀⠀⠀⠀\n"
                        + "⠀⠀⠀⠀⢀⣿⣿⣶⣶⣶⡶⠶⠶⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠃⠀⠀⠀⠀⠀⢱⠀⠀⠀⠀⠀⠀⠀⠀⠙⢻⣿⣿⡄⠀⠻⠛⢆⠀⠀⠀⠀⠀\n"
                        + "⠀⠀⢀⠄⠉⠀⠹⠛⠉⠀⠀⠀⠀⠀⠉⠛⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠟⠀⠀⠀⠀⠀⠀⠀⢸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠋⣿⣿⠢⢴⠀⢸⠀⠀⠀⠀⠀\n"
                        + "⢀⠔⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠙⠿⣿⣿⣿⣿⣿⣿⣿⠋⠀⠀⠀⠀⠀⠀⠀⠀⠈⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣝⣿⡡⣀⠀⣸⢷⠀⠀⠀⠀\n"
                        + "⡌⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠻⣿⣿⡟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠂⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⢼⣿⡹⠳⡇⠀⡀⠀⠀⠀\n"
                        + "⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⡋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡏⣿⣷⢠⡀⢰⢱⠀⠀⠀\n"
                        + "⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡜⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡀⣶⣿⣿⠎⡟⢦⠈⡄⠀\n");
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else if (page == 6) {
            try {
                System.out.print("⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣤⣶⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣦⣙⠿⠿⠿⢟⣫⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⢹⣿⣿⣿⣿⣿⣿⣿⣿⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
                        + "⠀⠀⠀⠀⠀⠀⢀⣤⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⢸⣿⣿⣿⡏⠉⠙⢿⣿⣿⣦⡀⠀⠀⠀⠀⠀⠀⠀\n"
                        + "⠀⠀⠀⠀⢀⣴⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⣿⡿⡍⠳⣄⡀⢀⣿⣿⣿⣿⣆⠀⠀⠀⠀⠀⠀\n"
                        + "⠀⠀⠀⢀⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⢿⣿⢿⡄⠸⡿⢄⠛⣘⢠⣼⣿⣿⣿⣿⣿⣧⡀⠀⠀⠀⠀\n"
                        + "⠀⠀⠀⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⡞⣼⡻⡄⠳⡤⠽⠾⠿⠿⠿⢛⣻⣿⣿⣿⣷⡀⠀⠀⠀\n"
                        + "⠀⠀⠀⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣾⣿⣿⣄⠙⢶⣶⣶⣶⣿⣿⣿⣿⣿⣿⣿⣧⠀⠀⠀\n"
                        + "⠀⠀⠀⠀⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠟⠛⠉⢉⣁⣀⣀⣀⣀⣀⣉⡉⠙⠛⠻⢿⣿⣿⣿⣿⣿⣯⣻⣍⡲⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡄⠀⠀\n"
                        + "⠀⢀⡀⣶⣤⣌⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠋⣁⣤⣶⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣶⣤⣈⠛⢿⣿⣿⣿⣿⣿⣷⣾⣿⣿⣿⣿⣿⡿⠟⠛⠛⠁⠀⠀\n"
                        + "⣰⣿⣿⣿⣿⣿⣿⣿⣝⢿⣿⣿⣿⣿⣿⣿⣟⣡⣶⠿⢛⣛⣉⣭⣭⣤⣤⡴⠶⠶⠶⠶⢲⣴⣤⠭⠭⡭⣟⠻⠦⣝⣿⣿⣿⣿⣿⣿⣿⣿⣿⠟⢉⣀⣠⣶⣿⣆⠀⠀\n"
                        + "⠹⣿⣿⣿⣿⣿⣿⣙⠻⣿⣮⣛⠿⣿⣿⣿⣫⣵⡶⠟⣛⣋⣭⣭⣶⣶⣶⣶⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣶⣾⣮⣽⣿⣿⣿⠿⠟⠛⠉⢀⣴⣿⣿⣿⣿⣿⣿⣶⡀\n"
                        + "⠀⠈⠙⠋⠁⠀⠈⠉⠛⠳⣭⣛⢷⣦⣸⣿⣯⣶⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡏⣿⠀⠀⠀⣀⣴⣾⣿⣿⣿⣿⡟⣿⣿⣿⣿⡇\n"
                        + "⠀⠀⠀⠀⠀⠀⢀⣠⣾⣿⣿⠿⠿⢿⣹⣿⣧⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢸⡏⣀⣴⣾⣿⣿⠿⠛⠉⠀⠀⠀⠈⠛⠛⠉⠀\n"
                        + "⠀⠀⠀⠀⢀⣴⠿⠛⠋⠁⠀⠀⠀⢀⣯⢿⣿⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⣿⠣⣟⡻⠟⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
                        + "⠀⠀⠀⠀⠉⠀⠀⠀⠀⠀⢀⣀⣴⣾⣿⠈⡿⣿⠃⠀⠀⠀⠈⠉⠛⠻⠿⣿⣿⣿⣿⣿⠿⠛⠉⠉⠀⠈⠉⠛⣿⣽⡟⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
                        + "⠀⠀⠀⠀⠀⢀⣠⣤⣶⣾⣿⣿⣿⣿⣿⣀⣼⣿⠁⠀⠀⠀⠀⠀⠀⠀⠀⣹⡟⣻⣿⡃⠀⠀⠀⠀⠀⠀⠀⠀⢹⣷⣤⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
                        + "⠀⠀⢀⣴⣾⣿⣿⣿⣿⣿⣿⣿⣿⡿⢹⣿⣿⣿⡄⠀⠀⠀⠀⠀⠀⠀⣰⣿⢣⡇⣿⣷⡀⠀⠀⠀⠀⠀⠀⠀⣼⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
                        + "⠀⠀⠟⠋⠙⠛⠻⣿⣿⣿⣿⣿⠏⠀⠈⢿⣿⣿⣿⣦⣄⣀⣀⣀⣠⣴⣿⣏⡞⢻⣸⣿⣷⣄⠀⠀⣀⣤⠴⣾⣿⣿⣿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
                        + "⠀⠀⠀⠀⠀⠀⠀⠀⠹⣿⣿⠃⠀⠀⠀⠈⢿⣿⣵⣾⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠹⣿⣿⣿⣿⣿⣿⣿⣿⣶⠾⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
                        + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣏⠀⠀⠀⠀⠀⣀⣼⣿⡛⢿⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⠟⣡⣾⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
                        + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⠀⠀⢠⣶⣿⣿⣯⣿⡇⠀⢹⣿⣿⣿⣿⣷⣤⣤⣦⣶⣿⣿⣿⣿⣿⡇⠀⣿⣿⢸⣿⣶⣤⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
                        + "⠀⠀⠀⠀⠀⠀⠀⠀⢀⣄⣠⣴⣾⣿⣟⣿⠟⠁⣿⡇⠀⣿⡿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡏⡇⢀⣿⣿⠙⢮⣛⠿⣷⣦⣄⣀⣀⣀⣠⣀⠀⠀⠀⠀⠀⠀⠀⠀\n"
                        + "⠀⠀⠀⠀⣴⣶⣶⣾⣿⣿⡿⣛⣽⠞⠋⠀⠀⠀⣿⣷⠀⣍⠇⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠉⡄⣸⣿⡿⠀⠀⠈⠙⠮⣟⠿⣿⣿⣿⣿⣿⣿⡆⠀⠀⠀⠀⠀⠀\n"
                        + "⠀⠀⠀⠀⢀⣹⣿⣿⣿⢵⡿⠋⠀⠀⠀⠀⠀⠀⢿⣿⣦⣿⡷⣄⠙⠿⣿⢹⣿⣿⢼⡿⠋⣡⣶⣳⣿⣿⣿⠃⠀⠀⠀⠀⠀⠈⠿⠬⣿⣿⣿⣿⣿⣷⠀⠀⠀⠀⠀⠀\n"
                        + "⠀⠀⠀⠀⠸⣿⣿⣿⣿⠟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠻⣿⣿⣷⣻⢿⣶⣬⣈⣉⣉⣤⣴⣿⣻⣾⣿⣿⠟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⢿⣿⣿⡿⠇⠀⠀⠀⠀⠀⠀⠀\n"
                        + "⠀⠀⠀⠀⠀⠀⠙⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠻⣿⣿⣿⣿⡇⣿⣇⣿⢹⣿⣿⣿⣿⡟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
                        + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⢿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
                        + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⢿⣿⣿⣿⣿⡿⠏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n\"");
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else if (page == 7) {
            try {
                System.out.print(
                        "+++#%@@@%@@%*+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n"
                                + "+++++*#@@@@@@#++++***###*****+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n"
                                + "+++++++*%@@@@@%##%%%%%%%%%%%%##*+++++++++++++++*+++*####****++++++++++++++++++++++++++++++\n"
                                + "+++++++++#@@%%@%%%@@%%%%%%%%%%%%#++++++++++++*#%%%%%%@%%%%%%%#++++++++++++++++++++++++++++\n"
                                + "+++++++++++*%@@@@@%%@@@@@@%%%%%%%+==+===++++#%@@@@@@@@@@@@%%%%#+++++++++++++++++++++++++++\n"
                                + "+========++*@@%%%%@@@@@@@%%%#**++++=====++#%@@@@@@@@@@%%##**+++++++++++++++=+=============\n"
                                + "==========*%@@@@@@@@@@@@@%#***++=+++===++*%@@@@@@@@@@@%#**+===============================\n"
                                + "==========*@@@@@@@@@@@@@@%###***++++++++*#@@@@@@@@@@@%%#**++==============================\n"
                                + "=========+*@@@@@@@@@@@@@@%%###***#******%@@@@@@@@@@@%########+*+==========================\n"
                                + "==========*%@@@@@@@@@@@@%%%%%%%#*##*+++*#@@@@@%%@@@%###*##*##+#+--------------------------\n"
                                + "============%@@@@@%%@%%%%%%%##**+*###++*%@@@@@%%%%%%####*+=*#*+=--------------------------\n"
                                + "============+#%@@%%%%%%%%%%%%##***##*+#%@@@@@@@@%%%##%%##*####*==============-------------\n"
                                + "%*=============+*%@%%%%%%%%%%%###*##++%@@@@@@@@@%%%##%%#*#@%#*========--------------------\n"
                                + "+#%#+=++++==++*%@@@%%%%%%%%%%%%%##**#%@@@@@@@@@%%%%%####*####+++++++++++++++====+=++++++++\n"
                                + "+*#%#+++++++#%@@@@@%%%%%%%%%@@@@%%%%@@@@@@@%%%@%%%%%%####**+++++++++++++++++++++++++++++++\n"
                                + "%@@@%#+++**###%@@@@@@%%@@@@@@@@@@@@@@@@@@%%%%%%%%%%%%%%###*+++++++++++++++++++++++++++++++\n"
                                + "###%%%+++**+=++++*#%%##+++*#@@@@@@@@@@@@@@##%%%%%%%%#*+*@%%%##***+++++++++++++++++++++++++\n"
                                + "**+****=***+=++*+=+++=+*#@@@@@@@@@@@@@@@@@#*#%%%%*++++++#@%@@@@@%*++++++++++++++++++++++++\n"
                                + "+*+**#**++*++++=++=++%@@@@@@@@@@@@@@@@@@@@###%%%%#====+++#@@%@@%%@%%#*++++++++++++++++++++\n"
                                + "+++#**+++++*+++=+++*@@@@@@@@@@@@@@@@@@@@@@##%%%###*===+===*@@@@@@@@@@@%==**+++++++++++++++\n"
                                + "*+*%#***+++**+==++*@@@@@@@@@@@@@@@@@@@@@@@%%@@@@@@@+=======+*%@@@@@@@@%++++++++#%#++++++++\n"
                                + "**#%#********++++*@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#==========*%@@@@@@%+++++**+###+==+++++\n"
                                + "%%%#########****%@%@@%%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@+-----=---=#@@@@@%*+*++++*@#%%******#%\n"
                                + "%##%%#%%%%%***%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#----------+%@%%%###**###@@@%#********\n"
                                + "%@@@%@@%%#**#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@%==--------=%%%%%###%%@@@@@%**********\n"
                                + "%%%%%%####%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@===-------*%####%#%%%%@@@#***********\n"
                                + "%%#####%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@+========+@#***********%%************\n"
                                + "#%##%%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@========*@#**************************\n"
                                + "#%%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@%%%@%=-=---=#@%***************************\n"
                                + "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#%@@@@%@@#+====+#@#****************************\n"
                                + "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@%#%@@@%%%%%##%%%%@#*****************************\n"
                                + "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@%%%@@@@@%%###%%%@@@%******************************\n"
                                + "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@%%%###%###****#%%%%@%#*****************************\n"
                                + "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#%%%%%####********#%@@%%@%****************************\n"
                                + "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@+######%%%#**######%@@%#%@%#**************************\n"
                                + "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@%*###%%%%%%#*******#@@@@###@@%#************************\n"
                                + "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@%*%%%%%%%%%#*##%%%@@@@@@@@##%@@#***********************\n"
                                + "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@%%@@@@@@@@@@@%%%#%@@@@@@@%***#@@%#*********************\n"
                                + "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@*****%@@#********************\n");
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else if (page == 8) {
            try {
                System.out.print("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
                        + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠲⣄⢀⡀⠀⠀⠀⠀⠀⠀⢀⠄⠀⣸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
                        + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡄⠈⠳⣕⢄⠀⠀⠀⠀⢠⣏⠀⠀⣹⡆⠀⠀⠀⠀⠀⠀⣀⡀⣀⠀⠀⠀⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
                        + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇⠀⠀⢸⡿⡷⣄⣤⣾⣿⣯⣿⣿⣿⣧⡀⠀⠀⢀⠀⠀⠈⣻⣿⣻⢿⣶⢿⣷⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
                        + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣽⠀⡖⣯⢳⣿⣿⣿⡟⠛⡞⣿⣽⣿⣿⣧⣼⠃⢸⣧⣷⣿⡟⣷⣯⡟⣾⢻⡞⣿⡆⠀⠀⠀⠀⢠⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
                        + "⠀⠀⠀⠀⠀⠠⠤⣀⡀⠀⠀⠀⠀⣀⣼⣧⠽⠒⠋⠉⠉⠉⠉⠉⠙⠓⠿⠿⠛⠋⠉⣄⠀⢻⣿⣿⡿⣽⣳⢯⡿⣽⢯⡿⣽⣷⠀⠀⠀⠀⢸⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
                        + "⠀⠀⠀⠀⠀⠱⡀⠀⠈⠉⢓⢾⣿⡿⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣿⡄⠀⠐⢹⣿⡷⣯⢿⡽⣯⢿⡽⣷⣿⠀⢀⣤⣷⣼⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
                        + "⠀⠀⠀⠀⠀⠀⠘⢦⠀⣠⢯⡿⠋⠀⠀⠀⠀⢀⣀⠀⠀⢀⣠⣆⣴⡄⣀⠀⢄⠂⠄⡷⠻⣦⣤⣾⣿⣽⣯⡿⣽⢿⣾⡉⢏⡿⣿⣿⣻⣿⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
                        + "⠀⠀⠀⠀⠀⠀⠀⠀⢿⣵⠟⠀⢀⡠⠔⠚⠉⣡⡈⠉⠉⠛⠻⣿⣿⣿⣷⣮⣦⣴⣾⣷⣿⠿⠿⠾⣌⣛⡟⠉⣻⣯⣿⣧⠨⣽⣿⣞⣿⠟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
                        + "⠀⠀⠀⠀⠀⠀⠀⠀⣼⠏⠀⡔⠁⠀⠀⠀⣀⢴⣹⠶⢳⣀⠀⢻⣿⣛⡹⠿⠿⣿⣭⠝⠀⠀⠀⠀⠈⠹⣷⣤⣿⣈⣽⣻⠵⠿⠿⣭⣿⣤⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
                        + "⠀⠀⠀⠀⠀⠀⣠⣼⡟⠀⣸⠀⠀⠀⠀⣦⣾⣿⣿⣿⣿⡿⠟⠚⠋⢄⡀⠀⢰⠋⢳⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠀⠈⠀⠀⠐⠋⣟⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
                        + "⢄⡀⠀⠀⠀⠈⡷⡿⠀⠀⡇⠀⠀⢠⣮⣁⣽⣿⣿⠟⠋⠁⠀⠀⢀⠞⠻⣦⢾⣦⡾⠁⠀⢠⢶⣷⡀⠀⠀⠀⠀⠀⠈⣇⠀⠀⠀⣠⡾⣼⡟⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
                        + "⠀⠉⠲⢤⣠⡴⣹⠃⠀⠀⣧⠀⢠⣾⣿⣿⣿⠏⠀⠀⠀⠱⣽⠞⢻⠦⡤⢿⣌⢿⣿⣤⠀⠈⣿⠿⣷⡄⣀⠀⠀⠀⣠⠹⣄⣠⠾⢋⡴⢇⢣⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
                        + "⠀⠀⠀⠀⠘⢷⡟⠀⠀⠀⣿⢤⠘⣿⣿⣿⡏⠀⢠⡀⠀⠀⣸⣷⢪⠝⣰⢃⡞⢮⣿⣿⡄⠀⢹⣶⣿⣿⣶⡴⢶⣿⣲⣯⣿⣿⡏⡙⣬⠼⠋⠀⠀⠀⠀⠀⠀⣠⡄⠀⠀⠀⠀⠀\n"
                        + "⠀⠀⠀⠀⠀⢸⠁⠀⠀⣸⠇⢸⣿⠏⣿⣿⡁⠀⠀⢿⣆⡾⠀⣿⣇⠹⣆⢏⡸⢆⡈⣹⣷⡀⢸⠏⢸⣿⣿⣷⣿⣿⣿⣿⣿⣾⣇⣾⢀⣶⣆⣀⣀⣀⣰⠶⡿⢱⠎⣀⠀⠀⠀⠀\n"
                        + "⠀⠀⠀⠀⠀⠸⠀⠀⢀⡏⢀⣿⣽⠲⢾⣿⡇⠀⠠⢜⢢⠟⣦⡼⢧⢋⡖⢎⡱⠮⢵⡏⡹⡇⠀⠑⣿⡿⠛⣿⣿⣿⣿⡿⣭⣟⣹⣿⣿⣾⣿⡟⢏⡱⢌⢣⡱⢣⣫⢖⢧⣋⠖⠄\n"
                        + "⠀⠀⠀⠀⢠⠀⠀⠀⡘⠁⣼⡿⠁⠀⠀⠉⠛⠦⣵⣎⣦⠕⢊⣀⣊⣜⠸⣏⡛⡛⠞⡹⠳⣷⠀⠀⠀⠁⠀⠋⠉⠉⠉⠀⠻⣧⣿⣿⣿⣿⢣⡙⣌⠲⣩⢲⡱⣣⠏⣎⣓⡬⠆⠀\n"
                        + "⠀⠀⠀⠀⠎⠀⠀⠠⠁⢠⡿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⡴⢢⡔⡿⠀⠑⠨⠙⠶⣥⣆⣑⠌⢣⡀⠀⠀⠀⢀⠀⣀⠂⣄⡾⢩⣿⣹⣻⣿⠋⠛⠛⠶⣇⢇⡚⡥⢞⡭⣚⠼⣱⡀\n"
                        + "⠀⠀⠀⠀⣽⠀⠀⠄⢐⡾⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠑⣌⠳⣼⡅⠈⡲⢦⣉⠒⡰⢈⠉⡉⢉⣽⡷⣶⣟⡛⠻⢤⡃⠊⡤⣞⣿⣿⣿⣿⣆⠀⠀⣠⠞⢾⡴⡙⡮⠆⠉⢚⠀⠃\n"
                        + "⠀⠀⠀⠀⣯⠽⠖⠖⢻⡁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠠⢌⠻⣜⢛⢦⡁⢆⡉⡙⠁⠂⠀⣴⡞⢯⡜⢧⡹⣛⣦⡀⠉⠓⠛⠶⠾⣿⣿⣿⣿⣷⣦⣽⣦⣤⠷⠋⠁⠀⠀⠀⠀⠀\n"
                        + "⢀⣠⠴⠚⠁⢠⠠⡀⠼⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠐⢌⢣⡝⡌⠦⡉⢆⡐⠄⠁⣴⣞⠳⣜⢣⠞⣥⠳⣍⠞⣵⡀⠀⠀⠀⠀⠀⠉⠙⠛⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
                        + "⠘⠻⢦⣱⣌⢢⡑⣌⠲⡿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠌⡜⡲⠜⢨⠓⠈⢄⣠⣴⢛⢧⠪⡝⣌⢧⣋⠶⡹⢌⡻⢼⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
                        + "⠀⠀⠀⠀⠈⠉⠉⠉⢉⡇⠀⠀⠀⠀⠀⠀⠀⠀⡀⢢⠑⡬⢱⢩⠟⠙⠛⠛⠒⣳⢏⠶⣙⠼⣘⠦⣍⢮⡱⣍⣾⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
                        + "⠀⠀⠀⠀⠀⠀⠀⠀⡎⠀⠀⠀⠀⠀⠀⠀⠄⢢⢅⢣⠚⡔⢣⠏⠀⠀⠀⠀⠀⣟⢎⡳⣉⠮⢥⢫⠴⣢⢓⢾⣁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
                        + "⠀⠀⠀⠀⠀⠀⠀⡸⠀⠀⠀⠀⠀⠀⢀⠇⡸⢃⠼⡘⠟⣸⠟⠀⠀⠀⠀⠀⢸⣛⡜⢣⡛⡼⣃⢟⡼⣣⢟⡻⢼⢧⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
                        + "⠀⠀⠀⠀⠀⠀⢰⠃⠀⠀⠀⠀⠠⠨⣐⢪⢑⡋⣎⣱⠽⠃⠀⠀⠀⠀⠀⠀⣿⢄⡏⢧⡙⢶⠩⡞⢴⢣⠎⣽⡷⣿⣻⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
                        + "⠀⠀⠀⠀⠀⠀⣾⠀⠀⠀⠀⠀⠀⠀⠀⠈⠈⣏⠉⣻⣆⠀⠀⠀⠀⠀⠀⠀⠈⠚⠾⠧⠾⠥⠿⠼⠾⠾⠽⠾⠓⠓⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
                        + "⠀⠀⠀⠀⠀⠀⠘⠦⣀⠀⢀⡤⠒⢦⣠⠖⠚⣟⡎⠙⡏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
                        + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠑⠒⠤⠞⠻⠦⢄⡟⠋⠒⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n");
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else if (page == 9) {
            try {
                System.out.print("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⡠⠤⠤⠒⠢⣤⠤⢤⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
                        + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠴⠋⠁⠀⠀⠀⠀⢸⢿⢦⡠⠶⠷⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
                        + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡴⠁⠀⠀⠀⣀⠤⠒⠊⠉⢪⡙⠦⣄⣀⡼⡷⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
                        + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡞⠀⠀⠀⡤⠊⠁⣀⡠⠤⠒⠚⠉⠓⠲⠶⠺⠭⠾⠧⠤⢄⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
                        + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⠀⠀⣠⠊⣀⠴⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⢠⠀⠀⠀⠀⠀⠀⠉⠲⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
                        + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡏⠀⢰⢣⠞⢁⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⡏⠀⠀⠀⠀⠀⠀⠀⠀⠈⢧⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
                        + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣿⡠⠷⠓⠊⠉⠀⠀⠀⠀⠀⠀⠀⢀⣠⠞⠁⠉⢳⣦⣤⣬⡤⠤⢄⡀⠀⡼⠃⠀⠀⠀⠀⠀⠀⠀⠀\n"
                        + "⠀⠀⠀⠀⠀⠀⠀⢀⣠⠞⠉⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⡤⠾⠾⣿⠆⠀⠀⢀⣿⣷⣦⣾⠃⠀⠀⠓⢠⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
                        + "⠀⠀⠀⠀⠀⢀⡴⠋⠀⠀⠀⠀⠀⠀⠀⢀⡠⠒⡟⢻⣾⣉⣓⣦⠀⠀⠀⠀⢸⣿⣿⣿⡟⠁⠀⠀⢀⡞⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
                        + "⠀⠀⠀⠀⢀⡞⠀⠀⠀⠀⠀⠀⠀⠠⠖⠁⠀⡰⢧⠀⠣⣸⣿⣿⣧⡀⠀⠀⠸⡽⠟⠋⣏⢢⡀⡠⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
                        + "⠀⠀⠀⠀⢸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⠞⠀⠈⣣⡀⠀⠉⠉⠀⠀⠀⠀⠀⡇⣰⠟⠉⢳⣯⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
                        + "⠀⠀⠀⠀⠈⣇⠀⠀⠀⠀⠀⠀⠀⣠⡞⠁⠀⢀⣠⢯⢳⠀⠀⠀⢀⠀⠀⣑⣾⣣⡿⣶⡐⠋⠛⡷⠛⠳⠶⣠⣀⠀⠀⠀⠀⠀⠀⠀\n"
                        + "⠀⠀⠀⠀⠀⠹⡀⠀⠀⠀⠀⠀⠀⠏⠣⢤⣐⣛⣒⣺⣾⡀⠀⠈⠙⢿⣟⣛⣿⣯⡽⠌⢁⠆⠈⠀⠤⣈⠙⢛⣳⣟⣒⣿⡞⠛⡆⠀\n"
                        + "⠀⠀⠀⠀⠀⠀⠹⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⣶⡏⠀⠀⠉⠲⣄⡀⠀⠉⠒⣻⠋⢻⣄⠹⠀⠀⠀⠀⢸⠉⠉⠁⠘⡿⢿⠎⠁⢰⠀\n"
                        + "⠀⠀⠀⠀⠀⠀⠀⠨⡷⣄⠀⠀⠀⠀⠀⣀⠼⣇⠱⣄⠀⠀⠀⠀⢨⡟⠒⠒⠋⠀⠀⢉⣷⣤⣾⣷⡴⣋⣿⠯⡳⠤⠇⠀⠀⠀⠈⡇\n"
                        + "⠀⠀⠀⠀⠀⠀⣠⠴⠣⡈⠓⠤⡠⠔⠊⠁⠀⠘⢄⠈⠲⣄⠀⢀⡞⡧⢄⡀⠀⠀⠀⡼⠻⣷⣜⣿⣿⣿⡹⡄⠘⢦⠀⠀⠀⠀⠀⢡\n"
                        + "⠀⠀⠀⠀⢀⡞⠀⠀⠀⠈⢱⠞⠀⠀⠀⠀⠀⠀⠀⠑⢄⡠⣙⣚⣇⡇⠀⠈⠳⡀⠀⡇⠀⠉⠙⠽⢿⡷⢽⡇⠀⠀⠱⡆⠈⠀⠀⡞\n"
                        + "⠀⠀⠀⠀⢸⠀⠀⠀⠀⠀⡏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠚⠭⠭⠃⠀⠀⠀⠘⡄⡇⠀⠀⠀⣤⣄⡇⠀⠀⠀⠀⢸⠃⠀⠀⢰⠁\n"
                        + "⠀⠀⠀⠀⢸⠀⠀⠀⠀⠀⢹⠀⠀⠀⠀⠀⠀⠀⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⡴⠛⡇⠀⠀⠀⣿⠴⠃⠀⠀⠀⡴⠃⠀⠀⠀⡎⠀\n"
                        + "⠀⠀⠀⠀⠈⢯⠀⠀⠀⠀⠈⣧⠀⠀⠀⠀⠀⠀⢸⡀⠀⣀⣀⣀⡀⢀⠀⣀⠼⢦⡀⡇⠀⠀⢰⠇⠀⠀⢀⡴⠋⠀⠀⠀⠀⡼⠀⠀\n"
                        + "⠀⠀⠀⠀⠀⠀⠳⣄⠀⠀⠀⠈⣆⡠⠤⠤⠤⠤⢄⣷⠋⠀⠀⠀⠉⠺⡶⠁⠀⠀⡽⠁⠀⢴⡁⠀⣠⠞⠁⠀⠀⠀⠀⠀⡼⠁⠀⠀\n"
                        + "⠀⠀⠀⠀⠀⠀⠀⣸⠳⢤⣀⣰⡇⠀⠀⠀⠀⠀⠀⠈⠑⠦⠀⠀⠀⠀⠀⠀⢠⠞⠁⠀⠀⡏⢱⠞⠁⠀⠀⠀⠀⠀⢀⡜⠁⠀⠀⠀\n"
                        + "⠀⠀⠀⠀⢀⡰⠞⠉⠧⣀⠀⠈⠙⡦⠀⠀⠀⠀⣀⡠⠤⢤⠀⠀⠀⠀⠀⡴⠃⠀⠀⠀⣸⠀⠁⠀⠀⠀⠀⠀⠀⢠⠟⠀⠀⠀⠀⠀\n"
                        + "⠀⠀⠀⡰⠋⠀⠀⠀⠀⠀⠉⠉⠉⣇⢀⣤⠒⠉⠀⠀⠀⠀⢣⠀⠀⢠⠎⠀⠀⠀⠀⢀⡏⠀⠀⠀⠀⠀⠀⢀⡴⠋⠀⠀⠀⠀⠀⠀\n"
                        + "⠀⢀⡞⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠙⠚⢧⠀⠀⠀⠀⠀⠀⢣⣠⠋⠀⠀⠀⠀⠀⡸⠢⣀⠀⠀⠀⢀⡰⠊⠀⠀⠀⠀⠀⠀⠀⠀\n"
                        + "⠀⡼⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣧⠀⠀⠀⠀⠀⡼⠃⠀⠀⠀⠀⠀⢠⠇⠀⠈⠙⠲⠖⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
                        + "⢰⠃⠀⠀⠀⠀⠀⠀⠀⠀⠈⠳⢤⣀⣀⣀⣰⣃⣳⣄⣀⣀⣈⠁⠀⠀⠀⠀⠀⢠⠎⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
                        + "⢸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠑⠒⠦⢤⣠⠏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n");
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else if (page == 10) {
            try {
                System.out.print("\n" + "..............................:?5GG#&B5J7!:.......\n"
                        + "...........................:75B&@&#BBB#&&&#P7.....\n"
                        + "..........................:P@&&#?^:::::^7YG#Y?:...\n"
                        + ".........................~B&&&#~ ..........:.^J:..\n"
                        + ".........................5@&&&&~..............!7..\n"
                        + "........................:B&&&#!....:!JJ?~....:!J..\n"
                        + ".......................:7G&&&P~~~~!G&@@&&5^^?#&&G7\n"
                        + "........:^!?JJYJJ?7!~^.J!.~B@P~~~~J@&&&&@#^^G@&&@&\n"
                        + "...:~7YPB&&&&&&&&&&&&#GG~..^BJ.. ..?G##BP~..~G&&#?\n"
                        + ".75B&&&&&&&&&&&&&&&&&&&&B^. Y@BP?:...:^:. ....?J:.\n"
                        + "J&&&&&&&&&&&&&&&&&&&&&&&&#JJ#&&&@J ....:!?!!^.7^..\n"
                        + "&&&B##&&&&&&&&&&&&&&&&&&&&B!G@&&&#Y!^755J!7?P7!...\n"
                        + "5P5^^^Y&&&&&&&&&&&&&&&&&&&&P^Y#@&&&&#@5 ... PP....\n"
                        + " Y7^7~^5&&&&&&&&&&&&&&&&&&&&? ^YB&&&&&B!^:^7&?....\n"
                        + ".7&~...^#&&&&&&&&&&&&&&&&&&&P...:75B&&@&###&G:....\n"
                        + ".~?..::.Y&&&&&&&##&##&&&&&&&B~.^^..:!7?YPJ?7:.....\n"
                        + ":?~:.^~^~#&###&##&#&#####&&#5YJ7~:!7J7^J:^~^:.....\n"
                        + "..^7.:^^!&&##&&&&&&&&&&##GY~^~!?J?!~7~7?~!!!~~~^..\n"
                        + "...7!...?G&&&&#BBGPGGY?~^..^^..:J^..??7~:...::^~7~\n"
                        + "...:?^~!!!?!~^^^~7YGB~!?:..77!.?~...7J..:~!!~~^^^:\n"
                        + "....:~~^^:^JJ5G#&&@#P!:~J.^7.!7?....7:.!J^........\n"
                        + "......:^~?7^PBPYJJ7^....?.7^..J!..:!7~~77~~~^.....\n"
                        + "..~JJ?7!~J~ :7 :!:...:^!?~J^..~~^J?~::..^~J~~:....\n"
                        + "..P?.....~7.7~:7..:~7?Y!~!~!..~?J7^:^~7J~^J?~7~...\n"
                        + "..!P......7J~.?^~7!~:.!~:^~7!:?J777?J!!?~^^^:!~...\n"
                        + "...YY.....?G:^Y7!:.....^!~.~55Y7!~JJ~~7~^~~~7!:...\n"
                        + "....P?...~?7^?7..........!!.5G?^:~!~77~^^^~!7!J:..\n"
                        + "....:Y?.:??^5?........:~~~!7Y7:^~!?J7!~~~~!!G!^:..\n"
                        + "......7Y57^Y5.........~Y7?7!~^~~!??~!?7~7:..P!....\n"
                        + ".......:7?JG~ ........?~::::^^~~^^!~..~!7!.JY.....\n"
                        + ".........:~??7~^:....~!.........:?!~...:^?57......\n"
                        + ".............^!7??7!!?::.....::^7?7~!7?7?!:.......\n"
                        + ".................:^~!!77777???7?Y7J?7!~:..........\n"
                        + "...........:^^^^^^^^^^^^^^~^^~~~~~^^^^............\n");
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }



    private static void println(String str) {
        System.out.println(str);
    }

    private static void print(String str) {
        System.out.print(str);
    }
}
