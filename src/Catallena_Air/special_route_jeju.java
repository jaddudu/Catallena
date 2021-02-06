package Catallena_Air;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class special_route_jeju {

   private JFrame frame;

   /**
    * Launch the application.
    */
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               special_route_jeju window = new special_route_jeju();
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
   public special_route_jeju() {
      initialize();
   }

   /**
    * Initialize the contents of the frame.
    */
   private void initialize() {
      frame = new JFrame();
      frame.setBounds(100, 100, 1296, 733);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.getContentPane().setLayout(null);
      frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      
      JRadioButton rdbtnNewRadioButton = new JRadioButton("");
       rdbtnNewRadioButton.setBounds(1012, 364, 32, 23);
       frame.getContentPane().add(rdbtnNewRadioButton);
       
       rdbtnNewRadioButton.setOpaque(true);
       rdbtnNewRadioButton.setBorderPainted(false);
       rdbtnNewRadioButton.setContentAreaFilled(false);
       
      
      JLabel lbl_special = new JLabel("New label");
      lbl_special.setBounds(0, 0, 1280, 694);
      frame.getContentPane().add(lbl_special);
      
      
      Image image = new ImageIcon("../Catallena/src/CatallenaImage/special_route_jeju.png").getImage().getScaledInstance(1280, 694, Image.SCALE_SMOOTH);
      lbl_special.setIcon(new ImageIcon(image));
      
      JButton btn_login = new JButton("New button");
      btn_login.addMouseListener(new MouseAdapter() {
          @Override
          public void mouseClicked(MouseEvent e) {
             
             
             QQatar_Special_LogMain.main(null);
             
          }
       });
      btn_login.setBounds(1152, 633, 128, 51);
      frame.getContentPane().add(btn_login);
       btn_login.setOpaque(true);
          btn_login.setBorderPainted(false);
          btn_login.setContentAreaFilled(false);
      
   }
}