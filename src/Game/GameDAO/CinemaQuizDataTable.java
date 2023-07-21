package Game.GameDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import DAO.DBFactory;

public class CinemaQuizDataTable {
    private static Logger _log = Logger.getLogger(CinemaQuizDataTable.class.getName());

    private CinemaQuizDataTable() {
    }

    private static CinemaQuizDataTable _instance = null;

    public static CinemaQuizDataTable getInstance() {
        if (_instance == null) {
            _instance = new CinemaQuizDataTable();
        }
        return _instance;
    }

    public boolean insertQuizResult(final String name, final String ox, final int q_no) {
        String sqlstr = "INSERT INTO accounts (ID, OX, Q_NO) VALUES (?, ?, ?)";
        try (Connection con = DBFactory.getInstance().getConnection();
                PreparedStatement pstm = con.prepareStatement(sqlstr)) {
            pstm.setString(1, name);
            pstm.setString(1, ox);
            pstm.setInt(1, q_no);
            pstm.executeUpdate();
            return true;
        } catch (SQLException e) {
            _log.log(Level.SEVERE, e.getLocalizedMessage(), e);
        }
        return false;
    }
}