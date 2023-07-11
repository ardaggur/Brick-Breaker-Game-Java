import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;

public class MoveBoxWithAbsolutePositioning implements KeyListener{
  private JFrame frame;
  private JPanel panel;
  private Icon actor;
  private JLabel label1;
  private int xActor=100;
  private int yActor=50;
  
  public void createGUI() throws IOException{
  frame = new JFrame("Lab9");  
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  panel = new JPanel();
  panel.setLayout(null);
  actor=new ImageIcon(getClass().getResource("actor.jpg"));
  label1 = new JLabel(actor);  
  label1.setBounds(xActor, yActor, 100, 50);    
  panel.add(label1);   
  frame.add(panel);
  frame.setSize(400,400);
  frame.addKeyListener(this);
  frame.setVisible(true);
 
  }
  public void moveBox(int newX,int newY)
  {
	  label1.setBounds(newX, newY, 100, 50); 
  }
@Override
public void keyPressed(KeyEvent event) {
	// TODO Auto-generated method stub
	String whichKey=KeyEvent.getKeyText(event.getKeyCode());
	
	
	if(whichKey.compareTo("Left")==0)
	{
		
		changeLayoutLeft();
	}else if(whichKey.compareTo("Right")==0){
		
		changeLayoutRight();
	}else if(whichKey.compareTo("Up")==0){
		
		changeLayoutUp();
	}else if(whichKey.compareTo("Down")==0){
		
		changeLayoutDown();	
	}else{		
	}	
	
	
}
public void changeLayoutLeft()
{
	xActor--;	
	moveBox(xActor,yActor);
	
}
public void changeLayoutRight()
{
	xActor++;
	moveBox(xActor,yActor);
}
public void changeLayoutUp()
{
	yActor--;
	moveBox(xActor,yActor);
}
public void changeLayoutDown()
{
	yActor++;
	moveBox(xActor,yActor);
}
@Override
public void keyReleased(KeyEvent arg0) {
	// TODO Auto-generated method stub
	
}
@Override
public void keyTyped(KeyEvent arg0) {
	// TODO Auto-generated method stub
	
}
}