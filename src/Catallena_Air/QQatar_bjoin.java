package Catallena_Air;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class QQatar_bjoin {

	private JFrame frame;
	private JTextField tf_last_name;
	private JTextField tf_first_name;
	private JTextField tf_phone;
	private JTextField tf_passport;
	DAO dao = new DAO();
	private JButton btnNewButton;
	static String passport = "";
	static String name = "";

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QQatar_bjoin window = new QQatar_bjoin();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	
	public QQatar_bjoin() {
		initialize();
	}

	private void initialize() {

		frame = new JFrame();
		frame.setBounds(100, 100, 411, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 495, 670);
		frame.getContentPane().add(panel);

		Image image_join = new ImageIcon("../Catallena/src/CatallenaImage/bsign_up.png").getImage().getScaledInstance(400, 670, Image.SCALE_SMOOTH);
		panel.setLayout(null);

		tf_last_name = new JTextField();
		tf_last_name.setBounds(180, 223, 122, 26);
		panel.add(tf_last_name);
		tf_last_name.setColumns(10);
		tf_last_name.setBorder(null);

		tf_first_name = new JTextField();
		tf_first_name.setColumns(10);
		tf_first_name.setBounds(180, 284, 122, 26);
		panel.add(tf_first_name);
		tf_first_name.setBorder(null);

		tf_phone = new JTextField();
		tf_phone.setColumns(10);
		tf_phone.setBounds(180, 408, 122, 26);
		panel.add(tf_phone);
		tf_phone.setBorder(null);

		tf_passport = new JTextField();
		tf_passport.setColumns(10);
		tf_passport.setBounds(180, 474, 122, 26);
		panel.add(tf_passport);
		tf_passport.setBorder(null);

		JComboBox cmb_year = new JComboBox();
		cmb_year.setBounds(128, 342, 77, 26);
		panel.add(cmb_year);
		DefaultComboBoxModel<Integer> year = new DefaultComboBoxModel<Integer>();
		for (int i = 2020; i >= 1900; i--) {
			year.addElement(i);

		}
		cmb_year.setModel(year);

		JComboBox cmb_month = new JComboBox();
		cmb_month.setBounds(217, 342, 77, 26);
		panel.add(cmb_month);
		DefaultComboBoxModel<Integer> month = new DefaultComboBoxModel<Integer>();
		for (int i = 1; i <= 12; i++) {
			month.addElement(i);
		}
		cmb_month.setModel(month);

		JComboBox cmb_day = new JComboBox();
		cmb_day.setBounds(306, 342, 77, 26);
		panel.add(cmb_day);
		DefaultComboBoxModel<Integer> day = new DefaultComboBoxModel<Integer>();
		for (int i = 1; i <= 31; i++) {
			day.addElement(i);
		}
		cmb_day.setModel(day);

		JButton btn_bjoin = new JButton("");
		btn_bjoin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String first_name = tf_first_name.getText();
				String last_name = tf_last_name.getText();
				name = last_name + first_name;
				String birth = cmb_year.getSelectedItem().toString() + "-" + cmb_month.getSelectedItem().toString()
						+ "-" + cmb_day.getSelectedItem().toString();
				String phone = tf_phone.getText();
				passport = tf_passport.getText();
				VO vo = new VO(first_name, last_name, birth, phone, passport);
				int cnt = dao.Insert_join(vo);

				// 회원가입 성공시 기존 창(frame) 닫고 메인 창으로 이동!
				if (cnt > 0) {
					frame.dispose();
					JOptionPane.showMessageDialog(null, "등록완료!", "비회원가입", JOptionPane.INFORMATION_MESSAGE);
					

				} else {
					// 경고창(부모컴포넌트, 출력하고 싶은 메세지, 경고창의 타이틀, 아이콘!)
					frame.dispose();
					JOptionPane.showMessageDialog(null, "등록실패!", "비회원가입 경고창", JOptionPane.ERROR_MESSAGE);
				}
				QQatar_Bseat.main(null);

			}
		});

		btn_bjoin.setBounds(144, 560, 122, 37);
		panel.add(btn_bjoin);
		btn_bjoin.setOpaque(true);
		btn_bjoin.setBorderPainted(false);
		btn_bjoin.setContentAreaFilled(false);

		JLabel lbl_bjoin = new JLabel("");
		lbl_bjoin.setBounds(0, 0, 495, 670);
		panel.add(lbl_bjoin);
		lbl_bjoin.setIcon(new ImageIcon(image_join));
	}

}
