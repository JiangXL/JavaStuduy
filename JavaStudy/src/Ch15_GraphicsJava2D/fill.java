package Ch15_GraphicsJava2D;

import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JPanel;
public class fill extends JPanel {
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		this.setBackground(Color.white);
		g.setColor(Color.MAGENTA);
		g.fillRect(23, 7, 9, 3);


		Color newcolor=Color.magenta;
		g.setColor(newcolor);
		g.fillRect( 23,14,9,3);
	}	
}
