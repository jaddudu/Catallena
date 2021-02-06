package Catallena_Air;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class QQatar_join {

	private JFrame frame;
	private JTextField tf_id;
	private JTextField tf_lastname;
	private JTextField tf_firstname;
	private JTextField tf_phone;
	private JTextField tf_passport;
	private JPasswordField pf_password;
	private DAO dao = new DAO();
	private JComboBox cmb_birth;
	private JComboBox cmb_month;
	private JComboBox cmb_day;
	static String name = "";
	static String id = "";
	static String passport = "";
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QQatar_join window = new QQatar_join();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public QQatar_join() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 411, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 395, 670);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		//String url = this.getClass().getResource("").getPath();
		Image image_join = new ImageIcon("../Catallena/src/CatallenaImage/sign_up.png").getImage().getScaledInstance(400, 670, Image.SCALE_SMOOTH);

		tf_id = new JTextField();
		tf_id.setBounds(177, 202, 110, 27);
		panel.add(tf_id);
		tf_id.setColumns(10);
		tf_id.setBorder(null);

		pf_password = new JPasswordField();
		pf_password.setBounds(177, 261, 110, 25);
		panel.add(pf_password);
		pf_password.setBorder(null);

		tf_lastname = new JTextField();
		tf_lastname.setColumns(10);
		tf_lastname.setBounds(177, 313, 110, 25);
		panel.add(tf_lastname);
		tf_lastname.setBorder(null);

		tf_firstname = new JTextField();
		tf_firstname.setColumns(10);
		tf_firstname.setBounds(177, 365, 110, 25);
		panel.add(tf_firstname);
		tf_firstname.setBorder(null);

		tf_phone = new JTextField();
		tf_phone.setColumns(10);
		tf_phone.setBounds(177, 471, 110, 25);
		panel.add(tf_phone);
		tf_phone.setBorder(null);

		tf_passport = new JTextField();
		tf_passport.setColumns(10);
		tf_passport.setBounds(177, 526, 110, 25);
		panel.add(tf_passport);
		tf_passport.setBorder(null);
		
		 cmb_birth = new JComboBox();
	      cmb_birth.setBounds(136, 417, 80, 27);
	      panel.add(cmb_birth);
	      DefaultComboBoxModel<Integer> year = new DefaultComboBoxModel<Integer>();
	      for(int i = 2020; i>= 1900; i--) {
	         year.addElement(i);
	         
	      }
	      cmb_birth.setModel(year);

	      cmb_month = new JComboBox();
	      cmb_month.setBounds(223, 417, 70, 27);
	      panel.add(cmb_month);
	      DefaultComboBoxModel<Integer> month = new DefaultComboBoxModel<Integer>();
	      for(int i=1; i<=12; i++) {
	         month.addElement(i);
	      }
	      cmb_month.setModel(month);

	      
	      cmb_day = new JComboBox();
	      cmb_day.setBounds(305, 418, 71, 25);
	      panel.add(cmb_day);
	      DefaultComboBoxModel<Integer> day = new DefaultComboBoxModel<Integer>();
	      for(int i=1; i<=31; i++) {
	         day.addElement(i);
	      }
	      cmb_day.setModel(day);

		JButton btn_success = new JButton("");
		btn_success.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				id = tf_id.getText();
				String pw = pf_password.getText();
				String first_name = tf_firstname.getText();
				String last_name = tf_lastname.getText();
				name = last_name+first_name;
				String birth = cmb_birth.getSelectedItem().toString()+"-"+cmb_month.getSelectedItem().toString()+"-"+cmb_day.getSelectedItem().toString();
				// 콤보박스에서 글자 가져오는 방법 콤보박스이름.getSelectedItem().toString()
				String phone = tf_phone.getText();
				 passport = tf_passport.getText();
				VO vo = new VO(id, pw, first_name, last_name, birth, phone, passport);
				int cnt = dao.Insert_join(vo);
				
				// 회원가입 성공시 기존 창(frame) 닫고 메인 창으로 이동!
				if (cnt > 0) {
					frame.dispose();
					JOptionPane.showMessageDialog(null, "회원가입 성공!", "회원가입", JOptionPane.INFORMATION_MESSAGE);
					
					
				} else {
					// 경고창(부모컴포넌트, 출력하고 싶은 메세지, 경고창의 타이틀, 아이콘!)
					frame.dispose();
					JOptionPane.showMessageDialog(null, "회원가입 실패!", "회원가입 경고창", JOptionPane.ERROR_MESSAGE);
				}

			}
		});
		btn_success.setBounds(136, 593, 123, 39);
		panel.add(btn_success);
		btn_success.setOpaque(true);
	    btn_success.setBorderPainted(false);
	    btn_success.setContentAreaFilled(false);

		JLabel lbl_join = new JLabel("");
		lbl_join.setBounds(0, 0, 459, 670);
		panel.add(lbl_join);
		lbl_join.setIcon(new ImageIcon(image_join));
	}
	public String name() {
		return name;
	}
}
