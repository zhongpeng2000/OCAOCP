package Chap16;

//Demonstrate a push button and handle action events. 

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ButtonDemo implements ActionListener {

	JLabel jlab;

	ButtonDemo() {

		// Create a new JFrame container.
		JFrame jfrm = new JFrame("A Button Example");

		// Specify FlowLayout for the layout manager.
		jfrm.getContentPane().setLayout(new FlowLayout());

		// Give the frame an initial size.
		jfrm.setSize(394, 328);

		// Terminate the program when the user closes the application.
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Make two buttons.
		JButton jbtnUp = new JButton("Up");
		//jbtnUp.setHorizontalAlignment(SwingConstants.TRAILING);
		JButton jbtnDown = new JButton("Up");
		//you can set the action command to whatever you like
		jbtnDown.setActionCommand("Down");
		//jbtnDown.setHorizontalAlignment(SwingConstants.RIGHT);

		// Add action listeners.
		jbtnUp.addActionListener(this);
		jbtnDown.addActionListener(this);

		// Add the buttons to the content pane.
		jfrm.getContentPane().add(jbtnUp);
		jfrm.getContentPane().add(jbtnDown);

		// Create a label.
		jlab = new JLabel("Press a button.");

		// Add the label to the frame.
		jfrm.add(jlab);

		// Display the frame.
		jfrm.setVisible(true);
	}

	// Handle button events.
	public void actionPerformed(ActionEvent ae) {
		if (ae.getActionCommand().equals("Up"))
			jlab.setText("You pressed Up.");
		else
			jlab.setText("You pressed down. ");
	}

	public static void main(String args[]) {
		// Create the frame on the event dispatching thread.
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new ButtonDemo();
			}
		});
	}
}