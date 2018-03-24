import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.SwingUtilities;
 
public class qw1 implements ActionListener {
 
   public qw1() {
      initComponents();
   }
 
   
   private JFrame viewForm;
 
   private void initComponents() {
      viewForm = new JFrame("Main Form");
      viewForm.setSize(400, 400);
      viewForm.setVisible(true);
      viewForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
      JButton button = new JButton("Работник банка");
      button.setVisible(true);
      button.setLocation(12, 12);
      button.setSize(165, 50);
      button.addActionListener(new ActionListener() {
 
         public void actionPerformed(ActionEvent e) {
        	 String window = JOptionPane.showInputDialog("Введите пароль, если вы являетесь сотрудником банка: ");
             
             while (!(window.equals("admin"))){
                 JOptionPane.showMessageDialog(null, "Попробуйте еще раз");
                 window = JOptionPane.showInputDialog("Введите логин, если вы являетесь сотрудником банка: ");           
             }           
             JPasswordField ps = new JPasswordField();
             JFrame panel = new JFrame();
             panel.add(ps);
             
        
         String window1 = JOptionPane.showInputDialog("Введите пароль, если вы являетесь сотрудником банка: ");
         
         while (!(window.equals("admin"))){
             JOptionPane.showMessageDialog(null, "Попробуйте еще раз");
             window = JOptionPane.showInputDialog("Введите пароль, если вы являетесь сотрудником банка: ");           
         }      
         JOptionPane.showMessageDialog(null, "Правильно");       
         JPasswordField ps1 = new JPasswordField();
         JFrame panel1 = new JFrame();
         panel1.add(ps);
     }
 
      });
      JButton button2 = new JButton("Клиент банка");
      button2.setVisible(true);
      button2.setLocation(175, 12);
      button2.setSize(165, 50);
      button2.addActionListener(new ActionListener() {
 
         public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(viewForm, "Don't touch me!",
                  "Warning", JOptionPane.WARNING_MESSAGE);
         }});
      viewForm.getContentPane().add(button);
      viewForm.getContentPane().add(new JLabel());
      viewForm.getContentPane().add(button2);
      viewForm.getContentPane().add(new JLabel());
      
   }
 
   public void actionPerformed(ActionEvent action) {
   }
 
   public static void main(String[] args) {
      SwingUtilities.invokeLater(new Runnable() {
         public void run() {
            new qw1();
         }
      });
   }
}