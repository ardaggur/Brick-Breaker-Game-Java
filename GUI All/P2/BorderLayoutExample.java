import java.awt.*;
import java.awt.event.*;

import javax.swing.JFrame;

public class BorderLayoutExample {

  public static void main(String[] args) {
  Frame frame= new JFrame("BorderLayout Frame");
  Panel pa= new Panel();
  
  frame.add(pa);
  pa.setLayout(new BorderLayout());
  pa.add(new Button("First button"), BorderLayout.NORTH);
  pa.add(new Button("Second button"), BorderLayout.SOUTH);
  pa.add(new Button("Third button"), BorderLayout.EAST);
  pa.add(new Button("Fourth button"), BorderLayout.WEST);
  pa.add(new Button("Fifth button"), BorderLayout.CENTER);
  frame.setSize(300,300);  
  frame.setVisible(true);
  }
}