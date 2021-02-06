package Catallena_Air;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

//import sun.java2d.opengl.WGLSurfaceData.WGLVSyncOffScreenSurfaceData;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseMotionAdapter;

public class QQatar_Main {

	private JFrame frame;

	static String destination = "";
	static String departure = "";

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {

			public void run() {
				try {
					QQatar_Main window = new QQatar_Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public QQatar_Main() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1296, 733);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		Image image = new ImageIcon(
				"../Catallena/src/CatallenaImage/search.png").getImage()
						.getScaledInstance(1280, 700, Image.SCALE_SMOOTH);

		JLabel lbl_child = new JLabel("");
		lbl_child.setBounds(906, 489, 91, 38);
		frame.getContentPane().add(lbl_child);

		lbl_child.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				child_standard.main(null);

			}

			@Override
			public void mouseExited(MouseEvent e) {
				child_standard.dispose();
			}

		});

		JLabel lbl_infant = new JLabel("");
		lbl_infant.setBounds(1038, 489, 91, 38);
		frame.getContentPane().add(lbl_infant);

		lbl_infant.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				infant_standard.main(null);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				infant_standard.dispose();
			}
		});

		JComboBox cmb_adult = new JComboBox();
		cmb_adult.setBounds(753, 586, 63, 23);
		frame.getContentPane().add(cmb_adult);

		DefaultComboBoxModel<Integer> adult = new DefaultComboBoxModel<Integer>();
		for (int i = 1; i <= 9; i++) {
			adult.addElement(i);
		}
		cmb_adult.setModel(adult);

		JComboBox cmb_child = new JComboBox();
		cmb_child.setBounds(880, 586, 65, 23);
		frame.getContentPane().add(cmb_child);

		DefaultComboBoxModel<Integer> child = new DefaultComboBoxModel<Integer>();
		for (int i = 1; i <= 9; i++) {
			child.addElement(i);
		}
		cmb_child.setModel(child);

		JComboBox cmb_infant = new JComboBox();
		cmb_infant.setBounds(1006, 585, 69, 23);
		frame.getContentPane().add(cmb_infant);

		DefaultComboBoxModel<Integer> infant = new DefaultComboBoxModel<Integer>();
		for (int i = 1; i <= 9; i++) {
			infant.addElement(i);

		}

		JComboBox cmb_to = new JComboBox();
		cmb_to.setModel(new DefaultComboBoxModel(new String[] { "\uC81C\uC8FC(CJU)", "\uAE40\uD3EC(GMP)",
				"\uC624\uC0AC\uCE74(KIX)", "\uC778\uCC9C(ICN)", "\uD64D\uCF69(HKG)", "\uBC29\uCF55(BKK)",
				"\uB274\uC695(JFK)", "\uAD0C(GUM)", "\uB2E4\uB0AD(DNG)", "\uAD11\uC8FC(GWJ)",
				"\uB9C8\uB4DC\uB9AC\uB4DC(MAD)", "\uC138\uBD80(CEB)" }));
		cmb_to.setBounds(187, 573, 116, 38);
		frame.getContentPane().add(cmb_to);

		JComboBox cmb_from = new JComboBox(); // Ãâ¹ßÁö
		cmb_from.setModel(
				new DefaultComboBoxModel(new String[] { "\uAE40\uD3EC(GMP)", "\uC81C\uC8FC(CJU)", "\uC778\uCC9C(ICN)",
						"\uC624\uC0AC\uCE74(KIX)", "\uD64D\uCF69(HKG)", "\uBC29\uCF55(BKK)", "\uB274\uC695(JFK)",
						"\uAD0C(GUM)", "\uAD11\uC8FC(GWJ)", "\uB9C8\uB4DC\uB9AC\uB4DC(MAD)", "\uC138\uBD80(CEB)" }));
		cmb_from.setToolTipText("\uC778\uCC9C\r\n\uC544\uC544\r\n");
		cmb_from.setBounds(65, 573, 110, 38);
		frame.getContentPane().add(cmb_from);
		// cmb_from.setSelectedItem(dao.cmb_select_destination(vo));

		JRadioButton radio_btn_round = new JRadioButton("New radio button");
		radio_btn_round.setBackground(new Color(255, 255, 255));
		radio_btn_round.setBounds(54, 495, 16, 23);
		frame.getContentPane().add(radio_btn_round);

		JRadioButton radio_btn_oneway = new JRadioButton("New radio button");
		radio_btn_oneway.setBackground(new Color(255, 255, 255));
		radio_btn_oneway.setBounds(163, 495, 22, 23);
		frame.getContentPane().add(radio_btn_oneway);

		ButtonGroup bg = new ButtonGroup();
		bg.add(radio_btn_round);
		bg.add(radio_btn_oneway);

		JButton btn_reserve = new JButton("");
		btn_reserve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				QQatar_reservation_check.main(null);

			}
		});
		btn_reserve.setBounds(54, 638, 134, 29);
		frame.getContentPane().add(btn_reserve);
		btn_reserve.setOpaque(true);
		btn_reserve.setBorderPainted(false);
		btn_reserve.setContentAreaFilled(false);

		JButton btn_cancel = new JButton("");
		btn_cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				QQatar_cancel.main(null);

			}
		});
		btn_cancel.setBounds(243, 638, 134, 29);
		frame.getContentPane().add(btn_cancel);
		btn_cancel.setOpaque(true);
		btn_cancel.setBorderPainted(false);
		btn_cancel.setContentAreaFilled(false);

		JButton btn_special = new JButton("");
		btn_special.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				QQatar_Special.main(null);

			}
		});
		btn_special.setBounds(435, 638, 168, 29);
		frame.getContentPane().add(btn_special);
		btn_special.setOpaque(true);
		btn_special.setBorderPainted(false);
		btn_special.setContentAreaFilled(false);

		JButton btn_search = new JButton("");
		btn_search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				departure = cmb_from.getSelectedItem().toString();
				destination = cmb_to.getSelectedItem().toString();
				new QQatarRoutePrice();

			}
		});
		btn_search.setBounds(1072, 641, 168, 29);
		frame.getContentPane().add(btn_search);
		btn_search.setOpaque(true);
		btn_search.setBorderPainted(false);
		btn_search.setContentAreaFilled(false);

		JButton btn_departure = new JButton("\uCD9C\uBC1C\uC77C \uC120\uD0DD");
		btn_departure.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btn_departure.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				departure_Calender.main(null);

			}
		});
		btn_departure.setBounds(319, 575, 116, 36);
		frame.getContentPane().add(btn_departure);

		JButton btn_arrival = new JButton("\uB3C4\uCC29\uC77C \uC120\uD0DD");
		btn_arrival.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				arrival_Calender.main(null);
			}
		});
		btn_arrival.setBounds(461, 575, 116, 36);
		frame.getContentPane().add(btn_arrival);

		JLabel lbl_search = new JLabel("New label");
		lbl_search.setBackground(Color.WHITE);
		lbl_search.setBounds(0, 0, 1280, 694);
		frame.getContentPane().add(lbl_search);
		lbl_search.setIcon(new ImageIcon(image));

	}

	public String departure() {

		return departure;
	}

	public String destination() {

		return destination;
	}

}
