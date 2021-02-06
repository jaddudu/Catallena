package Catallena_Air;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class QQatar_cancel_confirmed {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QQatar_cancel_confirmed window = new QQatar_cancel_confirmed();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public QQatar_cancel_confirmed() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 480, 700);
		frame.getContentPane().setLayout(null);
		
		JLabel lbl_confirmed = new JLabel("");
		lbl_confirmed.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				
			}
		});
		lbl_confirmed.setBounds(0, 0, 464, 661);
		frame.getContentPane().add(lbl_confirmed);
		
		Image image = new ImageIcon("../Catallena/src/CatallenaImage/cancel_confirmed.png").getImage().getScaledInstance(470, 690, Image.SCALE_SMOOTH);
		lbl_confirmed.setIcon(new ImageIcon(image));
		
		JButton btn_corrcet = new JButton("");
		btn_corrcet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				frame.dispose();
				
			}
		});
		btn_corrcet.setBounds(252, 576, 150, 28);
		frame.getContentPane().add(btn_corrcet);
		btn_corrcet.setOpaque(true);
	    btn_corrcet.setBorderPainted(false);
	    btn_corrcet.setContentAreaFilled(false);
	}

}




