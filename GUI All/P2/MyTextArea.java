import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JTextArea;


public class MyTextArea {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame= new JFrame("TextArea frame");
		  frame.setLayout(new FlowLayout());
		  JTextArea jt= new JTextArea("My text area",5,20);
		  jt.setEditable(false);
		  jt.setText("new text");
		  frame.add(jt);
		  frame.setSize(250,200);
		  frame.setVisible(true);
		  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
