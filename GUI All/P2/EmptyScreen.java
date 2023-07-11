import java.awt.GridLayout;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class EmptyScreen extends JFrame  {

	
	private JLabel[] myLabels;
	Icon actor=new ImageIcon(getClass().getResource("actor.jpg"));
	Icon iconEmpty=new ImageIcon(getClass().getResource("empty.jpg"));
	private GridLayout myGridLayout;
	private int row=8;
	private int column=6;
	
	public EmptyScreen()
	{
		super("myGridLayout");
	//	String[] myNames = new String[row*column];
	/*	for(int i = 0;i<row*column;i++)
		{
			myNames[i]="";
		}*/
		
		myGridLayout=new GridLayout(row,column,5,5);
		setLayout(myGridLayout);
		myLabels=new JLabel[row*column];
		
		int i=0;
		myLabels[i]=new JLabel(actor);
		add(myLabels[i]);
		
		
		for(i=1;i<row*column;i++)
		{
			
			
			myLabels[i]=new JLabel(iconEmpty);
		
			add(myLabels[i]);	
			
		}		
	}	
}
