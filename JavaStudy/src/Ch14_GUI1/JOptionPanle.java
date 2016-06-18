package Ch14_GUI1;

//Fig. 14.2: Addition.java
//Addition program that uses JOptionPane for input and output.
import javax.swing.JOptionPane;

public class JOptionPanle {
	// program uses JOptionPane
	public static void main(String[] args) {
		// obtain user input from JOptionPane input dialogs
		String firstNumber = JOptionPane.showInputDialog("Enter first integer");
		String secondNumber = JOptionPane.showInputDialog("Enter second integer");
		String operation = JOptionPane.showInputDialog("Enter the operation");

		// convert String inputs to int values for use in a calculation
		int number1 = Integer.parseInt(firstNumber);
		int number2 = Integer.parseInt(secondNumber);
		int result = 0;
		switch (operation) {
		case "+":
			result = number1 + number2;
			break;// add numbers
		case "*":
			result = number1 * number2;
			break;
		case "/":
			result = number1 / number2;
			break;
		case "%":
			result = number1 % number2;
			break;
		default:
			System.out.println("erro");
		}

		// display result in a JOptionPane message dialog
		JOptionPane.showMessageDialog(null, "The Result is " + result, "Result of Two Integers",
				JOptionPane.PLAIN_MESSAGE);
	} // end method main
} // end class Addition

/**************************************************************************
 * (C) Copyright 1992-2010 by Deitel & Associates, Inc. and * Pearson Education,
 * Inc. All Rights Reserved. * * DISCLAIMER: The authors and publisher of this
 * book have used their * best efforts in preparing the book. These efforts
 * include the * development, research, and testing of the theories and programs
 * * to determine their effectiveness. The authors and publisher make * no
 * warranty of any kind, expressed or implied, with regard to these * programs
 * or to the documentation contained in these books. The authors * and publisher
 * shall not be liable in any event for incidental or * consequential damages in
 * connection with, or arising out of, the * furnishing, performance, or use of
 * these programs. *
 *************************************************************************/
