package Catallena_Air;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class QQatarRoutePrice {

	private JFrame frame;
	private JTable table;
	QQatar_Main main = new QQatar_Main();
	departure_Calender dc = new departure_Calender();
	ROUTEDAO dao = new ROUTEDAO();
	private JTable table_2;
	
	static String flight = "";
	String departure_time ="";
	String arrival_time = "";

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {

			public void run() {
				try {
					QQatarRoutePrice window = new QQatarRoutePrice();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	public QQatarRoutePrice() {
		initialize();
		frame.setVisible(true);
	}

	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 1296, 733);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Image image = new ImageIcon(
				"../Catallena/src/CatallenaImage/gugan1.png").getImage()
						.getScaledInstance(1296, 694, Image.SCALE_SMOOTH);
		frame.getContentPane().setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(71, 166, 1049, 165);
		frame.getContentPane().add(scrollPane);

		// String day = dc.day();
		VO vo = new VO(main.departure, main.destination, dc.resultDday);
		String[] col = { "출발시간", "도착시간", "편명", "운임" };
		String[][] row = dao.route_price(vo);

		table = new JTable(row, col);
		scrollPane.setViewportView(table);

		JButton btnNewButton = new JButton("");
		btnNewButton.setBounds(1180, 645, 100, 39);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int row = table.getSelectedRow();
				int col = table.getSelectedColumn();
				flight = (String) table.getValueAt(row, 2);
				String departure_time = (String) table.getValueAt(row, 0);
				String arrival_time = (String) table.getValueAt(row, 1);
				
				QQatar_LogMain.main(null);
				
			}
		});
		frame.getContentPane().add(btnNewButton);
		btnNewButton.setOpaque(true);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setContentAreaFilled(false);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(71, 460, 1049, 165);
		frame.getContentPane().add(scrollPane_1);

		String[] col_1 = { "출발시간", "도착시간", "편명", "운임" };
		String[][] row_1 = dao.route_price_comback(new VO(main.departure, main.destination, dc.resultDday));

		table_2 = new JTable(row_1, col_1);
		scrollPane_1.setViewportView(table_2);
		table_2.getSelectedRow();
		

//		int sel_row = table.getSelectedRow();
//		int sel_col = table.getSelectedColumn();
//		Object selection = table.getValueAt(sel_row, sel_col);
//		System.out.println(selection);

		JLabel lbl_image = new JLabel("");
		lbl_image.setBounds(0, 0, 1280, 694);
		frame.getContentPane().add(lbl_image);
		lbl_image.setIcon(new ImageIcon(image));
	}
	public String flight() {
		return flight;
	}
	public String departure_time() {
		return departure_time;
	}
	public String arrival_time() {
		return arrival_time;
	}
}
