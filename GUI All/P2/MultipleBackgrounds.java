// Fig. 11.45: PanelFrame.java
 // Using a JPanel to help lay out components.
 import java.awt.GridLayout;
 import java.awt.BorderLayout;
import java.io.IOException;

 import javax.swing.JFrame;
 import javax.swing.JPanel;
import javax.swing.JButton;

public class MultipleBackgrounds extends JFrame
{
	private JPanelWithBackground backgroundJPanel; // panel to hold backgrounds
	private JPanelWithBackground myJPanelWithBackgrounds[]; // array of buttons
	// no-argument constructor
	public MultipleBackgrounds() throws IOException
	{
		super( "Panel Demo" );
		myJPanelWithBackgrounds = new JPanelWithBackground[ 6 ]; // create buttons array
		backgroundJPanel = new JPanelWithBackground("background7.jpg"); // set up panel
		backgroundJPanel.setLayout( new GridLayout( 3, 2,20,20 ) );
		// create and add buttons
		for ( int count = 0; count < myJPanelWithBackgrounds.length; count++ )
		{
			myJPanelWithBackgrounds[ count ] = new JPanelWithBackground("background"+(count+1)+".jpg");
			backgroundJPanel.add( myJPanelWithBackgrounds[ count ] ); // add button to panel
			
		}
		add( backgroundJPanel, BorderLayout.CENTER ); // add panel to JFrame
		
	}
}