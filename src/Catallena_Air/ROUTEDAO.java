package Catallena_Air;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ROUTEDAO {
	private Connection conn = null;
	private PreparedStatement psmt = null;
	private ResultSet rs = null;
	departure_Calender dc = new departure_Calender();
	QQatar_Main main = new QQatar_Main();

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

	public String[][] route_price(VO vo) {
		String[][] route = new String[5][4];
		String departure = vo.getDeparture();
		String destination = vo.getDestination();
		String day = vo.getday();

		getConnection();
		String sql = "Select departure_time, arrival_time, flight, price from route "
				+ "where departure = ? and destination = ? and day_of_week like '%" + day + "%' order by price";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, departure);
			psmt.setString(2, destination);
			rs = psmt.executeQuery();
			int i = 0;
			while (rs.next()) {
				route[i][0] = rs.getString(1);
				route[i][1] = rs.getString(2);
				route[i][2] = rs.getString(3);
				route[i++][3] = rs.getString(4);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			getClose();
		}
		return route;

	}
	
	public String[][] route_price_comback(VO vo) {
		String[][] route = new String[5][4];
		String departure = vo.getDeparture();
		String destination = vo.getDestination();
		String day = vo.getday();

		getConnection();
		String sql = "Select departure_time, arrival_time, flight, price from route "
				+ "where departure = ? and destination = ? and day_of_week like '%"+day+"%' order by price";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, destination);
			psmt.setString(2, departure);
			rs = psmt.executeQuery();
			int i = 0;
			while (rs.next()) {
				route[i][0] = rs.getString(1);
				route[i][1] = rs.getString(2);
				route[i][2] = rs.getString(3);
				route[i++][3] = rs.getString(4);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			getClose();
		}
		return route;

	}

}
