import java.util.Scanner;

import javax.swing.JFrame;


public class RectPanelTest {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Graphics");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		RectPanel panel = new RectPanel(400, 400);
		panel.setLayout(null);
		frame.add(panel);
		frame.setBounds(200, 200, 400, 400);
		frame.setVisible(true);
		panel.setHorizontalAndVertical(125, 200);
		panel.repaint();
		do {
			Scanner scanner = new Scanner(System.in);
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			panel.setHorizontalAndVertical(x, y);
			panel.repaint();
		} while(true);
	}
}
