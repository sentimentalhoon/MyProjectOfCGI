package Game.GameDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import DAO.DBFactory;

/*
*목적 : Blackjack db 토탈 점수 update 및 값 가져오기.
*개정이력 : 박기원, 2023.07.23, 
*최신 수정한 것 : 
*1) update select 문 구현
*/

public class BlackjackDataTable {
	


	// 총점 UPDATE
	public void saveTotalPoint(String ID, int totalPoint) {
		try (Connection con = DBFactory.getInstance().getConnection();
				PreparedStatement pstm = con.prepareStatement("UPDATE BLACKJACK SET TOTALPOINT = ? WHERE ID = ?");) {
			pstm.setInt(1, totalPoint);
			pstm.setString(2, ID);
			pstm.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

//총점 불러오기
	public int getTotalPoint(String ID) {
		int totalPoint = 0;
		try (Connection con = DBFactory.getInstance().getConnection();
				PreparedStatement pstm = con.prepareStatement("SELECT TOTALPOINT FROM BLACKJACK WHERE ID = ?");) {
			pstm.setString(1, ID); // SHOW 값을 조회
			ResultSet rs = pstm.executeQuery();
			if (rs.next()) {
				totalPoint = rs.getInt("TOTALPOINT");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return totalPoint;
	}

}
