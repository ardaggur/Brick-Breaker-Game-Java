import java.awt.FlowLayout;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class AddingActionListenerJTextField {

  public static void main(String[] a) {
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(new FlowLayout());
    final JTextField jTextField1 = new JTextField();
    JTextField jTextField2 = new JTextField("Uneditable text field.");
    jTextField2.setEditable(false);
    frame.add(jTextField2);
    jTextField1.setText("jTextField1");
   
    jTextField1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
    	
    	JOptionPane.showMessageDialog (null, jTextField1.getText(), "Title", JOptionPane.INFORMATION_MESSAGE);
  		JOptionPane.showMessageDialog (null, jTextField1.getText(), "Title", JOptionPane.ERROR_MESSAGE);
  		JOptionPane.showMessageDialog (null, jTextField1.getText(), "Title", JOptionPane.WARNING_MESSAGE);
  		
      }
    });
    frame.add(jTextField1);

    frame.setSize(300, 200);
    frame.setVisible(true);
    if(jTextField2.isEditable()==false)
    {
    	JOptionPane.showMessageDialog (null,"jTextField2 is uneditable", "Title", JOptionPane.WARNING_MESSAGE);
  		
    }
  }

}