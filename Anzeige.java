package start;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.swing.*;


public class Anzeige 
{
	JFrame frame = new JFrame("Chronas");
	public Anzeige()
	{
		//JFrame initialisieren
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(550, 550);
		
		//Pfad zur Datei
		frame.setFont(new Font("Arial", Font.BOLD, 35));//Test
		JLabel label = new JLabel("Pfad: ");
		label.setBounds(25, 100, 75, 35);
		frame.add(label);
		
 		final JTextField pfad = new JTextField();		//Textfeld
 		pfad.setBounds(100, 100, 350, 35);
 		frame.add(pfad);
 		
 		JButton pfadwahl = new JButton("...");			//Pfadauswahl
 		pfadwahl.setBounds(450, 100, 35, 35);
 		frame.add(pfadwahl);
 		pfadwahl.addActionListener(new ActionListener(){
 			@Override
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser chooser = new JFileChooser();
		        chooser.showOpenDialog(null);		    //Pfadauswahl anzeigen
				File f = chooser.getSelectedFile();
				pfad.setText(f.getAbsolutePath());
			}});
 		
 		//Button zum compilieren
 		JButton compilieren = new JButton("Start");			//Pfadauswahl
 		compilieren.setBounds(175, 300, 200, 100);
 		frame.add(compilieren);
 		
 		frame.setVisible(true);
	}
}
