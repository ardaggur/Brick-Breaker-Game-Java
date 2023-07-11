import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class CheckText {
	
  public static void main(String args[]) {
    JFrame frame = new JFrame("DefaultButton");   
  
    
    final JTextField myTextField=new JTextField();
    frame.add(myTextField);
   
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ActionListener actionListener = new ActionListener() {
      public void actionPerformed(ActionEvent actionEvent) {
        if(myTextField.getText().compareTo("")==0)
        {
        	JOptionPane.showMessageDialog (null,"You should have entered text.", "Title", JOptionPane.WARNING_MESSAGE);
      		
        }else{
        	JOptionPane.showMessageDialog (null,myTextField.getText(), "Title", JOptionPane.WARNING_MESSAGE);
      		
        }
      }
    };
    
    
   frame.setLayout(new GridLayout(2, 2, 10, 10));
   
    JButton button1 = new JButton("myButton");   
    button1.setActionCommand("First");
    button1.addActionListener(actionListener);
    frame.add(button1);
    frame.setSize(300, 200);
    frame.setVisible(true);
  }
}