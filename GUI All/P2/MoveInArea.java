import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class MoveInArea extends JFrame implements KeyListener {
	private JLabel[] myLabels;
	
	Icon actor=new ImageIcon(getClass().getResource("actor.jpg"));
	Icon iconEmpty=new ImageIcon(getClass().getResource("empty.jpg"));
	//private Container myContainer;
	private GridLayout myGridLayout;
	private int iActor;
	private int jActor;
	
	private int row=8;
	private int column=6;
	
	public MoveInArea()
	{
		super("myGridLayout");
		int i;
		
		iActor=2;
		jActor=3;	
		
		
		
		
		
		myGridLayout=new GridLayout(row,column,1,1);
		
		setLayout(myGridLayout);
		myLabels=new JLabel[row*column];
		
		
		for(i=0;i<row*column;i++)
		{
			
			
			myLabels[i]=new JLabel(iconEmpty);
		
			add(myLabels[i]);			
		}
		
		
		
		myLabels[iActor*column+jActor].setIcon(actor);
		
		addKeyListener(this);
		
		
		
		
		
	
			
			
				
		
	}

	
	
	
	private void changeLayoutLeft()
	{	
		myLabels[iActor*column+jActor].setIcon(iconEmpty);
		jActor--;		
		myLabels[iActor*column+jActor].setIcon(actor);				
		
	}
	
	private void changeLayoutRight()
	{	
		myLabels[iActor*column+jActor].setIcon(iconEmpty);
		jActor++;		
		myLabels[iActor*column+jActor].setIcon(actor);				
		
	}
	
	private void changeLayoutUp()
	{	
		myLabels[iActor*column+jActor].setIcon(iconEmpty);
		iActor--;		
		myLabels[iActor*column+jActor].setIcon(actor);				
		
	}
	private void changeLayoutDown()
	{	
		myLabels[iActor*column+jActor].setIcon(iconEmpty);
		iActor++;		
		myLabels[iActor*column+jActor].setIcon(actor);				
		
	}
	
	@Override
	public void keyPressed(KeyEvent event) {
		// TODO Auto-generated method stub
		
		String whichKey=KeyEvent.getKeyText(event.getKeyCode());
		
		
		if(whichKey.compareTo("Left")==0)
		{
			if(isAllowed(iActor,jActor-1))
			{
				changeLayoutLeft();
			}
		}else if(whichKey.compareTo("Right")==0){
			if(isAllowed(iActor,jActor+1))
			{
				changeLayoutRight();
			}
		}else if(whichKey.compareTo("Up")==0){
			if(isAllowed(iActor-1,jActor))
			{
				changeLayoutUp();
			}
		}else if(whichKey.compareTo("Down")==0){
			if(isAllowed(iActor+1,jActor))
			{
				changeLayoutDown();	
			}
		}else{		
		}	
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	public boolean isAllowed(int i,int j)
	{
		if(i==0 || i==row-1 || j==0 || j==column-1)
		{
			return false;
		}else{
			return true;
		}
	}

}


