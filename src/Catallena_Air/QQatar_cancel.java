package Catallena_Air;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class QQatar_cancel {

	private JFrame frame;
	private JTextField tf_cancel;
	private JButton btn_cancel;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QQatar_cancel window = new QQatar_cancel();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public QQatar_cancel() {
		initialize();
	}

	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 920, 500);
		frame.getContentPane().setLayout(null);
		
		
		
		
		
		tf_cancel = new JTextField();
		tf_cancel.setBounds(383, 215, 204, 24);
		frame.getContentPane().add(tf_cancel);
		tf_cancel.setColumns(10);
		tf_cancel.setBorder(null);
		
		
		
		btn_cancel = new JButton("");
		btn_cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String reserved_number = tf_cancel.getText();				
				ticket_VO vo = new ticket_VO(reserved_number);
				ticket_DAO dao = new ticket_DAO();
				int cnt = dao.ticket_Delete(vo);
				if(cnt>0) {
					QQatar_cancel_confirmed.main(null);	
				}else {
					JOptionPane.showMessageDialog(null, "취소가 안됐습니다");
				}
				
				
			}
		});
		btn_cancel.setBounds(635, 384, 175, 40);
		frame.getContentPane().add(btn_cancel);
		btn_cancel.setOpaque(true);
	    btn_cancel.setBorderPainted(false);
	    btn_cancel.setContentAreaFilled(false);
	    JLabel lbl_cancel = new JLabel("New label");
		lbl_cancel.setBounds(0, 0, 904, 461);
		frame.getContentPane().add(lbl_cancel);
		
		Image image = new ImageIcon("../Catallena/src/CatallenaImage/cancel_re.png").getImage().getScaledInstance(900, 470, Image.SCALE_SMOOTH);
		lbl_cancel.setIcon(new ImageIcon(image));
	    
	}
}
