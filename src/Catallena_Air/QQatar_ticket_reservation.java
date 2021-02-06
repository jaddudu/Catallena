package Catallena_Air;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

public class QQatar_ticket_reservation {

	private JFrame frame;
	ticket_DAO dao = new ticket_DAO();
	

	public QQatar_ticket_reservation(String reserved_number) {
		initialize(reserved_number);
		frame.setVisible(true);	// ²À ÀÛ¼ºÇØ ÁÖ¾î¾ß ÇÑ´Ù.
	}

	private void initialize(String reserved_number) {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 1009, 526);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Image ticket_image = new ImageIcon("../Catallena/src/CatallenaImage/ticket.png").getImage().getScaledInstance(925, 445, Image.SCALE_SMOOTH);
		
		
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 981, 487);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		

		
		JLabel lbl_ticket_name = new JLabel("");
		lbl_ticket_name.setFont(new Font("±¼¸²", Font.BOLD, 20));
		lbl_ticket_name.setBounds(152, 170, 144, 34);
		panel.add(lbl_ticket_name);
		ticket_VO vo = new ticket_VO(reserved_number);
		lbl_ticket_name.setText(dao.SelectName(vo));
		
		JLabel lbl_ticket_date = new JLabel("");
		lbl_ticket_date.setFont(new Font("±¼¸²", Font.BOLD, 18));
		lbl_ticket_date.setBounds(138, 291, 134, 34);
		panel.add(lbl_ticket_date);
		lbl_ticket_date.setText(dao.SelectDate(vo));
		
		JLabel lbl_ticket_flight = new JLabel("");
		lbl_ticket_flight.setFont(new Font("±¼¸²", Font.BOLD, 28));
		lbl_ticket_flight.setBounds(405, 153, 134, 34);
		panel.add(lbl_ticket_flight);
		lbl_ticket_flight.setText(dao.SelectFlight(vo));
		
		JLabel lbl_ticket_from = new JLabel("");
		lbl_ticket_from.setFont(new Font("±¼¸²", Font.BOLD, 20));
		lbl_ticket_from.setBounds(397, 229, 142, 34);
		panel.add(lbl_ticket_from);
		lbl_ticket_from.setText(dao.SelectDeparture(vo));
		
		
		JLabel lbl_ticket_to = new JLabel("");
		lbl_ticket_to.setFont(new Font("±¼¸²", Font.BOLD, 20));
		lbl_ticket_to.setBounds(397, 313, 142, 34);
		panel.add(lbl_ticket_to);
		lbl_ticket_to.setText(dao.SelectDestination(vo));
		
		
		JLabel lbl_ticket_departure = new JLabel("");
		lbl_ticket_departure.setFont(new Font("±¼¸²", Font.BOLD, 28));
		lbl_ticket_departure.setBounds(705, 153, 115, 34);
		panel.add(lbl_ticket_departure);
		lbl_ticket_departure.setText(dao.SelectDeparture_time(vo));
		
		JLabel lbl_ticket_arrival = new JLabel("");
		lbl_ticket_arrival.setFont(new Font("±¼¸²", Font.BOLD, 28));
		lbl_ticket_arrival.setBounds(656, 229, 115, 34);
		panel.add(lbl_ticket_arrival);
		lbl_ticket_arrival.setText(dao.SelectArrival_time(vo));
		
		JLabel lbl_ticket_seat = new JLabel("");
		lbl_ticket_seat.setFont(new Font("±¼¸²", Font.BOLD, 28));
		lbl_ticket_seat.setBounds(630, 313, 115, 34);
		panel.add(lbl_ticket_seat);
		lbl_ticket_seat.setText(dao.SelectSeat(vo));
		
		JLabel lb_ticket_main = new JLabel("");
		lb_ticket_main.setBounds(0, 0, 1003, 487);
		panel.add(lb_ticket_main);
		lb_ticket_main.setIcon(new ImageIcon(ticket_image));
	}
}
