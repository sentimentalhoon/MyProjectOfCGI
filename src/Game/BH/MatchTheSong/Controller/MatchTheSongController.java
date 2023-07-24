package Game.BH.MatchTheSong.Controller;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.google.gson.Gson;

public class MatchTheSongController {
    private MatchTheSongController() {
    }

    private MatchTheSongField matchTheSongField;
    
    public MatchTheSongField getMatchTheSongField() {
        return matchTheSongField;
    }

    public void setMatchTheSongField(MatchTheSongField matchTheSongField) {
        this.matchTheSongField = matchTheSongField;
    }

    private static MatchTheSongController _instance = null;

    public static MatchTheSongController getInstance() {
        if (_instance == null) {
            _instance = new MatchTheSongController();
        }
        return _instance;
    }

    public MatchTheSongField getSong() {
        try {
            try (Reader reader = Files.newBufferedReader(Paths.get("data\\audiobook\\audiobook.json"))) {
                MatchTheSongField matchTheSongField = null;
                if (reader != null) {
                    Gson gson = new Gson();
                    matchTheSongField = gson.fromJson(reader, MatchTheSongField.class);
                }
                return matchTheSongField;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
