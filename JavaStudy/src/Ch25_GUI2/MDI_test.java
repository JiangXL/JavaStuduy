package Ch25_GUI2;

import javax.swing.JFrame;
public class MDI_test {
	public static void main(String args[]){
		
		MDI desktop=new MDI();
		desktop.setLocationRelativeTo(desktop);//setLocationRelativeTo();
		desktop.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		desktop.setSize(500,430);
		desktop.setVisible(true);
	}
}
