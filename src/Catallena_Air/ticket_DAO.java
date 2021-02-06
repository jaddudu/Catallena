package Catallena_Air;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ticket_DAO {
	private Connection conn = null;
	private PreparedStatement psmt1 = null;
	private PreparedStatement psmt5 = null;
	private PreparedStatement psmt6 = null;
	private ResultSet rs = null;
	// 메소드 이름 : getConnection()
	// 리턴타입 x
	// 매개변수 없음
	
	private void getConnection() {
		
		// 1. 드라이버 로딩
		// 2. Connection 객체 생성
		
		String url ="jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String pw = "hr";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, pw);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		
		
	}
	private void  getClose() {
		try {
			if (rs != null) {
				rs.close();
			}
			if (psmt1 != null) {
				psmt1.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
}
	
	

	
	public String SelectName(ticket_VO vo) {
		String resultName = "";
		getConnection();
		String sql1 = "Select last_name,first_name from ticket_reservation where reserved_number = ?";
		try {
			
			psmt1 = conn.prepareStatement(sql1);
			
			psmt1.setString(1, vo.getReserved_number());
			rs = psmt1.executeQuery();
			if(rs.next()) {
				resultName = rs.getString(1);
				resultName = resultName+rs.getString(2);
				
				//System.out.println("이름 : " + resultName);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return resultName;
	}
	public String SelectDate(ticket_VO vo) {
		String resultDate = "";
		getConnection();
		String sql1 = "Select Departure_date from ticket_reservation where reserved_number = ?";
		try {
			
			psmt1 = conn.prepareStatement(sql1);
			
			psmt1.setString(1, vo.getReserved_number());
			rs = psmt1.executeQuery();
			if(rs.next()) {
				resultDate = rs.getString(1);
				
				//System.out.println("이름 : " + resultName);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return resultDate;
	}
	
	
	public String SelectFlight(ticket_VO vo) {
		String resultFlight = "";
		getConnection();
		String sql1 = "Select flight from ticket_reservation where reserved_number = ?";
		try {
			
			psmt1 = conn.prepareStatement(sql1);
			
			psmt1.setString(1, vo.getReserved_number());
			rs = psmt1.executeQuery();
			if(rs.next()) {
				resultFlight = rs.getString(1);
				
				//System.out.println("이름 : " + resultName);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return resultFlight;
	}
	
	public String SelectDeparture(ticket_VO vo) {
		String resultDeparture = "";
		getConnection();
		String sql1 = "Select r.departure from route r, ticket_reservation tr where r.flight = tr.flight AND reserved_number = ? ";
		try {
			
			psmt1 = conn.prepareStatement(sql1);
			
			psmt1.setString(1, vo.getReserved_number());
			rs = psmt1.executeQuery();
			if(rs.next()) {
				resultDeparture = rs.getString(1);
				
				//System.out.println("이름 : " + resultName);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return resultDeparture;
	}
	
	public String SelectDestination(ticket_VO vo) {
		String resultDestination = "";
		getConnection();
		String sql1 = "Select r.destination from route r, ticket_reservation tr where r.flight = tr.flight AND reserved_number = ? ";
		try {
			
			psmt1 = conn.prepareStatement(sql1);
			
			psmt1.setString(1, vo.getReserved_number());
			rs = psmt1.executeQuery();
			if(rs.next()) {
				resultDestination = rs.getString(1);
				
				//System.out.println("이름 : " + resultName);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return resultDestination;
	}
	
	public String SelectDeparture_time(ticket_VO vo) {
		String resultDeparture_time = "";
		getConnection();
		String sql1 = "Select r.departure_time from route r, ticket_reservation tr where r.flight = tr.flight AND reserved_number = ? ";
		try {
			
			psmt1 = conn.prepareStatement(sql1);
			
			psmt1.setString(1, vo.getReserved_number());
			rs = psmt1.executeQuery();
			if(rs.next()) {
				resultDeparture_time = rs.getString(1);
				
				//System.out.println("이름 : " + resultName);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return resultDeparture_time;
	}
	
	public String SelectArrival_time(ticket_VO vo) {
		String resultArrival_time = "";
		getConnection();
		String sql1 = "Select r.arrival_time from route r, ticket_reservation tr where r.flight = tr.flight AND reserved_number = ? ";
		try {
			
			psmt1 = conn.prepareStatement(sql1);
			
			psmt1.setString(1, vo.getReserved_number());
			rs = psmt1.executeQuery();
			if(rs.next()) {
				resultArrival_time = rs.getString(1);
				
				//System.out.println("이름 : " + resultName);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return resultArrival_time;
	}
	
	
	public String SelectSeat(ticket_VO vo) {
		String resultSeat = "";
		getConnection();
		String sql1 = "Select seat_number from ticket_reservation where reserved_number = ?";
		try {
			
			psmt1 = conn.prepareStatement(sql1);
			
			psmt1.setString(1, vo.getReserved_number());
			rs = psmt1.executeQuery();
			if(rs.next()) {
				resultSeat = rs.getString(1);
				//System.out.println("이름 : " + resultName);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return resultSeat;
	}
	public int ticket_Delete(ticket_VO vo) {

		int cnt = 0;
		getConnection();
		try {
			
			String sql6 = "update re_manage set cancelled_date = sysdate where reserved_number =? ";
			
			psmt6 = conn.prepareStatement(sql6);
			psmt6.setString(1,vo.getReserved_number());
			cnt += psmt6.executeUpdate();
			
			String sql5 = "update re_seat set status = 'available' where seat_number = (select seat_number from ticket_reservation where reserved_number = ?) and flight = (select flight from ticket_reservation where reserved_number =?) ";
			psmt5 = conn.prepareStatement(sql5);
			//psmt5.setString(1,vo.getSeat());
			psmt5.setString(1,vo.getReserved_number());
			psmt5.setString(2,vo.getReserved_number());
			cnt += psmt5.executeUpdate();

			
			String sql = "Delete from ticket_reservation where reserved_number = ?";
			psmt1 = conn.prepareStatement(sql);
			psmt1.setString(1, vo.getReserved_number());
			cnt = psmt1.executeUpdate();
			
			
			
			

			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			getClose();
		}

		return cnt;

	}

	
	
	
	
}
