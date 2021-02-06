package Catallena_Air;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class QQatar_reservation_check {

	private JFrame frame;
	private JTextField txt_reservation_number;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QQatar_reservation_check window = new QQatar_reservation_check();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public QQatar_reservation_check() {
		initialize();
	}


	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100,925,445);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Image reservation_number = new ImageIcon("../Catallena/src/CatallenaImage/reservation_check.png").getImage().getScaledInstance(925, 445, Image.SCALE_SMOOTH);
		
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 909, 406);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lbl_reservation_check = new JLabel("");
		lbl_reservation_check.setBounds(0, 0, 909, 406);
		panel.add(lbl_reservation_check);
		lbl_reservation_check.setIcon(new ImageIcon(reservation_number));
		
		txt_reservation_number = new JTextField();
		txt_reservation_number.setBounds(388, 185, 219, 23);
		panel.add(txt_reservation_number);
		txt_reservation_number.setColumns(10);
		txt_reservation_number.setBorder(null);
		
		
		JButton btn_check = new JButton("");
		btn_check.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String reserved_number = txt_reservation_number.getText();
				new QQatar_ticket_reservation(reserved_number);
			}
		});
		btn_check.setBounds(623, 322, 193, 42);
		panel.add(btn_check);
		btn_check.setOpaque(true);
	    btn_check.setBorderPainted(false);
	    btn_check.setContentAreaFilled(false);
		
		
	}
}
