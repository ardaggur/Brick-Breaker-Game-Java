import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
public class ActionButtonSample {
  public static void main(String args[]) {
    JFrame frame = new JFrame("DefaultButton");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ActionListener actionListener = new ActionListener() {
      public void actionPerformed(ActionEvent actionEvent) {
        String command = actionEvent.getActionCommand();
        System.out.println("Selected: " + command);
      }
    };
    frame.setLayout(new GridLayout(2, 2, 10, 10));
    JButton button1 = new JButton("Text Button");
    button1.setActionCommand("First");
    button1.addActionListener(actionListener);
    frame.add(button1);
    frame.setSize(300, 200);
    frame.setVisible(true);
  }
}