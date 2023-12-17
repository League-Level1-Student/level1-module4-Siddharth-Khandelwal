package _11_whack_a_mole;


import java.applet.AudioClip;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Iterator;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;



public class WhackAMole implements ActionListener {
	JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		int score = 0;
		int missed = 0;
		int correct = 0;
	public void run() {
	frame.add(panel);
		frame.setPreferredSize(new Dimension(300, 325));
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
frame.pack();

 }
 
	 
 
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton pressed = (JButton) e.getSource();
			if(pressed.getText() == "mole") {
				correct ++;
				speak("correct");
				playSound("dingg.wav");
				frame.remove(panel);
				panel = new JPanel();
				frame.add(panel);
				drawButtons();
			}
			else {
				missed ++;
				speak("missed");
			}
			if (correct == 10) {
				endGame(null, correct);
			}
			if (missed == 5) {
				endGame(null, correct);
			}
	}

static void speak(String words) {
    if( System.getProperty( "os.name" ).contains( "Windows" ) ) {
        String cmd = "PowerShell -Command \"Add-Type -AssemblyName System.Speech; (New-Object System.Speech.Synthesis.SpeechSynthesizer).Speak('"
                + words + "');\"";
        try {
            Runtime.getRuntime().exec( cmd ).waitFor();
        } catch( Exception e ) {
            e.printStackTrace();
        }
    } else {
        try {
            Runtime.getRuntime().exec( "say " + words ).waitFor();
        } catch( Exception e ) {
            e.printStackTrace();
        }
    }
}
private void endGame(Date timeAtStart, int molesWhacked) { 
    Date timeAtEnd = new Date();
    JOptionPane.showMessageDialog(null, "Your whack rate is "
            + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
                  + " moles per second.");
}
private void playSound(String fileName) { 
    AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
    sound.play();
}
}
