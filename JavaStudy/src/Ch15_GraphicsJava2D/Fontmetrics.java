package Ch15_GraphicsJava2D;

import java.awt.Font;
import java.text.AttributedCharacterIterator;
import java.awt.*;
import javax.swing.JPanel;

public class Fontmetrics extends JPanel{
	 public void paintComponent(Graphics g){
		 super.paintComponent(g);
		 g.setFont(new Font("SansSerif",Font.BOLD,12));
		 g.drawString(g.getFont().getFontName(), 100, 100);
	 }
	

}
