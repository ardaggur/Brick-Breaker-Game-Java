import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;


public class RectPanel extends JPanel {
	
	int horizontal;
	int vertical;
	static int width = 50;
	static int height = 50;
	int horizontalBound;
	int verticalBound;
	
	public RectPanel(int horizontalBound, int verticalBound) {
		this.horizontalBound = horizontalBound;
		this.verticalBound = verticalBound;
	}

	public void setHorizontalAndVertical(int horizontal, int vertical) {
		this.horizontal = horizontal;
		this.vertical = vertical;
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.BLACK);
		//g.fillRect(horizontal, vertical, width, height);
		g.fillOval(horizontal, vertical, width, height);
	}
	
}
