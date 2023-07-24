package Game.GameDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;

import DAO.DBFactory;

/*
*목적 : Blackjack db 토탈 점수 update 및 값 가져오기.
*개정이력 : 박기원, 2023.07.24, 
*최신 수정한 것 : 
*1) 테이블 ACCOUNT 에 TOTAL POINT 추가 및  기본 값 DEFAULT = 1000 <- 배팅 금액
*2) 테이블
*
*/

public class BlackjackDataTable {
	
	
	// 배팅 금액 UPDATE
	public void saveTotalPoint(String ID, int totalPoint) {
		try (Connection con = DBFactory.getInstance().getConnection();
				PreparedStatement pstm = con.prepareStatement("UPDATE ACCOUNTS SET TOTALPOINT = ? WHERE ID = ?");) {
			pstm.setInt(1, totalPoint);
			pstm.setString(2, ID);
			pstm.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	//배팅 금액 불러오기
	public int getTotalPoint(String ID) {
		int totalPoint=0;
		try (Connection con = DBFactory.getInstance().getConnection();
				PreparedStatement pstm = con.prepareStatement("SELECT TOTALPOINT FROM ACCOUNTS WHERE ID = ?");) 
		{
			pstm.setString(1, ID); 
			ResultSet rs = pstm.executeQuery();

			while (rs.next())
			{	
				totalPoint = rs.getInt("TOTALPOINT");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return totalPoint;
	}

}
