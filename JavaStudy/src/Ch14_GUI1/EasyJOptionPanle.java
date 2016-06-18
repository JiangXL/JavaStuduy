package Ch14_GUI1;
import javax.swing.JOptionPane;

public class EasyJOptionPanle {
	
	//easy class to try JOptionPanle
   public static void  main(String args[]){
	   String fristnumber=
			   JOptionPane.showInputDialog("Enter the first number you love ");
	   String secondnumber=
			   JOptionPane.showInputDialog("Key the quality of your class today");
	   
	   int frist=Integer.parseInt(fristnumber);
	   int  second=Integer.parseInt(secondnumber);
	   int sum=frist+second;
	   JOptionPane.showMessageDialog(null, "The sum is"+sum,
			   "Sum of two numbers",JOptionPane.PLAIN_MESSAGE);
	   
   }
	
}
