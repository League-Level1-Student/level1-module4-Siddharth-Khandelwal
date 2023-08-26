package _01_nasty_surprise;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class nastySuprise implements ActionListener {
	JFrame frame = new JFrame("Trick or Treat");
	JPanel panel = new JPanel();
	JButton trick = new JButton("Trick");
	JButton treat = new JButton("Treat");
	private void showPictureFromTheInternet(String imageUrl) {
	    try {
	        URL url = new URL(imageUrl);
	        Icon icon = new ImageIcon(url);
	        JLabel imageLabel = new JLabel(icon);
	        JFrame frame = new JFrame();
	        frame.add(imageLabel);
	        frame.setVisible(true);
	        frame.pack();
	    } catch (MalformedURLException e) {
	        e.printStackTrace();
	    }
	}
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
showPictureFromTheInternet("https://di7dud5r8j0ls.cloudfront.net/fit-in/600x480/wordpress/wp-content/uploads/2016/07/Cover-Image1.jpg");	
}
if(pressed == treat) {
showPictureFromTheInternet("https://wallpapers.com/images/hd/scary-face-pictures-i7u89wtc6niurxru.jpg");
}

}
	

}
