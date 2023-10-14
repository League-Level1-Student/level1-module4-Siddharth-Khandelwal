package _05_typing_tutor;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class typingTutor implements KeyListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	char currentLetter;
	JLabel label = new JLabel();
	void setup(){
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		currentLetter = generateRandomLetter();
	
		label.setText(currentLetter+"");
		label.setFont(label.getFont().deriveFont(28.0f));
		label.setHorizontalAlignment(JLabel.CENTER);
		frame.addKeyListener(this);
		panel.add(label);
		frame.add(panel);
		frame.pack();
	}
	char generateRandomLetter() {
	    Random r = new Random();
	    return (char) (r.nextInt(26) + 'a');
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
		System.out.println("you pressed "+e.getKeyChar());
		if(e.getKeyChar() == currentLetter) {
			System.out.println("Correct Letter Typed");
			panel.setBackground(Color.GREEN);
		}
		else {
			System.out.println("Incorrect Letter Typed");
			panel.setBackground(Color.RED);
		}
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		currentLetter = generateRandomLetter();
		label.setText(currentLetter+"");
	}
}
