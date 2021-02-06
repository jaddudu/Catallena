package Catallena_Air;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class QQatar_Special_LogMain {

	private JFrame frame;
	private JPasswordField psw_login;
	private JTextField txt_id;
	DAO dao = new DAO();
	static String id = "";
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QQatar_Special_LogMain window = new QQatar_Special_LogMain();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public QQatar_Special_LogMain() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 881, 605);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel_login = new JPanel();
		panel_login.setBounds(0, 0, 881, 605);
		frame.getContentPane().add(panel_login);

		Image image = new ImageIcon(
				"../Catallena/src/CatallenaImage/login.png").getImage()
						.getScaledInstance(881, 605, Image.SCALE_SMOOTH);
		Image image_plane = new ImageIcon(
				"../Catallena/src/CatallenaImage/plane_image.gif")
						.getImage().getScaledInstance(240, 240, Image.SCALE_DEFAULT);
		panel_login.setLayout(null);

		psw_login = new JPasswordField();
		psw_login.setBounds(532, 328, 271, 26);
		panel_login.add(psw_login);
		psw_login.setBorder(null);

		txt_id = new JTextField();
		txt_id.setBounds(532, 274, 271, 26);
		panel_login.add(txt_id);
		txt_id.setColumns(10);
		txt_id.setBorder(null);

		JLabel lbl_login = new JLabel("");
		lbl_login.setBounds(0, 0, 881, 605);
		panel_login.add(lbl_login);
		lbl_login.setIcon(new ImageIcon(image));

		JButton btn_bjoin = new JButton("");
		btn_bjoin.setBounds(588, 394, 120, 30);
		btn_bjoin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				QQatar_special_bjoin.main(null);

			}
		});
		panel_login.add(btn_bjoin);
		btn_bjoin.setOpaque(false);

		JButton btn_join = new JButton("");
		btn_join.setBounds(461, 391, 92, 31);
		btn_join.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				QQatar_join.main(null);
			}
		});
		panel_login.add(btn_join);
		btn_join.setOpaque(false);

		JButton btn_login = new JButton("");
		btn_login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				id = txt_id.getText();
				String pw = psw_login.getText();
				VO vo = new VO(id, pw);
				String name = dao.login(vo);
				if (!name.equals("")) {
					
					new QQatar_special_Login(name);
				}
				else {
						JOptionPane.showMessageDialog(null, "로그인 실패!", "로그인", JOptionPane.ERROR_MESSAGE);
				}

			}
		});
		btn_login.setBounds(746, 393, 75, 33);
		panel_login.add(btn_login);
		btn_login.setOpaque(false);

		JPanel panel = new JPanel();
		panel.setBounds(94, 195, 240, 240);
		panel_login.add(panel);
		panel.setLayout(null);

		JLabel lbl_plan_image = new JLabel("");
		lbl_plan_image.setBounds(0, 0, 240, 240);
		panel.add(lbl_plan_image);
		lbl_plan_image.setIcon(new ImageIcon(image_plane));

	}
}
