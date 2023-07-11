import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class AnaMenu extends JPanel {

  protected Image backgroundImage;
  private ImageIcon myBackgroundIcon; 

  public AnaMenu(String fileName) throws IOException {
	myBackgroundIcon=new ImageIcon(getClass().getResource(fileName));
	
    backgroundImage =myBackgroundIcon.getImage(); 
  }

  public void paintComponent(Graphics g) {
    super.paintComponent(g);

    g.drawImage(backgroundImage, 0, 0, this);
  }
}