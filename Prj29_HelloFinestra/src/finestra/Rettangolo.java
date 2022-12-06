package finestra;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Rettangolo extends Component {
	public void paintComponent(Graphics g){
		
		Graphics2D g2 = (Graphics2D) g;
		
		Rectangle box = new Rectangle(5,10,20,30);
		
		g2.draw(box);
		
		
		
		box.translate(55, 25);
		
		g2.draw(box);
	}
}
