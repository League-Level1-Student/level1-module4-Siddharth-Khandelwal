package _10_pig_latin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Pig_Latin implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextField eng = new JTextField(50);
	JButton right = new JButton(">>");
	JButton left = new JButton("<<");
	JTextField pigl = new JTextField(50);
	JButton speak = new JButton("Speak");
	public void run() {
		frame.add(panel);
		panel.add(eng);
		panel.add(right);
		panel.add(left);
		panel.add(pigl);
		panel.add(speak);
		frame.setVisible(true);
		frame.pack();

		right.addActionListener(this);
		left.addActionListener(this);
		speak.addActionListener(this);

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton pressed = (JButton) e.getSource();

	}

}
