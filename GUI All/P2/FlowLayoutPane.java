import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FlowLayoutPane extends JPanel {
  public FlowLayoutPane() {
    // Use a FlowLayout layout manager. Left justify rows.
    // Leave 10 pixels of horizontal and vertical space between components.
    this.setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 10));

    // Add some buttons to demonstrate the layout.
    String spaces = ""; // Used to make the buttons different
    for (int i = 1; i <= 9; i++) {
      this.add(new JButton("Button #" + i + spaces));
      spaces += " ";
    }

    // Give ourselves a default size
    this.setPreferredSize(new Dimension(500, 200));
  }
  
}
