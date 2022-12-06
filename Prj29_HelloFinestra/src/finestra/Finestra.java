package finestra;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Finestra extends JFrame{

	
	public static void main(String[] args) {
		JFrame mioFrame = new JFrame();
		JLabel label = new JLabel();
		label.setText("test");
		
		Rettangolo r = new Rettangolo();
		
		mioFrame.setSize(400, 300);
		mioFrame.setTitle("La mia prima finestra");
		
		mioFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mioFrame.getContentPane().setBackground(new Color(180, 90, 120));
		
		
		mioFrame.add(r);
		
		mioFrame.setVisible(true);

	}

}
