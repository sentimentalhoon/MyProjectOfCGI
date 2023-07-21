package Game.GameDAO;

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
        java.sql.Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        ArrayList<CinemaField> cinemasList = null;
        try {            
            cinemasList = new ArrayList<CinemaField>();
            con = DBFactory.getInstance().getConnection();
            pstm = con.prepareStatement("SELECT * FROM cinema");
            rs = pstm.executeQuery();
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
            _log.warning("could not check existing charname:" + e.getMessage());
        } finally {
            SQLUtil.close(rs, pstm, con);
        }
        return cinemasList;
    }
}
