package _11_whack_a_mole;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {
	JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		
	public void run() {
	frame.add(panel);
		frame.setSize(300, 325);
		frame.setVisible(true);
		drawButtons();
	}
	
  void drawButtons(){
	Random rand = new Random();
			int bob = rand.nextInt(23);	
			
			for (int i = 0; i < 24; i++) {
			JButton button = new JButton();
			panel.add(button);
			button.addActionListener(this);
			if (i == bob) {
				button.setText("mole");
			}
}


 }
 
	 
 
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton pressed = (JButton) e.getSource();
			
	}
}


