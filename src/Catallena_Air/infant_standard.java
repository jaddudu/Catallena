package Catallena_Air;


import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class infant_standard {

   private static JFrame frame;

   /**
    * Launch the application.
    */
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               infant_standard window = new infant_standard();
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
   public infant_standard() {
      initialize();
   }

   /**
    * Initialize the contents of the frame.
    */
   private void initialize() {
      frame = new JFrame();
      frame.setBounds(100, 100, 506, 491);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.getContentPane().setLayout(null);
      frame.setLocation(750,130);
          
      JPanel panel = new JPanel();
      panel.setBounds(0, 0, 749, 544);
      frame.getContentPane().add(panel);
      panel.setLayout(null);
      
      JLabel lbl_infant = new JLabel("");
      lbl_infant.setBounds(0, -22, 490, 497);
      panel.add(lbl_infant);
      Image image1 = new ImageIcon("../Catallena/src/CatallenaImage/infant_standard.png").getImage().getScaledInstance(490, 450, Image.SCALE_SMOOTH);
      lbl_infant.setIcon(new ImageIcon(image1));
   }

   // 외부에서 현재 창 지우기 위해 만든 메소드
   public static void dispose() {
      frame.dispose();
   }

}