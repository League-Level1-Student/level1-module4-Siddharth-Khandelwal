package _08_calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {
	JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JTextField tf1 = new JTextField(10);
		JTextField tf2 = new JTextField(10);
		JLabel l1 = new JLabel("Number 1:");
		JLabel l2 = new JLabel("Number 2:");
		JButton add= new JButton("+");
		JButton subtract = new JButton("-");
		JButton multiply = new JButton("*");
		JButton divide = new JButton("/");
	public void run() {
	frame.add(panel);
		panel.add(l1);
		panel.add(tf1);
		panel.add(l2);
		panel.add(tf2);
		panel.add(add);
		panel.add(subtract);
		panel.add(multiply);
		panel.add(divide);
		frame.setVisible(true);
		frame.pack();
		
		add.addActionListener(this);
		subtract.addActionListener(this);
		multiply.addActionListener(this);
		divide.addActionListener(this);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String bob = tf1.getText();
		String tom = tf2.getText();
		double num1 = Double.parseDouble(bob);
		double num2 = Double.parseDouble(tom);
		JButton bpressed = (JButton) e.getSource();
		if(bpressed == add) {
			JOptionPane.showMessageDialog(null, "Answer: "+(num1+num2));
		}
		if(bpressed == subtract) {
			JOptionPane.showMessageDialog(null, "Answer: "+(num1-num2));
		}
		if(bpressed == multiply) {
			JOptionPane.showMessageDialog(null, "Answer: "+(num1*num2));
		}
		if(bpressed == divide) {
			JOptionPane.showMessageDialog(null, "Answer: "+(num1/num2));
		}
	}

}
