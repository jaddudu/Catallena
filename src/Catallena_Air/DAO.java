package Catallena_Air;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DAO {
	// 필드에 생성

	private Connection conn = null;
	private PreparedStatement psmt = null;
	private ResultSet rs = null;

	departure_Calender dc = new departure_Calender();

	// 메소드 이름은 : getConnection()
	// 리턴타입은 없음
	// 매개변수 없음
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

	// 회원가입하는 메서드 생성
	// 메소드이름은 Insert()
	// 리턴타입은 int -> 바뀐 행의 갯수
	// 매개변수 String id, String pw, String name, int age
	// 메소드 안에 실제로 작동하는 JDBC코드를 써주시면 됩니다.
	// 단, getConnection() 기능, getClose()기능 사용해서 코드 작성

	public int Insert_join(VO vo) {
		getConnection();
		// 1.드라이버로딩 2.Connection 객체 생성 끝!

		int cnt = 0;

		try {
			String sql = "insert into air_member values(?,?,?,?,?,?,?)";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getId());
			psmt.setString(2, vo.getPw());
			psmt.setString(3, vo.getFirst_name());
			psmt.setString(4, vo.getLast_name());
			psmt.setString(5, vo.getBirth());
			psmt.setString(6, vo.getPhone());
			psmt.setString(7, vo.getPassport());
			cnt = psmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			getClose();
		}

		return cnt;

	}

	

	// Login 메소드 생성
	// String name 리턴 -> 로그인 성공한 회원의 이름을 돌려주세요!
	public String login(VO vo) {
		String name = "";
		getConnection();
		String sql = "Select last_name from air_member where id = ? and pw = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getId());
			psmt.setString(2, vo.getPw());
			
			rs = psmt.executeQuery();

			if (rs.next()) {
				name = rs.getString(1);
	
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			getClose();
		}
		return name;

	}

	// Delete 메서드 생성
	// int 형태로 리턴 -> 영향을 받은 행의 갯수를 돌려주세요!

	public int Delete(VO vo) {

		int cnt = 0;
		getConnection();
		try {
			String sql = "Delete from member2 where id = ? and pw = ? and name = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getId());
			psmt.setString(2, vo.getPw());
			psmt.setString(3, vo.getName());

			cnt = psmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			getClose();
		}

		return cnt;

	}

	// select 메서드 생성
	// 리턴 타입이 뭘까?

	public ArrayList<VO> Select() {

		ArrayList<VO> resultList = new ArrayList<VO>();

		getConnection();

		try {
			String sql = "Select * from member2";
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();

			while (rs.next()) {
				// ID PW NAME AGE
				String id = rs.getString(1);
				String pw = rs.getString(2);
				String name = rs.getString(3);
				int age = rs.getInt(4);
				VO vo = new VO(id, pw, name, age);
				resultList.add(vo);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			getClose();
		}
		return resultList;
	}

	public ArrayList<String> cmb_select_destination(VO vo) {
		ArrayList<String> destination = new ArrayList<String>();

		getConnection();

		String sql = "Select destination from route where departure = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getDeparture());

			rs = psmt.executeQuery();
			while (rs.next()) {

				String result = rs.getString(1);

				destination.add(result);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			getClose();
		}
		return destination;

	}

}
