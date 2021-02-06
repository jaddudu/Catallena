package Catallena_Air;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;

public class departure_Calender {

	private JFrame frame;
	String date = "";
	String day = "";
	static String resultDdate = "";
	static String resultDday = "";
	int cnt = 0;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					departure_Calender window = new departure_Calender();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public departure_Calender() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(150, 300, 344, 331);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		Image calender = new ImageIcon(
				"../Catallena/src/CatallenaImage/calender.png").getImage()
						.getScaledInstance(340, 300, Image.SCALE_SMOOTH);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 335, 292);
		frame.getContentPane().add(panel);

		JLabel lbl1 = new JLabel("");
		lbl1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl1.setFont(new Font("±º∏≤", Font.BOLD, 30));
		lbl1.setBounds(4, 90, 40, 35);
		panel.add(lbl1);

		JLabel lbl2 = new JLabel("");
		lbl2.setHorizontalAlignment(SwingConstants.CENTER);
		lbl2.setFont(new Font("±º∏≤", Font.BOLD, 30));
		lbl2.setBounds(56, 90, 40, 35);
		panel.add(lbl2);

		JLabel lbl3 = new JLabel("");
		lbl3.setHorizontalAlignment(SwingConstants.CENTER);
		lbl3.setFont(new Font("±º∏≤", Font.BOLD, 30));
		lbl3.setBounds(100, 90, 40, 35);
		panel.add(lbl3);

		JLabel lbl4 = new JLabel("");
		lbl4.setHorizontalAlignment(SwingConstants.CENTER);
		lbl4.setFont(new Font("±º∏≤", Font.BOLD, 30));
		lbl4.setBounds(147, 90, 40, 35);
		panel.add(lbl4);

		JLabel lbl5 = new JLabel("");
		lbl5.setHorizontalAlignment(SwingConstants.CENTER);
		lbl5.setFont(new Font("±º∏≤", Font.BOLD, 30));
		lbl5.setBounds(195, 90, 40, 35);
		panel.add(lbl5);

		JLabel lbl6 = new JLabel("");
		lbl6.setHorizontalAlignment(SwingConstants.CENTER);
		lbl6.setFont(new Font("±º∏≤", Font.BOLD, 30));
		lbl6.setBounds(241, 90, 40, 35);
		panel.add(lbl6);

		JLabel lbl7 = new JLabel("");
		lbl7.setHorizontalAlignment(SwingConstants.CENTER);
		lbl7.setFont(new Font("±º∏≤", Font.BOLD, 30));
		lbl7.setBounds(289, 90, 40, 35);
		panel.add(lbl7);

		JLabel lbl8 = new JLabel("");
		lbl8.setHorizontalAlignment(SwingConstants.CENTER);
		lbl8.setFont(new Font("±º∏≤", Font.BOLD, 30));
		lbl8.setBounds(4, 131, 40, 35);
		panel.add(lbl8);

		JLabel lbl9 = new JLabel("");
		lbl9.setHorizontalAlignment(SwingConstants.CENTER);
		lbl9.setFont(new Font("±º∏≤", Font.BOLD, 30));
		lbl9.setBounds(52, 131, 40, 35);
		panel.add(lbl9);

		JLabel lbl10 = new JLabel("");
		lbl10.setHorizontalAlignment(SwingConstants.CENTER);
		lbl10.setFont(new Font("±º∏≤", Font.BOLD, 30));
		lbl10.setBounds(100, 131, 40, 35);
		panel.add(lbl10);

		JLabel lbl11 = new JLabel("");
		lbl11.setHorizontalAlignment(SwingConstants.CENTER);
		lbl11.setFont(new Font("±º∏≤", Font.BOLD, 30));
		lbl11.setBounds(151, 131, 40, 35);
		panel.add(lbl11);

		JLabel lbl12 = new JLabel("");
		lbl12.setHorizontalAlignment(SwingConstants.CENTER);
		lbl12.setFont(new Font("±º∏≤", Font.BOLD, 30));
		lbl12.setBounds(195, 131, 40, 35);
		panel.add(lbl12);

		JLabel lbl13 = new JLabel("");
		lbl13.setHorizontalAlignment(SwingConstants.CENTER);
		lbl13.setFont(new Font("±º∏≤", Font.BOLD, 30));
		lbl13.setBounds(243, 131, 40, 35);
		panel.add(lbl13);

		JLabel lbl14 = new JLabel("");
		lbl14.setHorizontalAlignment(SwingConstants.CENTER);
		lbl14.setFont(new Font("±º∏≤", Font.BOLD, 30));
		lbl14.setBounds(288, 131, 40, 35);
		panel.add(lbl14);

		JLabel lbl15 = new JLabel("");
		lbl15.setHorizontalAlignment(SwingConstants.CENTER);
		lbl15.setFont(new Font("±º∏≤", Font.BOLD, 30));
		lbl15.setBounds(6, 173, 40, 35);
		panel.add(lbl15);

		JLabel lbl16 = new JLabel("");
		lbl16.setHorizontalAlignment(SwingConstants.CENTER);
		lbl16.setFont(new Font("±º∏≤", Font.BOLD, 30));
		lbl16.setBounds(53, 172, 40, 35);
		panel.add(lbl16);

		JLabel lbl17 = new JLabel("");
		lbl17.setHorizontalAlignment(SwingConstants.CENTER);
		lbl17.setFont(new Font("±º∏≤", Font.BOLD, 30));
		lbl17.setBounds(102, 174, 40, 35);
		panel.add(lbl17);

		JLabel lbl18 = new JLabel("");
		lbl18.setHorizontalAlignment(SwingConstants.CENTER);
		lbl18.setFont(new Font("±º∏≤", Font.BOLD, 30));
		lbl18.setBounds(148, 173, 40, 35);
		panel.add(lbl18);

		JLabel lbl19 = new JLabel("");
		lbl19.setHorizontalAlignment(SwingConstants.CENTER);
		lbl19.setFont(new Font("±º∏≤", Font.BOLD, 30));
		lbl19.setBounds(197, 174, 40, 35);
		panel.add(lbl19);

		JLabel lbl20 = new JLabel("");
		lbl20.setHorizontalAlignment(SwingConstants.CENTER);
		lbl20.setFont(new Font("±º∏≤", Font.BOLD, 30));
		lbl20.setBounds(242, 172, 40, 35);
		panel.add(lbl20);

		JLabel lbl21 = new JLabel("");
		lbl21.setHorizontalAlignment(SwingConstants.CENTER);
		lbl21.setFont(new Font("±º∏≤", Font.BOLD, 30));
		lbl21.setBounds(289, 173, 40, 35);
		panel.add(lbl21);

		JLabel lbl22 = new JLabel("");
		lbl22.setHorizontalAlignment(SwingConstants.CENTER);
		lbl22.setFont(new Font("±º∏≤", Font.BOLD, 30));
		lbl22.setBounds(8, 215, 40, 35);
		panel.add(lbl22);

		JLabel lbl23 = new JLabel("");
		lbl23.setHorizontalAlignment(SwingConstants.CENTER);
		lbl23.setFont(new Font("±º∏≤", Font.BOLD, 30));
		lbl23.setBounds(54, 215, 40, 35);
		panel.add(lbl23);

		JLabel lbl24 = new JLabel("");
		lbl24.setHorizontalAlignment(SwingConstants.CENTER);
		lbl24.setFont(new Font("±º∏≤", Font.BOLD, 30));
		lbl24.setBounds(101, 216, 40, 35);
		panel.add(lbl24);

		JLabel lbl25 = new JLabel("");
		lbl25.setHorizontalAlignment(SwingConstants.CENTER);
		lbl25.setFont(new Font("±º∏≤", Font.BOLD, 30));
		lbl25.setBounds(149, 215, 40, 35);
		panel.add(lbl25);

		JLabel lbl26 = new JLabel("");
		lbl26.setHorizontalAlignment(SwingConstants.CENTER);
		lbl26.setFont(new Font("±º∏≤", Font.BOLD, 30));
		lbl26.setBounds(197, 214, 40, 35);
		panel.add(lbl26);

		JLabel lbl27 = new JLabel("");
		lbl27.setHorizontalAlignment(SwingConstants.CENTER);
		lbl27.setFont(new Font("±º∏≤", Font.BOLD, 30));
		lbl27.setBounds(243, 214, 40, 35);
		panel.add(lbl27);

		JLabel lbl28 = new JLabel("");
		lbl28.setHorizontalAlignment(SwingConstants.CENTER);
		lbl28.setFont(new Font("±º∏≤", Font.BOLD, 30));
		lbl28.setBounds(290, 214, 40, 35);
		panel.add(lbl28);

		JLabel lbl29 = new JLabel("");
		lbl29.setHorizontalAlignment(SwingConstants.CENTER);
		lbl29.setFont(new Font("±º∏≤", Font.BOLD, 30));
		lbl29.setBounds(6, 254, 40, 35);
		panel.add(lbl29);

		JLabel lbl30 = new JLabel("");
		lbl30.setHorizontalAlignment(SwingConstants.CENTER);
		lbl30.setFont(new Font("±º∏≤", Font.BOLD, 30));
		lbl30.setBounds(56, 254, 40, 35);
		panel.add(lbl30);

		JButton btn1 = new JButton("");
		btn1.setBounds(4, 90, 40, 35);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (cnt == 0) {
					date = "2020.11.01";
					day = "sun"; // ø‰¿œ
					cnt++;
					lbl1.setText("X");

				} else {
					date = "";
					day = "";
					cnt--;
					lbl1.setText("");
				}

			}
		});
		panel.setLayout(null);
		panel.add(btn1);
		btn1.setOpaque(true);
		btn1.setBorderPainted(false);
		btn1.setContentAreaFilled(false);

		JButton btn2 = new JButton("");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (cnt == 0) {
					date = "2020.11.02";
					day = "mon"; // ø‰¿œ
					cnt++;
					lbl2.setText("X");

				} else {
					date = "";
					day = "";
					cnt--;
					lbl2.setText("");
				}
			}
		});
		btn2.setBounds(52, 90, 44, 35);
		panel.add(btn2);
		btn2.setOpaque(true);
		btn2.setBorderPainted(false);
		btn2.setContentAreaFilled(false);

		JButton btn3 = new JButton("");
		btn3.setBounds(100, 90, 44, 35);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (cnt == 0) {
					date = "2020.11.03";
					day = "tue"; // ø‰¿œ
					cnt++;
					lbl3.setText("X");

				} else {
					date = "";
					day = "";
					cnt--;
					lbl3.setText("");
				}
			}
		});
		panel.add(btn3);
		btn3.setOpaque(true);
		btn3.setBorderPainted(false);
		btn3.setContentAreaFilled(false);

		JButton btn4 = new JButton("");
		btn4.setBounds(147, 90, 44, 35);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (cnt == 0) {
					date = "2020.11.04";
					day = "wed"; // ø‰¿œ
					cnt++;
					lbl4.setText("X");

				} else {
					date = "";
					day = "";
					cnt--;
					lbl4.setText("");
				}
			}
		});
		panel.add(btn4);
		btn4.setOpaque(true);
		btn4.setBorderPainted(false);
		btn4.setContentAreaFilled(false);

		JButton btn5 = new JButton("");
		btn5.setBounds(195, 90, 44, 35);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (cnt == 0) {
					date = "2020.11.05";
					day = "thu"; // ø‰¿œ
					cnt++;
					lbl5.setText("X");

				} else {
					date = "";
					day = "";
					cnt--;
					lbl5.setText("");
				}
			}
		});
		panel.add(btn5);
		btn5.setOpaque(true);
		btn5.setBorderPainted(false);
		btn5.setContentAreaFilled(false);

		JButton btn6 = new JButton("");
		btn6.setBounds(241, 90, 44, 35);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				date = "2020.11.06";
				day = "fri";
				if (cnt == 0) {
					date = "2020.11.06";
					day = "fri"; // ø‰¿œ
					cnt++;
					lbl6.setText("X");

				} else {
					date = "";
					day = "";
					cnt--;
					lbl6.setText("");
				}
			}
		});
		panel.add(btn6);
		btn6.setOpaque(true);
		btn6.setBorderPainted(false);
		btn6.setContentAreaFilled(false);

		JButton btn7 = new JButton("");
		btn7.setBounds(289, 90, 34, 35);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if (cnt == 0) {
					date = "2020.11.07";
					day = "sat"; // ø‰¿œ
					cnt++;
					lbl7.setText("X");

				} else {
					date = "";
					day = "";
					cnt--;
					lbl7.setText("");
				}
			}
		});
		panel.add(btn7);
		btn7.setOpaque(true);
		btn7.setBorderPainted(false);
		btn7.setContentAreaFilled(false);

		JButton btn8 = new JButton("");
		btn8.setBounds(4, 131, 40, 35);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if (cnt == 0) {
					date = "2020.11.08";
					day = "sun"; // ø‰¿œ
					cnt++;
					lbl8.setText("X");

				} else {
					date = "";
					day = "";
					cnt--;
					lbl8.setText("");
				}
			}
		});
		panel.add(btn8);
		btn8.setOpaque(true);
		btn8.setBorderPainted(false);
		btn8.setContentAreaFilled(false);

		JButton btn9 = new JButton("");
		btn9.setBounds(52, 131, 44, 35);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if (cnt == 0) {
					date = "2020.11.09";
					day = "mon"; // ø‰¿œ
					cnt++;
					lbl9.setText("X");

				} else {
					date = "";
					day = "";
					cnt--;
					lbl9.setText("");
				}
			}
		});
		panel.add(btn9);
		btn9.setOpaque(true);
		btn9.setBorderPainted(false);
		btn9.setContentAreaFilled(false);

		JButton btn10 = new JButton("");
		btn10.setBounds(100, 131, 44, 35);
		btn10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if (cnt == 0) {
					date = "2020.11.10";
					day = "tue"; // ø‰¿œ
					cnt++;
					lbl10.setText("X");

				} else {
					date = "";
					day = "";
					cnt--;
					lbl10.setText("");
				}
			}
		});
		panel.add(btn10);
		btn10.setOpaque(true);
		btn10.setBorderPainted(false);
		btn10.setContentAreaFilled(false);

		JButton btn11 = new JButton("");
		btn11.setBounds(147, 131, 44, 35);
		btn11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if (cnt == 0) {
					date = "2020.11.11";
					day = "wed"; // ø‰¿œ
					cnt++;
					lbl11.setText("X");

				} else {
					date = "";
					day = "";
					cnt--;
					lbl11.setText("");
				}
			}
		});
		panel.add(btn11);
		btn11.setOpaque(true);
		btn11.setBorderPainted(false);
		btn11.setContentAreaFilled(false);

		JButton btn12 = new JButton("");
		btn12.setBounds(195, 131, 44, 35);
		btn12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if (cnt == 0) {
					date = "2020.11.12";
					day = "thu";
					cnt++;
					lbl12.setText("X");

				} else {
					date = "";
					day = "";
					cnt--;
					lbl12.setText("");
				}
			}
		});
		panel.add(btn12);
		btn12.setOpaque(true);
		btn12.setBorderPainted(false);
		btn12.setContentAreaFilled(false);

		JButton btn13 = new JButton("");
		btn13.setBounds(241, 131, 44, 35);
		btn13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if (cnt == 0) {
					date = "2020.11.13";
					day = "fri"; // ø‰¿œ
					cnt++;
					lbl13.setText("X");

				} else {
					date = "";
					day = "";
					cnt--;
					lbl13.setText("");
				}
			}
		});
		panel.add(btn13);
		btn13.setOpaque(true);
		btn13.setBorderPainted(false);
		btn13.setContentAreaFilled(false);

		JButton btn20 = new JButton("");
		btn20.setBounds(241, 176, 44, 35);
		btn20.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if (cnt == 0) {
					date = "2020.11.20";
					day = "fri"; // ø‰¿œ
					cnt++;
					lbl20.setText("X");

				} else {
					date = "";
					day = "";
					cnt--;
					lbl20.setText("");
				}
			}
		});
		panel.add(btn20);
		btn20.setOpaque(true);
		btn20.setBorderPainted(false);
		btn20.setContentAreaFilled(false);

		JButton btn19 = new JButton("");
		btn19.setBounds(195, 176, 44, 35);
		btn19.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if (cnt == 0) {
					date = "2020.11.19";
					day = "thu"; // ø‰¿œ
					cnt++;
					lbl19.setText("X");

				} else {
					date = "";
					day = "";
					cnt--;
					lbl19.setText("");
				}
			}
		});
		panel.add(btn19);
		btn19.setOpaque(true);
		btn19.setBorderPainted(false);
		btn19.setContentAreaFilled(false);

		JButton btn18 = new JButton("");
		btn18.setBounds(147, 176, 44, 35);
		btn18.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if (cnt == 0) {
					date = "2020.11.18";
					day = "wed"; // ø‰¿œ
					cnt++;
					lbl18.setText("X");

				} else {
					date = "";
					day = "";
					cnt--;
					lbl18.setText("");
				}
			}
		});
		panel.add(btn18);
		btn18.setOpaque(true);
		btn18.setBorderPainted(false);
		btn18.setContentAreaFilled(false);

		JButton btn17 = new JButton("");
		btn17.setBounds(100, 176, 44, 35);
		btn17.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if (cnt == 0) {
					date = "2020.11.17";
					day = "tue"; // ø‰¿œ
					cnt++;
					lbl17.setText("X");

				} else {
					date = "";
					day = "";
					cnt--;
					lbl17.setText("");
				}
			}
		});
		panel.add(btn17);
		btn17.setOpaque(true);
		btn17.setBorderPainted(false);
		btn17.setContentAreaFilled(false);

		JButton btn16 = new JButton("");
		btn16.setBounds(52, 176, 44, 35);
		btn16.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if (cnt == 0) {
					date = "2020.11.16";
					day = "mon"; // ø‰¿œ
					cnt++;
					lbl16.setText("X");

				} else {
					date = "";
					day = "";
					cnt--;
					lbl16.setText("");
				}
			}
		});
		panel.add(btn16);
		btn16.setOpaque(true);
		btn16.setBorderPainted(false);
		btn16.setContentAreaFilled(false);

		JButton btn23 = new JButton("");
		btn23.setBounds(52, 214, 44, 35);
		btn23.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if (cnt == 0) {
					date = "2020.11.23";
					day = "mon"; // ø‰¿œ
					cnt++;
					lbl23.setText("X");

				} else {
					date = "";
					day = "";
					cnt--;
					lbl23.setText("");
				}
			}
		});
		panel.add(btn23);
		btn23.setOpaque(true);
		btn23.setBorderPainted(false);
		btn23.setContentAreaFilled(false);

		JButton btn24 = new JButton("");
		btn24.setBounds(100, 214, 44, 35);
		btn24.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if (cnt == 0) {
					date = "2020.11.24";
					day = "tue"; // ø‰¿œ
					cnt++;
					lbl24.setText("X");

				} else {
					date = "";
					day = "";
					cnt--;
					lbl24.setText("");
				}
			}
		});
		panel.add(btn24);
		btn24.setOpaque(true);
		btn24.setBorderPainted(false);
		btn24.setContentAreaFilled(false);

		JButton btn25 = new JButton("");
		btn25.setBounds(147, 214, 44, 35);
		btn25.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if (cnt == 0) {
					date = "2020.11.25";
					day = "wed"; // ø‰¿œ
					cnt++;
					lbl25.setText("X");

				} else {
					date = "";
					day = "";
					cnt--;
					lbl25.setText("");
				}
			}
		});
		panel.add(btn25);
		btn25.setOpaque(true);
		btn25.setBorderPainted(false);
		btn25.setContentAreaFilled(false);

		JButton btn26 = new JButton("");
		btn26.setBounds(195, 214, 44, 35);
		btn26.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if (cnt == 0) {
					date = "2020.11.26";
					day = "thu"; // ø‰¿œ
					cnt++;
					lbl26.setText("X");

				} else {
					date = "";
					day = "";
					cnt--;
					lbl26.setText("");
				}
			}
		});
		panel.add(btn26);
		btn26.setOpaque(true);
		btn26.setBorderPainted(false);
		btn26.setContentAreaFilled(false);

		JButton btn27 = new JButton("");
		btn27.setBounds(241, 214, 44, 35);
		btn27.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if (cnt == 0) {
					date = "2020.11.27";
					day = "fri"; // ø‰¿œ
					cnt++;
					lbl27.setText("X");

				} else {
					date = "";
					day = "";
					cnt--;
					lbl27.setText("");
				}
			}
		});
		panel.add(btn27);
		btn27.setOpaque(true);
		btn27.setBorderPainted(false);
		btn27.setContentAreaFilled(false);

		JButton btn30 = new JButton("");
		btn30.setBounds(52, 259, 44, 35);
		btn30.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if (cnt == 0) {
					date = "2020.11.30";
					day = "mon"; // ø‰¿œ
					cnt++;
					lbl30.setText("X");

				} else {
					date = "";
					day = "";
					cnt--;
					lbl30.setText("");
				}
				
			}
		});
		panel.add(btn30);
		btn30.setOpaque(true);
		btn30.setBorderPainted(false);
		btn30.setContentAreaFilled(false);

		JButton btn15 = new JButton("");
		btn15.setBounds(4, 176, 40, 35);
		btn15.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if (cnt == 0) {
					date = "2020.11.15";
					day = "sun"; // ø‰¿œ
					cnt++;
					lbl15.setText("X");

				} else {
					date = "";
					day = "";
					cnt--;
					lbl15.setText("");
				}
			}
		});
		panel.add(btn15);
		btn15.setOpaque(true);
		btn15.setBorderPainted(false);
		btn15.setContentAreaFilled(false);

		JButton btn22 = new JButton("");
		btn22.setBounds(4, 214, 40, 35);
		btn22.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if (cnt == 0) {
					date = "2020.11.22";
					day = "sun"; // ø‰¿œ
					cnt++;
					lbl22.setText("X");

				} else {
					date = "";
					day = "";
					cnt--;
					lbl22.setText("");
				}
			}
		});
		panel.add(btn22);
		btn22.setOpaque(true);
		btn22.setBorderPainted(false);
		btn22.setContentAreaFilled(false);

		JButton btn29 = new JButton("");
		btn29.setBounds(4, 259, 40, 35);
		btn29.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if (cnt == 0) {
					date = "2020.11.29";
					day = "sun"; // ø‰¿œ
					cnt++;
					lbl29.setText("X");

				} else {
					date = "";
					day = "";
					cnt--;
					lbl29.setText("");
				}
			}
		});
		panel.add(btn29);
		btn29.setOpaque(true);
		btn29.setBorderPainted(false);
		btn29.setContentAreaFilled(false);

		JButton btn28 = new JButton("");
		btn28.setBounds(289, 214, 40, 35);
		btn28.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if (cnt == 0) {
					date = "2020.11.28";
					day = "sat"; // ø‰¿œ
					cnt++;
					lbl28.setText("X");

				} else {
					date = "";
					day = "";
					cnt--;
					lbl28.setText("");
				}
			}
		});
		panel.add(btn28);
		btn28.setOpaque(true);
		btn28.setBorderPainted(false);
		btn28.setContentAreaFilled(false);

		JButton btn21 = new JButton("");
		btn21.setBounds(289, 174, 40, 35);
		btn21.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if (cnt == 0) {
					date = "2020.11.21";
					day = "sat"; // ø‰¿œ
					cnt++;
					lbl21.setText("X");

				} else {
					date = "";
					day = "";
					cnt--;
					lbl21.setText("");
				}
			}
		});
		panel.add(btn21);
		btn21.setOpaque(true);
		btn21.setBorderPainted(false);
		btn21.setContentAreaFilled(false);

		JButton btn14 = new JButton("");
		btn14.setBounds(289, 131, 40, 35);
		btn14.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				date = "2020.11.14";
				day = "sat";
				if (cnt == 0) {
					date = "2020.11.14";
					day = "sat"; // ø‰¿œ
					cnt++;
					lbl14.setText("X");

				} else {
					date = "";
					day = "";
					cnt--;
					lbl14.setText("");
				}
			}
		});
		panel.add(btn14);
		btn14.setOpaque(true);
		btn14.setBorderPainted(false);
		btn14.setContentAreaFilled(false);

		JButton btn_check = new JButton("\uD655\uC778");
		btn_check.setBounds(192, 253, 136, 42);
		btn_check.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				resultDdate = date;
				resultDday = day;
				JOptionPane.showMessageDialog(null, "√‚πﬂ¿œ º±≈√ øœ∑·!", "√‚πﬂ¿œ", JOptionPane.INFORMATION_MESSAGE);
				frame.dispose();

			}
		});
		btn_check.setFont(new Font("±º∏≤", Font.BOLD, 20));
		panel.add(btn_check);

		JLabel lbl_calender = new JLabel("");
		lbl_calender.setBounds(0, 0, 389, 300);
		panel.add(lbl_calender);
		lbl_calender.setIcon(new ImageIcon(calender));

	}

	public String day() {

		return resultDday;
	}

	public String date() {

		return resultDdate;
	}
}
