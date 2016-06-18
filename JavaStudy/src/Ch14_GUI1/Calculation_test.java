package Ch14_GUI1;

import javax.swing.JFrame;

import com.sun.org.apache.bcel.internal.generic.AALOAD;

public class Calculation_test {
public static void main(String args[]){

	Calculation app=new Calculation();

	app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	app.setSize(440,640);
	app.setVisible(true);
}
}
