import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;


public class AnaMenuTest {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		JPanel panel=new AnaMenu("uzay.png");
		JFrame frame = new JFrame("Arkanoid Game");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ActionListener actionListener = new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				String command = actionEvent.getActionCommand();
				System.out.println("Selected: " + command);

				if(command.equals("New Game"))
				{
					Level1 level1 = new Level1();
					try {
						level1.createGUI();
						new Thread(level1).start();
					} catch (IOException e) {
						e.printStackTrace();
					}

					/*Level2 level2 = new Level2();
					try {
						level2.createGUI();
						new Thread(level2).start();
					} catch (IOException e) {
						e.printStackTrace();
					}

					Level3 level3 = new Level3();
					try {
						level3.createGUI();
						new Thread(level3).start();
					} catch (IOException e) {
						e.printStackTrace();
					}*/
				}

				else if(command.equals("Options"))
				{
					JOptionPane.showMessageDialog(null,"We don't have any options","Options",JOptionPane.INFORMATION_MESSAGE);
				}

				else if(command.equals("Scores"))
				{
					JOptionPane.showMessageDialog(null,"First Level: 180 Points\nSecond Level: 400 Points\nThird Level: 670 Points","Scores",JOptionPane.INFORMATION_MESSAGE);
				}

				else if(command.equals("About"))
				{
					JOptionPane.showMessageDialog(null,"This game is written by Arda Gür.","About",JOptionPane.INFORMATION_MESSAGE);
				}
				else if(command.equals("Help"))
				{
					JOptionPane.showMessageDialog(null,"You can move your bar using Left and Right keys.","Help",JOptionPane.INFORMATION_MESSAGE);
				}
				else if(command.equals("Exit"))
				{
					if (JOptionPane.showConfirmDialog( null,"Are you sure you want to exit? ","Exit",
							JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
						System.exit(0);
				}
			}
		};

		JButton button1 = new JButton("New Game");
		button1.setActionCommand("New Game");
		button1.addActionListener(actionListener);
		button1.setBounds(150,100,240,80);
		panel.add(button1);

		JButton button2 = new JButton("Options");
		button2.setActionCommand("Options");
		button2.setBounds(150,200,240,80);
		button2.addActionListener(actionListener);
		panel.add(button2);

		JButton button3 = new JButton("Scores");
		button3.setActionCommand("Scores");
		button3.setBounds(150,300,240,80);
		button3.addActionListener(actionListener);
		panel.add(button3);

		JButton button4 = new JButton("Help");
		button4.setActionCommand("Help");
		button4.setBounds(150,400,240,80);
		button4.addActionListener(actionListener);
		panel.add(button4);

		JButton button5 = new JButton("About");
		button5.setActionCommand("About");
		button5.setBounds(150,500,240,80);
		button5.addActionListener(actionListener);
		panel.add(button5);

		JButton button6 = new JButton("Exit");
		button6.setActionCommand("Exit");
		button6.setBounds(150,600,240,80);
		button6.addActionListener(actionListener);
		panel.add(button6);

		panel.setLayout(null);
		frame.add(panel);
		frame.setSize(555,850);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

}
