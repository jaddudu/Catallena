package Catallena_Air;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class child_standard {

   private static JFrame frame;

   /**
    * Launch the application.
    */
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               child_standard window = new child_standard();
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
   public child_standard() {
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
      frame.setLocation(650,130);
          
      JPanel panel = new JPanel();
      panel.setBounds(0, 0, 490, 452);
      frame.getContentPane().add(panel);
      panel.setLayout(null);
      
      JLabel lbl_child = new JLabel("");
      lbl_child.setBounds(0, -22, 490, 497);
      panel.add(lbl_child);
      Image image1 = new ImageIcon("../Catallena/src/CatallenaImage/child_standard.png").getImage().getScaledInstance(490, 450, Image.SCALE_SMOOTH);
      lbl_child.setIcon(new ImageIcon(image1));
   }

   // 외부에서 현재 창 지우기 위해 만든 메소드
   public static void dispose() {
      frame.dispose();
   }

}