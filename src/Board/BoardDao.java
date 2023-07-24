/**
 * board 테이블의 crud를 담당하는 부분이다.
 * 
 */
package Board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

import DAO.DBFactory;
import Utils.SQLUtil;

public class BoardDao {
    private static Logger _log = Logger.getLogger(BoardDao.class.getName());
    
    public BoardDao(){

    }

    /**
     * board 의 정보를 읽어온다.
     * 15개의 게시글을 읽어오게 설정하였으며
     * 내림차순으로 읽어온다.
     * @return
     */
    public static HashMap<Integer, Board> load() {
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        HashMap<Integer, Board> boardList = new LinkedHashMap<Integer, Board>();
        try {
            con = DBFactory.getInstance().getConnection();
            String sqlstr = "SELECT * FROM (SELECT * FROM BOARD ORDER BY NO DESC) WHERE ROWNUM <= 15";
            pstm = con.prepareStatement(sqlstr);
            rs = pstm.executeQuery();
            while (rs.next()) {
                Board board = new Board();
                board.setUid(rs.getInt("no"));
                board.setWriter(rs.getString("writer"));
                board.setTitle(rs.getString("title"));
                board.setContent(rs.getString("content").split("\n"));
                board.setRegdate(rs.getString("regdate"));
                board.setHits(rs.getInt("hits"));
                boardList.put(board.getUid(), board);
            }
        } catch (SQLException e) {
            _log.log(Level.SEVERE, e.getLocalizedMessage(), e);
        } finally {
            SQLUtil.close(rs);
            SQLUtil.close(pstm);
            SQLUtil.close(con);
        }
        return boardList;
    }
    
    /**
     * board 의 글을 uid 에 해당하는 글을 읽어온다.
     * @param uid
     * @return
     */
    public static String readUidString(int uid) {
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        try {
            con = DBFactory.getInstance().getConnection();
            pstm = con.prepareStatement("SELECT contents FROM board WHERE uid=?");
			pstm.setInt(1, uid);
			rs = pstm.executeQuery();
            if (rs.next()) {
                return rs.getString("contents");
            }
        } catch (SQLException e) {
            _log.log(Level.SEVERE, e.getLocalizedMessage(), e);
        } finally {
            SQLUtil.close(rs);
            SQLUtil.close(pstm);
            SQLUtil.close(con);
        }
        return null;
    }
}
