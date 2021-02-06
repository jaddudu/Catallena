package Catallena_Air;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class QQatar_Special {

   private JFrame frame;

   /**
    * Launch the application.
    */
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               QQatar_Special window = new QQatar_Special();
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
   public QQatar_Special() {
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
      
      
      JLabel lbl_special = new JLabel("New label");
      lbl_special.setBounds(0, 0, 1280, 694);
      frame.getContentPane().add(lbl_special);
      
      
      Image image = new ImageIcon("../Catallena/src/CatallenaImage/special.png").getImage().getScaledInstance(1280, 694, Image.SCALE_SMOOTH);
      lbl_special.setIcon(new ImageIcon(image));
       
      
      
       JButton btn_madrid = new JButton("New button");
       btn_madrid.addMouseListener(new MouseAdapter() {
          @Override
          public void mouseClicked(MouseEvent e) {
             
             
             special_route_madrid.main(null);
             
          }
       });
       
       btn_madrid.setBounds(12, 95, 381, 545);
       frame.getContentPane().add(btn_madrid);
       btn_madrid.setOpaque(true);
       btn_madrid.setBorderPainted(false);
       btn_madrid.setContentAreaFilled(false);
       
       
       
       JButton btn_osaka = new JButton("New button");
       btn_osaka.addMouseListener(new MouseAdapter() {
          @Override
          public void mouseClicked(MouseEvent e) {
             
             
             special_route_osaka.main(null);
             
          }
       });
       
       btn_osaka.setBounds(423, 94, 388, 546);
       frame.getContentPane().add(btn_osaka);
       btn_osaka.setOpaque(true);
       btn_osaka.setBorderPainted(false);
       btn_osaka.setContentAreaFilled(false);
       
       
       
       JButton btn_jeju = new JButton("New button");
       btn_jeju.addMouseListener(new MouseAdapter() {
          @Override
          public void mouseClicked(MouseEvent e) {
             
             
             special_route_jeju.main(null);
             
          }
       });
       
       btn_jeju.setBounds(837, 95, 405, 545);
       frame.getContentPane().add(btn_jeju);
       btn_jeju.setOpaque(true);
       btn_jeju.setBorderPainted(false);
       btn_jeju.setContentAreaFilled(false);
      
       
      
   }
}