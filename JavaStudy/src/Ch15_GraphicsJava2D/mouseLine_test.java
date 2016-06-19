package Ch15_GraphicsJava2D;
import javax.swing.JFrame;
public class mouseLine_test {
	public static void main(String[] args){
		JFrame frame=new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.add(new mouseLine());
		frame.setSize(500, 350);
		frame.setVisible(true);
		}
}
