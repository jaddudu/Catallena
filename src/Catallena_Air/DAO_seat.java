package Catallena_Air;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAO_seat {

	private Connection conn = null;
	private PreparedStatement psmt = null;
	private PreparedStatement psmt1 = null;
	private PreparedStatement psmt2 = null;
	private PreparedStatement psmt3 = null;
	private PreparedStatement psmt4 = null;
	private PreparedStatement psmt5 = null;
	private PreparedStatement psmt6 = null;
	private PreparedStatement psmt7 = null;
	private ResultSet rs = null;
	QQatar_bjoin bj = new QQatar_bjoin();

	private void getConnection() {

		// 1.드라이버 로딩
		// 2.Connection 객체 생성
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String password = "hr";

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 메소드 이름은 getClose();
		// 리턴타입 없음
		// 매개변수 없음

	}

	private void getClose() {
		try {
			if (rs != null)
				rs.close();
			if (psmt != null)
				psmt.close();
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public int Insert_ticket_Breservation(VO_seat vo) {
		getConnection();
		// 1.드라이버로딩 2.Connection 객체 생성 끝!
		String status_1 = "";
		int cnt = 0;

		
		String value1 = vo.getFlight();
		String value2 = vo.getSeat();
		
		
		
		try {
			System.out.println();
			String sql7 = "select status from re_seat where flight = ? and seat_number = ?";
			psmt7 = conn.prepareStatement(sql7);
			psmt7.setString(1, value1);
			psmt7.setString(2, value2);
			rs = psmt7.executeQuery();
			
			while (rs.next()) {

				status_1 = rs.getString("status");
				

			}

			if (status_1.equals("available")) {
				String sql = "insert into ticket_reservation values(?,?,?,?,sysdate,null,null,null,null)";
				psmt = conn.prepareStatement(sql);
				psmt.setString(1, vo.getRandom());
				psmt.setString(2, vo.getDate());
				psmt.setString(3, vo.getSeat());
				psmt.setString(4, vo.getFlight());
				cnt = psmt.executeUpdate();
				// 비회원일 때
				String sql1 = "update ticket_reservation set last_name = (select last_name from air_member where passport = ?)";
				psmt1 = conn.prepareStatement(sql1);
				psmt1.setString(1, vo.getPassport());
				cnt += psmt1.executeUpdate();
				String sql2 = "update ticket_reservation set first_name = (select first_name from air_member where passport = ?)";
				psmt2 = conn.prepareStatement(sql2);
				psmt2.setString(1, vo.getPassport());
				cnt += psmt2.executeUpdate();
				String sql3 = "update ticket_reservation set birth = (select birth from air_member where passport = ?)";
				psmt3 = conn.prepareStatement(sql3);
				psmt3.setString(1, vo.getPassport());
				cnt += psmt3.executeUpdate();
				String sql4 = "update ticket_reservation set passport = (select passport from air_member where passport = ?)";
				psmt4 = conn.prepareStatement(sql4);
				psmt4.setString(1, vo.getPassport());
				cnt += psmt4.executeUpdate();
				String sql5 = "update re_seat set status = 'rented' where seat_number = ? and flight = ?";
				psmt5 = conn.prepareStatement(sql5);
				psmt5.setString(1, vo.getSeat());
				psmt5.setString(2, vo.getFlight());
				cnt += psmt5.executeUpdate();
				String sql6 = "insert into re_manage values(null,?,sysdate)";
				psmt6 = conn.prepareStatement(sql6);
				psmt6.setString(1, vo.getRandom());
				cnt += psmt6.executeUpdate();
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			getClose();
		}

		return cnt;

	}

	public int Insert_ticket_reservation(VO_seat vo) {
		getConnection();
		// 1.드라이버로딩 2.Connection 객체 생성 끝!

		int cnt = 0;

		
		String status_2 ="";
		try {
			
			System.out.println();
			String sql7 = "select status from re_seat where flight = ? and seat_number = ?";
			psmt7 = conn.prepareStatement(sql7);
			psmt7.setString(1, vo.getFlight());
			psmt7.setString(2, vo.getSeat());
			rs = psmt7.executeQuery();
			
			while (rs.next()) {

				status_2 = rs.getString("status");
				

			}
			if(status_2.equals("available")) {
				String sql = "insert into ticket_reservation values(?,?,?,?,sysdate,null,null,null,null)";
				psmt = conn.prepareStatement(sql);
				psmt.setString(1, vo.getRandom());
				psmt.setString(2, vo.getDate());
				psmt.setString(3, vo.getSeat());
				psmt.setString(4, vo.getFlight());
				cnt = psmt.executeUpdate();
				// 회원일 때
				String sql1 = "update ticket_reservation set last_name = (select last_name from air_member where id = ?)";
				psmt1 = conn.prepareStatement(sql1);
				psmt1.setString(1, vo.getId());
				cnt += psmt1.executeUpdate();
				String sql2 = "update ticket_reservation set first_name = (select first_name from air_member where id = ?)";
				psmt2 = conn.prepareStatement(sql2);
				psmt2.setString(1, vo.getId());
				cnt += psmt2.executeUpdate();
				String sql3 = "update ticket_reservation set birth = (select birth from air_member where id = ?)";
				psmt3 = conn.prepareStatement(sql3);
				psmt3.setString(1, vo.getId());
				cnt += psmt3.executeUpdate();
				String sql4 = "update ticket_reservation set passport = (select passport from air_member where id = ?)";
				psmt4 = conn.prepareStatement(sql4);
				psmt4.setString(1, vo.getId());
				cnt += psmt4.executeUpdate();
				String sql5 = "update re_seat set status = 'rented' where seat_number = ? and flight = ?";
				psmt5 = conn.prepareStatement(sql5);
				psmt5.setString(1, vo.getSeat());
				psmt5.setString(2, vo.getFlight());
				cnt += psmt5.executeUpdate();
				String sql6 = "insert into re_manage values(null,?,sysdate)";
				psmt6 = conn.prepareStatement(sql6);
				psmt6.setString(1, vo.getRandom());
				cnt += psmt6.executeUpdate();
			}
			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			getClose();
		}

		return cnt;

	}

}
