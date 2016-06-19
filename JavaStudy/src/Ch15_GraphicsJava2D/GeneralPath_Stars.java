package Ch15_GraphicsJava2D;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;
import java.util.Random;
import javax.swing.JPanel;

public class GeneralPath_Stars extends JPanel{
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		Random random=new Random();
		
		int[] xPoints={55,67,109,73,83,55,27,37,1,43};
		int[] yPoints={0,36,36,54,96,72,96,54,36,36};
		
		
		Graphics2D g2d=(Graphics2D)g;
		GeneralPath star =new  GeneralPath();
		
		star.moveTo(xPoints[0],yPoints[0]);
		
		for(int i=1;i<yPoints.length;i++)
		{star.lineTo(xPoints[i], yPoints[i]);
		}
		star.closePath();
		g2d.translate(150, 150);
		
		for(int i=1;i<=20;i++){
			g2d.rotate(Math.PI/10);
			
			g2d.setColor(new Color(random.nextInt(256),random.nextInt(256),
					random.nextInt(256)));
			g2d.fill(star);
		}
	}

}
