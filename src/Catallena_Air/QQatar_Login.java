package Catallena_Air;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class QQatar_Login {

	private JFrame frame;

	public QQatar_Login(String name) {
		initialize(name);
		frame.setVisible(true);// 창을 보여준다. 꼭해야한다!!!
	}

	
	private void initialize(String name) {
		frame = new JFrame();
		frame.setBounds(100, 100, 540, 850);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Image image = new ImageIcon(
				"../Catallena/src/CatallenaImage/login_up.png").getImage()
						.getScaledInstance(530, 850, Image.SCALE_SMOOTH);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 10, 850, 850);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(153, 411, 121, 28);
		panel.add(panel_1);
		panel_1.setLayout(null);
		panel_1.setBackground(Color.white);
		
		
		JLabel lbl_name = new JLabel("");
		lbl_name.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_name.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		lbl_name.setBounds(0, 0, 121, 28);
		panel_1.add(lbl_name);
		lbl_name.setText(name);
		lbl_name.setOpaque(false);
		
		
		JLabel label_name = new JLabel("");
		label_name.setBounds(0, 0, 524, 850);
		label_name.setHorizontalAlignment(SwingConstants.LEFT);
		panel.add(label_name);
		label_name.setIcon(new ImageIcon(image));
		
		JButton btn_log_check = new JButton("");
		btn_log_check.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				QQatar_seat.main(null);
			}
		});
		btn_log_check.setBounds(270, 757, 198, 50);
		panel.add(btn_log_check);
		btn_log_check.setOpaque(true);
		btn_log_check.setBorderPainted(false);
		btn_log_check.setContentAreaFilled(false);
		
		
		
	}
}
