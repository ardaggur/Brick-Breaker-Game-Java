// Fig. 11.45: PanelFrame.java
 // Using a JPanel to help lay out components.
 import java.awt.GridLayout;
 import java.awt.BorderLayout;
 import javax.swing.JFrame;
 import javax.swing.JPanel;
 import javax.swing.JButton;

public class PanelFrame extends JFrame
{
	private JPanel buttonJPanel; // panel to hold buttons
	private JButton buttons[]; // array of buttons
	// no-argument constructor
	public PanelFrame()
	{
		super( "Panel Demo" );
		buttons = new JButton[ 9 ]; // create buttons array
		buttonJPanel = new JPanel(); // set up panel
		buttonJPanel.setLayout( new GridLayout( 3, 3 ) );
		// create and add buttons
		for ( int count = 0; count < buttons.length; count++ )
		{
			buttons[ count ] = new JButton( ""+( count + 1 ) );
			buttonJPanel.add( buttons[ count ] ); // add button to panel
			
		}
		add( buttonJPanel, BorderLayout.EAST ); // add panel to JFrame
	}
}