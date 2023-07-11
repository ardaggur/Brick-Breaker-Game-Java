import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class JPanelWithBackgroundTest {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		JPanel panel=new JPanelWithBackground("yeditepe.png");
		JFrame frame = new JFrame("Lab9"); 
		frame.add(panel);
		frame.setSize(400,400);		
		frame.setVisible(true);
	}

}
