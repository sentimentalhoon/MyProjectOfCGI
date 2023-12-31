package Game.BH.MatchTheSong;

public class MatchTheSongAscii {

    private static MatchTheSongAscii _instance = null;

    public static MatchTheSongAscii getInstance() {
        if (_instance == null) {
            _instance = new MatchTheSongAscii();
        }
        return _instance;
    }

    public MatchTheSongAscii() {
    }

    public String[] getOAscii(int random) {
        String[] stringArray = null;
        if (random == 0) {
            String str = "██████  ████████ ███████     ██████  ██    ██ ███    ██  █████  ███    ███ ██ ████████ ███████,"
                    + "██   ██    ██    ██          ██   ██  ██  ██  ████   ██ ██   ██ ████  ████ ██    ██    ██,"
                    + "██████     ██    ███████     ██   ██   ████   ██ ██  ██ ███████ ██ ████ ██ ██    ██    █████,"
                    + "██   ██    ██         ██     ██   ██    ██    ██  ██ ██ ██   ██ ██  ██  ██ ██    ██    ██,"
                    + "██████     ██    ███████     ██████     ██    ██   ████ ██   ██ ██      ██ ██    ██    ███████";
            return str.split(",");
        } else if (random == 1) {
            String str = "██████  ████████ ███████     ███████ ██████  ██████  ██ ███    ██  ██████  ██████   █████  ██    ██ ,"
                    + "██   ██    ██    ██          ██      ██   ██ ██   ██ ██ ████   ██ ██       ██   ██ ██   ██  ██  ██  ,"
                    + "██████     ██    ███████     ███████ ██████  ██████  ██ ██ ██  ██ ██   ███ ██   ██ ███████   ████   ,"
                    + "██   ██    ██         ██          ██ ██      ██   ██ ██ ██  ██ ██ ██    ██ ██   ██ ██   ██    ██    ,"
                    + "██████     ██    ███████     ███████ ██      ██   ██ ██ ██   ████  ██████  ██████  ██   ██    ██    ";

            return str.split(",");
        } else if (random == 2) {
            String str = "███    ██ ███████ ██     ██      ██ ███████  █████  ███    ██ ███████     ██████  ██ ████████ ████████  ██████  ,"
                    + "████   ██ ██      ██     ██      ██ ██      ██   ██ ████   ██ ██          ██   ██ ██    ██       ██    ██    ██ ,"
                    + "██ ██  ██ █████   ██  █  ██      ██ █████   ███████ ██ ██  ██ ███████     ██   ██ ██    ██       ██    ██    ██ ,"
                    + "██  ██ ██ ██      ██ ███ ██ ██   ██ ██      ██   ██ ██  ██ ██      ██     ██   ██ ██    ██       ██    ██    ██ ,"
                    + "██   ████ ███████  ███ ███   █████  ███████ ██   ██ ██   ████ ███████     ██████  ██    ██       ██     ██████  ";
            return str.split(",");
        } else if (random == 3) {
            String str = "███████ ████████  █████  ██    ██  ██████     ████████ ███████ ██████  ██████  ██    ██ ██████  ███████  █████  ██████  ,"
                    + "██         ██    ██   ██  ██  ██  ██             ██    ██      ██   ██ ██   ██  ██  ██  ██   ██ ██      ██   ██ ██   ██ ,"
                    + "███████    ██    ███████   ████   ██             ██    █████   ██   ██ ██   ██   ████   ██████  █████   ███████ ██████  ,"
                    + "     ██    ██    ██   ██    ██    ██             ██    ██      ██   ██ ██   ██    ██    ██   ██ ██      ██   ██ ██   ██ ,"
                    + "███████    ██    ██   ██    ██     ██████        ██    ███████ ██████  ██████     ██    ██████  ███████ ██   ██ ██   ██ ";

            return str.split(",");
        } else if (random == 4) {
            String str = "██████  ███████ ██    ██     ███████  █████  ████████ ██   ██ ███████ ██████  ,"
                    + "██   ██ ██       ██  ██      ██      ██   ██    ██    ██   ██ ██      ██   ██ ,"
                    + "██████  ███████   ████       █████   ███████    ██    ███████ █████   ██████  ,"
                    + "██           ██    ██        ██      ██   ██    ██    ██   ██ ██      ██   ██ ,"
                    + "██      ███████    ██        ██      ██   ██    ██    ██   ██ ███████ ██   ██ ";

            return str.split(",");
        } else if (random == 5) {
            String str = "██ ██████  ██      ███████     ████████  ██████  ███    ███ ██████   ██████  ██    ██ ,"
                    + "██ ██   ██ ██      ██             ██    ██    ██ ████  ████ ██   ██ ██    ██  ██  ██  ,"
                    + "██ ██   ██ ██      █████          ██    ██    ██ ██ ████ ██ ██████  ██    ██   ████   ,"
                    + "██ ██   ██ ██      ██             ██    ██    ██ ██  ██  ██ ██   ██ ██    ██    ██    ,"
                    + "██ ██████  ███████ ███████        ██     ██████  ██      ██ ██████   ██████     ██    ";

            return str.split(",");
        } else if (random == 6) {
            String str = "██ ██    ██ ███████     ██       ██████  ██    ██ ███████ ██████  ██ ██    ██ ███████ ,"
                    + "██ ██    ██ ██          ██      ██    ██ ██    ██ ██      ██   ██ ██ ██    ██ ██      ,"
                    + "██ ██    ██ █████       ██      ██    ██ ██    ██ █████   ██   ██ ██ ██    ██ █████   ,"
                    + "██  ██  ██  ██          ██      ██    ██  ██  ██  ██      ██   ██ ██  ██  ██  ██      ,"
                    + "██   ████   ███████     ███████  ██████    ████   ███████ ██████  ██   ████   ███████ ";

            return str.split(",");
        } else if (random == 7) {
            String str = "██ ██    ██     ███████ ██████  ██ ██████   █████  ██    ██ ,"
                    + "██ ██    ██     ██      ██   ██ ██ ██   ██ ██   ██  ██  ██  ,"
                    + "██ ██    ██     █████   ██████  ██ ██   ██ ███████   ████   ,"
                    + "██ ██    ██     ██      ██   ██ ██ ██   ██ ██   ██    ██    ,"
                    + "██  ██████      ██      ██   ██ ██ ██████  ██   ██    ██    ";

            return str.split(",");
        } else if (random == 8) {
            String str = "██    ██  ██████  ██    ██ ███    ██ ██   ██  █████      ███████ ██    ██ ███████ ███    ██ ████████ ██   ██  ██████  ██████  ██ ███████  ██████  ███    ██ ,"
                    + "██  ██  ██    ██ ██    ██ ████   ██ ██   ██ ██   ██     ██      ██    ██ ██      ████   ██    ██    ██   ██ ██    ██ ██   ██ ██    ███  ██    ██ ████   ██ ,"
                    + " ████   ██    ██ ██    ██ ██ ██  ██ ███████ ███████     █████   ██    ██ █████   ██ ██  ██    ██    ███████ ██    ██ ██████  ██   ███   ██    ██ ██ ██  ██ ,"
                    + "  ██    ██    ██ ██    ██ ██  ██ ██ ██   ██ ██   ██     ██       ██  ██  ██      ██  ██ ██    ██    ██   ██ ██    ██ ██   ██ ██  ███    ██    ██ ██  ██ ██ ,"
                    + "  ██     ██████   ██████  ██   ████ ██   ██ ██   ██     ███████   ████   ███████ ██   ████    ██    ██   ██  ██████  ██   ██ ██ ███████  ██████  ██   ████ ";

            return str.split(",");
        } else if (random == 9) {
            String str = "██       ██████  ██    ██ ███████  █████  ██      ██     ██  █████  ██    ██ ███████ ██████  ██    ██ ███    ██  █████  ██     ██  █████  ██    ██ ,"
                    + "██      ██    ██ ██    ██ ██      ██   ██ ██      ██     ██ ██   ██  ██  ██  ██      ██   ██ ██    ██ ████   ██ ██   ██ ██     ██ ██   ██  ██  ██  ,"
                    + "██      ██    ██ ██    ██ █████   ███████ ██      ██  █  ██ ███████   ████   ███████ ██████  ██    ██ ██ ██  ██ ███████ ██  █  ██ ███████   ████   ,"
                    + "██      ██    ██  ██  ██  ██      ██   ██ ██      ██ ███ ██ ██   ██    ██         ██ ██   ██ ██    ██ ██  ██ ██ ██   ██ ██ ███ ██ ██   ██    ██    ,"
                    + "███████  ██████    ████   ███████ ██   ██ ███████  ███ ███  ██   ██    ██    ███████ ██   ██  ██████  ██   ████ ██   ██  ███ ███  ██   ██    ██    ";

            return str.split(",");
        } else if (random == 10) {
            String str = "     ██ ██ ███████ ██    ██     ███████ ██       ██████  ██     ██ ███████ ██████  ,"
                    + "     ██ ██ ██      ██    ██     ██      ██      ██    ██ ██     ██ ██      ██   ██ ,"
                    + "     ██ ██ ███████ ██    ██     █████   ██      ██    ██ ██  █  ██ █████   ██████  ,"
                    + "██   ██ ██      ██ ██    ██     ██      ██      ██    ██ ██ ███ ██ ██      ██   ██ ,"
                    + " █████  ██ ███████  ██████      ██      ███████  ██████   ███ ███  ███████ ██   ██ ";

            return str.split(",");
        } else if (random == 11) {
            String str = "███    ██ ███████ ██     ██      ██ ███████  █████  ███    ██ ███████     ██████  ██ ████████ ████████  ██████  ,"
                    + "████   ██ ██      ██     ██      ██ ██      ██   ██ ████   ██ ██          ██   ██ ██    ██       ██    ██    ██ ,"
                    + "██ ██  ██ █████   ██  █  ██      ██ █████   ███████ ██ ██  ██ ███████     ██   ██ ██    ██       ██    ██    ██ ,"
                    + "██  ██ ██ ██      ██ ███ ██ ██   ██ ██      ██   ██ ██  ██ ██      ██     ██   ██ ██    ██       ██    ██    ██ ,"
                    + "██   ████ ███████  ███ ███   █████  ███████ ██   ██ ██   ████ ███████     ██████  ██    ██       ██     ██████  ";
            return str.split(",");
        } else if (random == 12) {
            String str = "██   ██ ██ ██   ██ ███████ ██    ██     ██████   ██████  ███████ ███████     ██████  ██       ██████  ███████ ███████  ██████  ███    ███ ,"
                    + "██   ██ ██ ██  ██  ██       ██  ██      ██   ██ ██    ██ ██      ██          ██   ██ ██      ██    ██ ██      ██      ██    ██ ████  ████ ,"
                    + "███████ ██ █████   █████     ████       ██████  ██    ██ ███████ █████       ██████  ██      ██    ██ ███████ ███████ ██    ██ ██ ████ ██ ,"
                    + "██   ██ ██ ██  ██  ██         ██        ██   ██ ██    ██      ██ ██          ██   ██ ██      ██    ██      ██      ██ ██    ██ ██  ██  ██ ,"
                    + "██   ██ ██ ██   ██ ███████    ██        ██   ██  ██████  ███████ ███████     ██████  ███████  ██████  ███████ ███████  ██████  ██      ██ ";

            return str.split(",");
        }
        return stringArray;
    }

}
