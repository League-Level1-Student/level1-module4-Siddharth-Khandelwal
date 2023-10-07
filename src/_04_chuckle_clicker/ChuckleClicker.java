package _04_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	JFrame cero = new JFrame();
	JButton uno = new JButton("joke");
	JButton dos = new JButton("punchline");
	JPanel tres = new JPanel();
public void run() {

cero.setVisible(true);
cero.add(tres);
tres.add(uno);
tres.add(dos);
uno.addActionListener(this);
dos.addActionListener(this);
cero.pack();
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JButton buttonPressed = (JButton) e.getSource();
	if(buttonPressed == uno) {
		JOptionPane.showMessageDialog(null, "What is gray and not very heavy?");
	}
	if(buttonPressed == dos) {
		JOptionPane.showMessageDialog(null, "Light Gray");
	}
}

}
