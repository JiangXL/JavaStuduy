package Ch15_GraphicsJava2D;
import java.awt.Frame;

import javax.swing.JFrame;
public class Fontmetricstest {

	public static void main(String args[]){
		JFrame frame=new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Fontmetrics app=new Fontmetrics();
		frame.add(app);
		frame.setSize(300, 400);
		frame.setVisible(true);
	}
}
