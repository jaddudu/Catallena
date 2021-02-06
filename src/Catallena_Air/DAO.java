package Catallena_Air;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DAO {
	// �ʵ忡 ����

	private Connection conn = null;
	private PreparedStatement psmt = null;
	private ResultSet rs = null;

	departure_Calender dc = new departure_Calender();

	// �޼ҵ� �̸��� : getConnection()
	// ����Ÿ���� ����
	// �Ű����� ����
	private void getConnection() {

		// 1.����̹� �ε�
		// 2.Connection ��ü ����
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

		// �޼ҵ� �̸��� getClose();
		// ����Ÿ�� ����
		// �Ű����� ����

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

	// ȸ�������ϴ� �޼��� ����
	// �޼ҵ��̸��� Insert()
	// ����Ÿ���� int -> �ٲ� ���� ����
	// �Ű����� String id, String pw, String name, int age
	// �޼ҵ� �ȿ� ������ �۵��ϴ� JDBC�ڵ带 ���ֽø� �˴ϴ�.
	// ��, getConnection() ���, getClose()��� ����ؼ� �ڵ� �ۼ�

	public int Insert_join(VO vo) {
		getConnection();
		// 1.����̹��ε� 2.Connection ��ü ���� ��!

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

	

	// Login �޼ҵ� ����
	// String name ���� -> �α��� ������ ȸ���� �̸��� �����ּ���!
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

	// Delete �޼��� ����
	// int ���·� ���� -> ������ ���� ���� ������ �����ּ���!

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

	// select �޼��� ����
	// ���� Ÿ���� ����?

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
