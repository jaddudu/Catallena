package Catallena_Air;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class QQatar_reservation_number {

	private JFrame frame;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QQatar_reservation_number window = new QQatar_reservation_number();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public QQatar_reservation_number() {
		initialize();
	}


	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 548);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		Image reserved_number_image = new ImageIcon("../Catallena/src/CatallenaImage/reserved_num.png").getImage().getScaledInstance(434, 509, Image.SCALE_SMOOTH);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 509);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lbl_ticket_reservation_number = new JLabel("");
		lbl_ticket_reservation_number.setBounds(0, 0, 434, 509);
		panel.add(lbl_ticket_reservation_number);
		lbl_ticket_reservation_number.setIcon(new ImageIcon(reserved_number_image));
		
		JLabel lbl_reserved_number = new JLabel("");
		lbl_reserved_number.setBounds(132, 234, 213, 25);
		panel.add(lbl_reserved_number);
		
		
		JButton btn_check = new JButton("New button");
		btn_check.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				
			}
		});
		btn_check.setBounds(234, 431, 152, 32);
		panel.add(btn_check);
		btn_check.setOpaque(true);
		btn_check.setBorderPainted(false);
		btn_check.setContentAreaFilled(false);
	}
}
