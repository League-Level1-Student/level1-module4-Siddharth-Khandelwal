package _12_slot_machine;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SlotMachine {
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JLabel uno = new JLabel();
JLabel dos = new JLabel();
JLabel tres = new JLabel();
JButton spin = new JButton("SPIN");
	public void run() {
		frame.add(panel);
		panel.add(uno);
		panel.add(dos);
		panel.add(tres);
		panel.add(spin);
		frame.pack();
		frame.setVisible(true);
		
	}

}
