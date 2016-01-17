package Ch02;

import java.util.Scanner;

public class Arithmetic {
	
	private static Scanner 	input = new Scanner(System.in);

	public static void main(String[] args) {
		
		int a, b, sum, product, difference, division;

		System.out.print("Enter first integer:");
		a = input.nextInt();
		System.out.print("Enter second integer:");
		b = input.nextInt();

		sum = a + b;
		product = a * b;
		difference = a - b;
		division = a / b;

		System.out.printf("Sum is %d\n", sum);
		System.out.printf("Product is %d\n", product);
		System.out.printf("Difference is %d\n", difference);
		System.out.printf("Division is %d\n", division);
	
	}

}