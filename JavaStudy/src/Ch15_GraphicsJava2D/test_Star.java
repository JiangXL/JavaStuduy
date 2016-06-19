package Ch15_GraphicsJava2D;
import java.awt.Color;

import javax.swing.JFrame;

public class test_Star {
	public static void main(String[] rags){
	
	JFrame Frame=new JFrame("Draw 2D");
	Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	GeneralPath_Stars stars=new GeneralPath_Stars();
	Frame.add(stars);
	Frame.setBackground(Color.blue);
	Frame.setSize(315,330);
	Frame.setVisible(true);
	}

}
