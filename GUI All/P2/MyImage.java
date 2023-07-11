import java.awt.FlowLayout;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;


public class MyImage extends JFrame {
	public MyImage()
	{
		super("My New JFrame");
		Icon myIcon = new ImageIcon(getClass().getResource("cat.jpg"));
	
		JButton myButton=new JButton(myIcon);		
		add(myButton);
		setLayout(new FlowLayout());
		setSize(300, 200);
	    setVisible(true);
		
	}
	public static void main(String args[])
	{
		new MyImage();
	}

}
