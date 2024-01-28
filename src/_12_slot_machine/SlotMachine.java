package _12_slot_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel uno = new JLabel();
	JLabel dos = new JLabel();
	JLabel tres = new JLabel();
	JButton spin = new JButton("SPIN");
int i = 0;
private Clip jeopardyThemeClip;
	public void run() {
		panel.add(uno);
		panel.add(dos);
		panel.add(tres);
		frame.add(panel);
		panel.add(spin);
		frame.pack();
		frame.setVisible(true);
		assigning();
		spin.addActionListener(this);
	}

	private JLabel createLabelImage(String fileName) throws MalformedURLException {
		URL imageURL = getClass().getResource(fileName);
		if (imageURL == null) {
			System.err.println("Could not find image " + fileName);
			return new JLabel();
		}
		Icon icon = new ImageIcon(imageURL);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton bpressed = (JButton) e.getSource();
		if (bpressed == spin) {
			assigning();
		}
	}
	

	public void assigning() {
		panel.remove(uno);
		panel.remove(dos);
		panel.remove(tres);
		Random rand = new Random();
		int onee = rand.nextInt(3);
		int twoo = rand.nextInt(3);
		int threee = rand.nextInt(3);
		String grap = "grapes.jpg";
		String orang = "orange.jpg";
		String cherr = "cherry1.jpg";
		try {
			if (onee == 0) {
				uno = createLabelImage(grap);
			} else if (onee == 1) {
				uno = createLabelImage(orang);
			} else {
				uno = createLabelImage(cherr);
			}
			if (twoo == 0) {
				dos = createLabelImage(grap);
			} else if (twoo == 1) {
				dos = createLabelImage(orang);
			} else {
				dos = createLabelImage(cherr);
			}
			if (threee == 0) {
				tres = createLabelImage(grap);
			} else if (threee == 1) {
				tres = createLabelImage(orang);
			} else {
				tres = createLabelImage(cherr);
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		panel.add(uno);
		panel.add(dos);
		panel.add(tres);
		frame.pack();
		if(onee == twoo && twoo == threee) {
			JOptionPane.showMessageDialog(null, "YOU WIN");
			i++;
			JOptionPane.showMessageDialog(null, "Wins: "+i+"");
			playJeopardyTheme();
		}
	}
	public void playJeopardyTheme() {
		String fileName = "src/_12_slot_machine/boom.wav";
		// Note: use .wav files
		try {
			jeopardyThemeClip = AudioSystem.getClip();
			AudioInputStream inputStream = AudioSystem.getAudioInputStream(new File(fileName));
			jeopardyThemeClip.open(inputStream);
			jeopardyThemeClip.start();
		} catch (Exception e) {
			System.out.println("play sound error: " + e.getMessage() + " for " + fileName);
		}
	}
}
