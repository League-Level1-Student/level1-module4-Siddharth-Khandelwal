package _11_whack_a_mole;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {

	public void run() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		for (int i = 0; i < 23; i++) {
			JButton button = new JButton();
			panel.add(button);
			button.addActionListener(this);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton pressed = (JButton) e.getSource();
		
		
	}

}
