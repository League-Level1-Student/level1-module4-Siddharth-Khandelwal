package _01_nasty_surprise;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class nastySuprise implements ActionListener {
	JFrame frame = new JFrame("Trick or Treat");
	JPanel panel = new JPanel();
	JButton trick = new JButton("Trick");
	JButton treat = new JButton("Treat");
	
public void run() {
	frame.add(panel);
	panel.add(trick);
	panel.add(treat);
	frame.setVisible(true);
	frame.pack();
	trick.addActionListener(this);
	treat.addActionListener(this);
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JButton pressed = (JButton) e.getSource();
if(pressed == trick) {
	System.out.println("hi");
}
if(pressed == treat) {
	System.out.println("hi");
}

}
	

}
