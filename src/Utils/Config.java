package Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class Config {
    private static final Logger _log = Logger.getLogger(Config.class.getName());
    /** Server control */
    public static String DB_DRIVER;
    public static String DB_URL;
    public static String DB_LOGIN;
    public static String DB_PASSWORD;
    /** Configuration files */
    public static final String SERVER_CONFIG_FILE = "./config/server.properties";

    public static void load() {
        _log.info("loading server config");
        // server.properties
        try {
            Properties serverSettings = new Properties();
            InputStream is = new FileInputStream(new File(SERVER_CONFIG_FILE));
            serverSettings.load(is);
            is.close();

            DB_DRIVER = serverSettings.getProperty("Driver",
                    "com.mysql.jdbc.Driver");

            DB_URL = serverSettings
                    .getProperty("URL",
                            "jdbc:mysql://localhost/services?useUnicode=true&characterEncoding=euckr");

            DB_LOGIN = serverSettings.getProperty("Login", "root");

            DB_PASSWORD = serverSettings.getProperty("Password", "");

        } catch (Exception e) {
            _log.log(Level.SEVERE, e.getLocalizedMessage(), e);
            throw new Error("Failed to Load " + SERVER_CONFIG_FILE + " File.");
        }
    }

    private Config() {
    }
}