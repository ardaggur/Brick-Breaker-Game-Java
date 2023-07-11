import javax.swing.*;

public class AbsCoordinate{
  private JFrame frame;
  private JPanel panel;
  private Icon actor;
  private JLabel label1;
  
  public void createGUI(){
  frame = new JFrame("Proje");
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  panel = new JPanel();
  panel.setLayout(null);
  actor=new ImageIcon(getClass().getResource("actor.jpg"));
  label1 = new JLabel(actor);  
  label1.setBounds(100, 50, 100, 50);    
  panel.add(label1);   
  frame.add(panel);
  frame.setSize(400,400);
  frame.setVisible(true);
 
  }
  
}