package Catallena_Air;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Label;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import javax.swing.SwingConstants;

public class QQatar_seat {

	private JFrame frame;
	static String seat = "";
	int cnt = 0;
	RandomNumber ranNum = new RandomNumber();
	String randon = "";
	DAO_seat dao = new DAO_seat();
	departure_Calender dc = new departure_Calender();
	//QQatar_seat re = new QQatar_seat();
	QQatar_join jo = new QQatar_join();
	QQatarRoutePrice fly = new QQatarRoutePrice();
	QQatar_bjoin bj = new QQatar_bjoin();
	QQatar_LogMain lm = new QQatar_LogMain();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QQatar_seat window = new QQatar_seat();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public QQatar_seat() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 477, 574);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 461, 535);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		Image image_seat = new ImageIcon(
				"../Catallena/src/CatallenaImage/seat.png").getImage()
						.getScaledInstance(461, 535, Image.SCALE_SMOOTH);

		JLabel lbl_a1 = new JLabel("");
		lbl_a1.setFont(new Font("굴림", Font.BOLD, 40));
		lbl_a1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_a1.setBounds(85, 157, 41, 45);
		panel.add(lbl_a1);
		
		JLabel lbl_b1 = new JLabel("");
		lbl_b1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_b1.setFont(new Font("굴림", Font.BOLD, 40));
		lbl_b1.setBounds(161, 157, 41, 45);
		panel.add(lbl_b1);
		
		JLabel lbl_c1 = new JLabel("");
		lbl_c1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_c1.setFont(new Font("굴림", Font.BOLD, 40));
		lbl_c1.setBounds(272, 157, 41, 45);
		panel.add(lbl_c1);
		
		JLabel lbl_d1 = new JLabel("");
		lbl_d1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_d1.setFont(new Font("굴림", Font.BOLD, 40));
		lbl_d1.setBounds(345, 157, 41, 45);
		panel.add(lbl_d1);
		
		JLabel lbl_a2 = new JLabel("");
		lbl_a2.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_a2.setFont(new Font("굴림", Font.BOLD, 40));
		lbl_a2.setBounds(85, 227, 41, 45);
		panel.add(lbl_a2);
		
		JLabel lbl_b2 = new JLabel("");
		lbl_b2.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_b2.setFont(new Font("굴림", Font.BOLD, 40));
		lbl_b2.setBounds(161, 227, 41, 45);
		panel.add(lbl_b2);
		
		JLabel lbl_c2 = new JLabel("");
		lbl_c2.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_c2.setFont(new Font("굴림", Font.BOLD, 40));
		lbl_c2.setBounds(272, 227, 41, 45);
		panel.add(lbl_c2);
		
		JLabel lbl_d2 = new JLabel("");
		lbl_d2.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_d2.setFont(new Font("굴림", Font.BOLD, 40));
		lbl_d2.setBounds(345, 227, 41, 45);
		panel.add(lbl_d2);
		
		JLabel lbl_a3 = new JLabel("");
		lbl_a3.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_a3.setFont(new Font("굴림", Font.BOLD, 40));
		lbl_a3.setBounds(85, 297, 41, 45);
		panel.add(lbl_a3);
		
		JLabel lbl_b3 = new JLabel("");
		lbl_b3.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_b3.setFont(new Font("굴림", Font.BOLD, 40));
		lbl_b3.setBounds(161, 297, 41, 45);
		panel.add(lbl_b3);
		
		JLabel lbl_c3 = new JLabel("");
		lbl_c3.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_c3.setFont(new Font("굴림", Font.BOLD, 40));
		lbl_c3.setBounds(272, 297, 41, 45);
		panel.add(lbl_c3);
		
		JLabel lbl_d3 = new JLabel("");
		lbl_d3.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_d3.setFont(new Font("굴림", Font.BOLD, 40));
		lbl_d3.setBounds(345, 297, 41, 45);
		panel.add(lbl_d3);
		
		JLabel lbl_a4 = new JLabel("");
		lbl_a4.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_a4.setFont(new Font("굴림", Font.BOLD, 40));
		lbl_a4.setBounds(85, 368, 41, 45);
		panel.add(lbl_a4);
		
		JLabel lbl_b4 = new JLabel("");
		lbl_b4.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_b4.setFont(new Font("굴림", Font.BOLD, 40));
		lbl_b4.setBounds(161, 368, 41, 45);
		panel.add(lbl_b4);
		
		JLabel lbl_c4 = new JLabel("");
		lbl_c4.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_c4.setFont(new Font("굴림", Font.BOLD, 40));
		lbl_c4.setBounds(272, 368, 41, 45);
		panel.add(lbl_c4);
		
		JLabel lbl_d4 = new JLabel("");
		lbl_d4.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_d4.setFont(new Font("굴림", Font.BOLD, 40));
		lbl_d4.setBounds(345, 368, 41, 45);
		panel.add(lbl_d4);
		
		JLabel lbl_a5 = new JLabel("");
		lbl_a5.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_a5.setFont(new Font("굴림", Font.BOLD, 40));
		lbl_a5.setBounds(85, 437, 41, 45);
		panel.add(lbl_a5);
		
		JLabel lbl_b5 = new JLabel("");
		lbl_b5.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_b5.setFont(new Font("굴림", Font.BOLD, 40));
		lbl_b5.setBounds(161, 437, 41, 45);
		panel.add(lbl_b5);
		
		JLabel lbl_c5 = new JLabel("");
		lbl_c5.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_c5.setFont(new Font("굴림", Font.BOLD, 40));
		lbl_c5.setBounds(272, 437, 41, 45);
		panel.add(lbl_c5);
		
		JLabel lbl_d5 = new JLabel("");
		lbl_d5.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_d5.setFont(new Font("굴림", Font.BOLD, 40));
		lbl_d5.setBounds(345, 437, 41, 45);
		panel.add(lbl_d5);

		JButton btn_a1 = new JButton("");
		btn_a1.setFont(new Font("굴림", Font.BOLD, 37));
		
		btn_a1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {

				if(cnt == 0) {
					lbl_a1.setText("X");
					seat = "a1";
					cnt++;
				}else {
					lbl_a1.setText("");
					cnt--;
					seat = "";
				}
					
				

			}
			
		});

		btn_a1.setBounds(85, 157, 41, 45);
		panel.add(btn_a1);
		btn_a1.setOpaque(true);
		btn_a1.setBorderPainted(false);
		btn_a1.setContentAreaFilled(false);

		JButton btn_b1 = new JButton("");
		btn_b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(cnt == 0) {
					lbl_b1.setText("X");
					seat = "b1";
					cnt++;
				}else {
					lbl_b1.setText("");
					cnt--;
					seat = "";
				}
			}
		});
		btn_b1.setBounds(161, 157, 41, 45);
		panel.add(btn_b1);
		btn_b1.setOpaque(true);
		btn_b1.setBorderPainted(false);
		btn_b1.setContentAreaFilled(false);
		
		JButton btn_c1 = new JButton("");
		btn_c1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(cnt == 0) {
					lbl_c1.setText("X");
					seat = "c1";
					cnt++;
				}else {
					lbl_c1.setText("");
					cnt--;
					seat = "";
				}
			}
		});
		btn_c1.setBounds(272, 157, 41, 45);
		panel.add(btn_c1);
		btn_c1.setOpaque(true);
		btn_c1.setBorderPainted(false);
		btn_c1.setContentAreaFilled(false);
		
		JButton btn_d1 = new JButton("");
		btn_d1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(cnt == 0) {
					lbl_d1.setText("X");
					seat = "d1";
					cnt++;
				}else {
					lbl_d1.setText("");
					cnt--;
					seat = "";
				}
			}
		});
		btn_d1.setBounds(345, 157, 41, 45);
		panel.add(btn_d1);
		btn_d1.setOpaque(true);
		btn_d1.setBorderPainted(false);
		btn_d1.setContentAreaFilled(false);

		JButton btn_a2 = new JButton("");
		btn_a2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(cnt == 0) {
					lbl_a2.setText("X");
					seat = "a2";
					cnt++;
				}else {
					lbl_a2.setText("");
					cnt--;
					seat = "";
				}
			}
		});
		btn_a2.setBounds(85, 227, 41, 45);
		panel.add(btn_a2);
		btn_a2.setOpaque(true);
		btn_a2.setBorderPainted(false);
		btn_a2.setContentAreaFilled(false);

		JButton btn_b2 = new JButton("");
		btn_b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(cnt == 0) {
					lbl_b2.setText("X");
					seat = "b2";
					cnt++;
				}else {
					lbl_b2.setText("");
					cnt--;
					seat = "";
				}
			}
		});
		btn_b2.setBounds(161, 227, 41, 45);
		panel.add(btn_b2);
		btn_b2.setOpaque(true);
		btn_b2.setBorderPainted(false);
		btn_b2.setContentAreaFilled(false);

		JButton btn_c2 = new JButton("");
		btn_c2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(cnt == 0) {
					lbl_c2.setText("X");
					seat = "c2";
					cnt++;
				}else {
					lbl_c2.setText("");
					cnt--;
					seat = "";
				}
			}
		});
		btn_c2.setBounds(272, 227, 41, 45);
		panel.add(btn_c2);
		btn_c2.setOpaque(true);
		btn_c2.setBorderPainted(false);
		btn_c2.setContentAreaFilled(false);

		JButton btn_d2 = new JButton("");
		btn_d2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(cnt == 0) {
					lbl_d2.setText("X");
					seat = "d2";
					cnt++;
				}else {
					lbl_d2.setText("");
					cnt--;
					seat = "";
				}
			}
		});
		btn_d2.setBounds(345, 227, 41, 45);
		panel.add(btn_d2);
		btn_d2.setOpaque(true);
		btn_d2.setBorderPainted(false);
		btn_d2.setContentAreaFilled(false);

		JButton btn_a3 = new JButton("");
		btn_a3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(cnt == 0) {
					lbl_a3.setText("X");
					seat = "a3";
					cnt++;
				}else {
					lbl_a3.setText("");
					cnt--;
					seat = "";
				}
			}
		});
		btn_a3.setBounds(85, 297, 41, 45);
		panel.add(btn_a3);
		btn_a3.setOpaque(true);
		btn_a3.setBorderPainted(false);
		btn_a3.setContentAreaFilled(false);

		JButton btn_b3 = new JButton("");
		btn_b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(cnt == 0) {
					lbl_b3.setText("X");
					seat = "b3";
					cnt++;
				}else {
					lbl_b3.setText("");
					cnt--;
					seat = "";
				}
			}
		});
		btn_b3.setBounds(161, 297, 41, 45);
		panel.add(btn_b3);
		btn_b3.setOpaque(true);
		btn_b3.setBorderPainted(false);
		btn_b3.setContentAreaFilled(false);

		JButton btn_c3 = new JButton("");
		btn_c3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(cnt == 0) {
					lbl_c3.setText("X");
					seat = "c3";
					cnt++;
				}else {
					lbl_c3.setText("");
					cnt--;
					seat = "";
				}
			}
		});
		btn_c3.setBounds(272, 297, 41, 45);
		panel.add(btn_c3);
		btn_c3.setOpaque(true);
		btn_c3.setBorderPainted(false);
		btn_c3.setContentAreaFilled(false);

		JButton btn_d3 = new JButton("");
		btn_d3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(cnt == 0) {
					lbl_d3.setText("X");
					seat = "d3";
					cnt++;
				}else {
					lbl_d3.setText("");
					cnt--;
					seat = "";
				}
			}
		});
		btn_d3.setBounds(345, 297, 41, 45);
		panel.add(btn_d3);
		btn_d3.setOpaque(true);
		btn_d3.setBorderPainted(false);
		btn_d3.setContentAreaFilled(false);

		JButton btn_a4 = new JButton("");
		btn_a4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(cnt == 0) {
					lbl_a4.setText("X");
					seat = "a4";
					cnt++;
				}else {
					lbl_a4.setText("");
					cnt--;
					seat = "";
				}
			}
		});
		btn_a4.setBounds(85, 368, 41, 45);
		panel.add(btn_a4);
		btn_a4.setOpaque(true);
		btn_a4.setBorderPainted(false);
		btn_a4.setContentAreaFilled(false);

		JButton btn_b4 = new JButton("");
		btn_b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(cnt == 0) {
					lbl_b4.setText("X");
					seat = "b4";
					cnt++;
				}else {
					lbl_b4.setText("");
					cnt--;
					seat = "";
				}
			}
		});
		btn_b4.setBounds(161, 368, 41, 45);
		panel.add(btn_b4);
		btn_b4.setOpaque(true);
		btn_b4.setBorderPainted(false);
		btn_b4.setContentAreaFilled(false);

		JButton btn_c4 = new JButton("");
		btn_c4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(cnt == 0) {
					lbl_c4.setText("X");
					seat = "c4";
					cnt++;
				}else {
					lbl_c4.setText("");
					cnt--;
					seat = "";
				}
			}
		});
		btn_c4.setBounds(272, 368, 41, 45);
		panel.add(btn_c4);
		btn_c4.setOpaque(true);
		btn_c4.setBorderPainted(false);
		btn_c4.setContentAreaFilled(false);

		JButton btn_d4 = new JButton("");
		btn_d4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(cnt == 0) {
					lbl_d4.setText("X");
					seat = "d4";
					cnt++;
				}else {
					lbl_d4.setText("");
					cnt--;
					seat = "";
				}
			}
		});
		btn_d4.setBounds(345, 368, 41, 45);
		panel.add(btn_d4);
		btn_d4.setOpaque(true);
		btn_d4.setBorderPainted(false);
		btn_d4.setContentAreaFilled(false);

		JButton btn_a5 = new JButton("");
		btn_a5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(cnt == 0) {
					lbl_a5.setText("X");
					seat = "a5";
					cnt++;
				}else {
					lbl_a5.setText("");
					cnt--;
					seat = "";
				}
			}
		});
		btn_a5.setBounds(85, 437, 41, 45);
		panel.add(btn_a5);
		btn_a5.setOpaque(true);
		btn_a5.setBorderPainted(false);
		btn_a5.setContentAreaFilled(false);

		JButton btn_b5 = new JButton("");
		btn_b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(cnt == 0) {
					lbl_b5.setText("X");
					seat = "b5";
					cnt++;
				}else {
					lbl_b5.setText("");
					cnt--;
					seat = "";
				}
			}
		});
		btn_b5.setBounds(161, 437, 41, 45);
		panel.add(btn_b5);
		btn_b5.setOpaque(true);
		btn_b5.setBorderPainted(false);
		btn_b5.setContentAreaFilled(false);

		JButton btn_c5 = new JButton("");
		btn_c5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(cnt == 0) {
					lbl_c5.setText("X");
					seat = "c5";
					cnt++;
				}else {
					lbl_c5.setText("");
					cnt--;
					seat = "";
				}
			}
		});
		btn_c5.setBounds(272, 437, 41, 45);
		panel.add(btn_c5);
		btn_c5.setOpaque(true);
		btn_c5.setBorderPainted(false);
		btn_c5.setContentAreaFilled(false);

		JButton btn_d5 = new JButton("");
		btn_d5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(cnt == 0) {
					lbl_d5.setText("X");
					seat = "d5";
					cnt++;
				}else {
					lbl_d5.setText("");
					cnt--;
					seat = "";
				}
			}
		});
		btn_d5.setBounds(345, 437, 41, 45);
		panel.add(btn_d5);
		btn_d5.setOpaque(true);
		btn_d5.setBorderPainted(false);
		btn_d5.setContentAreaFilled(false);

		JLabel lbl_seat = new JLabel("");
		lbl_seat.setBounds(0, 0, 461, 535);
		panel.add(lbl_seat);
		lbl_seat.setIcon(new ImageIcon(image_seat));
		
		
		
				
		
		JButton btn_com = new JButton("");
		btn_com.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				randon = ranNum.excuteGenerate();
				//회원 변수
				String name = jo.name;
				String date = dc.resultDdate;
				String re_seat = seat;
				String flight = fly.flight;
				String passport = jo.passport;
				String id = lm.id;
				
				int cnt = dao.Insert_ticket_reservation(new VO_seat(randon, name, date, re_seat, flight,passport,id));
				
				if (cnt >0) {
					frame.dispose();
					JOptionPane.showMessageDialog(null, "예약을 성공 하셨습니다. \n 예약 번호 : "+randon, "예약", JOptionPane.INFORMATION_MESSAGE);
					

				} else {
					// 경고창(부모컴포넌트, 출력하고 싶은 메세지, 경고창의 타이틀, 아이콘!)
					
					JOptionPane.showMessageDialog(null, "이미 예약된 좌석입니다!", "예약", JOptionPane.ERROR_MESSAGE);
				}
				
				
				
			}
		});
		btn_com.setBounds(172, 492, 128, 28);
		panel.add(btn_com);
		btn_com.setOpaque(true);
		btn_com.setBorderPainted(false);
		btn_com.setContentAreaFilled(false);
		
		


	}
	public String seat() {
		return seat;
	}
	public String random() {
		return randon;
	}
}
