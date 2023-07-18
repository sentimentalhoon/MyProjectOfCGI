package ex_23_07_14.JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class MemberTable {
    private static MemberTable _instance = null;

    public static MemberTable getInstance() throws SQLException {
        if (_instance == null) {
            synchronized (MemberTable.class) {
                if (_instance == null) {
                    _instance = new MemberTable();
                }
            }
        }
        return _instance;
    }

    public boolean insertData(String id, String pw, String name, int age) {
        PreparedStatement pstm = null;
        Connection connection = null;
        try {
            connection = DAO.getInstance().getConnection();
            pstm = connection.prepareStatement("INSERT INTO aimember values (?, ?, ? , ?)");
            pstm.setString(1, id);
            pstm.setString(2, pw);
            pstm.setString(3, name);
            pstm.setInt(4, age);
            pstm.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            close(pstm, connection);
        }
    }

    public boolean updateData(String id, String pw, String name, int age) {
        PreparedStatement pstm = null;
        Connection connection = null;
        try {
            connection = DAO.getInstance().getConnection();
            pstm = connection.prepareStatement("UPDATE INTO aimember values (?, ?, ? , ?)");
            pstm.setString(1, id);
            pstm.setString(2, pw);
            pstm.setString(3, name);
            pstm.setInt(4, age);
            pstm.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            close(pstm, connection);
        }
    }

    public boolean deleteMember(String id, String pw) {
        PreparedStatement pstm = null;
        Connection connection = null;
        try {
            connection = DAO.getInstance().getConnection();
            pstm = connection.prepareStatement("Delete aimember Where id=?");
            pstm.setString(1, id);
            pstm.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            close(pstm, connection);
        }
    }

    public Member isLogin(String id, String pw) {
        ResultSet rs = null;
        PreparedStatement pstm = null;
        Connection connection = null;
        Member member = new Member();
        try {
            connection = DAO.getInstance().getConnection();
            pstm = connection.prepareStatement("Select * From aimember Where id=? AND pw=? Limit 1");
            pstm.setString(1, id);
            pstm.setString(2, pw);
            rs = pstm.executeQuery();
            while (rs.next()) {
                member.setId(rs.getString("id"));
                member.setName(rs.getString("name"));
                member.setAge(rs.getInt("age"));
                member.setIsValid(true);
            }
            return member;
        } catch (SQLException e) {
            e.printStackTrace();
            return member;
        } finally {
            close(rs, pstm, connection);
        }
    }

    public ArrayList<Member> getMemberList(){
        ResultSet rs = null;
        PreparedStatement pstm = null;
        Connection connection = null;
        ArrayList<Member> arrayListMember = new ArrayList<Member>();        
        try {
            connection = DAO.getInstance().getConnection();
            pstm = connection.prepareStatement("Select * From aimember");
            rs = pstm.executeQuery();
            while (rs.next()) {
                Member member = new Member();
                member.setId(rs.getString("id"));
                member.setName(rs.getString("name"));
                member.setAge(rs.getInt("age"));
                member.setIsValid(true);
                arrayListMember.add(member);
            }
            return arrayListMember;
        } catch (SQLException e) {
            e.printStackTrace();
            return arrayListMember;
        } finally {
            close(rs, pstm, connection);
        }
    }

    public SQLException close(Connection con) {
        try {
            if (con != null) {
                con.close();
            }
        } catch (SQLException e) {
            return e;
        }
        return null;
    }

    public SQLException close(Statement ps) {
        try {
            if (ps != null) {
                ps.close();
            }
        } catch (SQLException e) {
            return e;
        }
        return null;
    }

    public SQLException close(ResultSet rs) {
        try {
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException e) {
            return e;
        }
        return null;
    }

    public void close(Statement pstm, Connection con) {
        close(pstm);
        close(con);
    }

    public void close(ResultSet rs, Statement pstm, Connection con) {
        close(rs);
        close(pstm);
        close(con);
    }
}
