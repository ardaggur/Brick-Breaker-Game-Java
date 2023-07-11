import java.io.IOException;

import javax.swing.JFrame;
public class MultipleBackgroundsTest extends JFrame
{
	public static void main( String args[] ) throws IOException
	{
		MultipleBackgrounds myMultipleBackgrounds = new MultipleBackgrounds();
		myMultipleBackgrounds.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		myMultipleBackgrounds.setSize( 600,600 ); // set frame size
		myMultipleBackgrounds.setVisible( true ); // display frame
	}
}