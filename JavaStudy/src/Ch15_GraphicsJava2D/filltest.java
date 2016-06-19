package Ch15_GraphicsJava2D;
import javax.swing.JFrame;
public class filltest {
public static void main(String args[]){
	JFrame Frame =new JFrame("Using color");
	Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	fill colorjpanel=new fill();
	Frame.add(colorjpanel);
	
	Frame.setSize(999,999);
	Frame.setVisible(true);

}
}
