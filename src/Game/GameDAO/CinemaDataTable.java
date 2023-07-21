package Game.GameDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Logger;

import DAO.DBFactory;
import Game.Dain.CinemaField;
import Utils.SQLUtil;

public class CinemaDataTable {
    private static Logger _log = Logger.getLogger(CinemaDataTable.class.getName());

    private String path;

    private CinemaDataTable(String path) {
        this.path = path;
    }

    private static CinemaDataTable _instance = null;

    public static CinemaDataTable getInstance(String path) {
        if (_instance == null) {
            _instance = new CinemaDataTable(path);
        }
        return _instance;
    }

    public ArrayList<CinemaField> getCinemaList() {

        ArrayList<CinemaField> cinemasList = null;
        try (Connection con = DBFactory.getInstance().getConnection();
                PreparedStatement pstm = con.prepareStatement("SELECT * FROM cinema");
                ResultSet rs = pstm.executeQuery()) {
            cinemasList = new ArrayList<CinemaField>();
            while (rs.next()) {
                CinemaField cinemaField = new CinemaField();
                cinemaField.setMovieNameKR(rs.getString("name_kr"));
                cinemaField.setMovieNameENG(rs.getString("name_eng"));
                cinemaField.setYear(rs.getInt("year"));
                cinemaField.setMovieSongName(rs.getString("song_name"));
                cinemaField.setMovieSongArtist(rs.getString("song_artist"));
                cinemaField.setMovieSongFileName(path + rs.getString("file_name"));
                cinemasList.add(cinemaField);
            }
            return cinemasList;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cinemasList;
    }
}
