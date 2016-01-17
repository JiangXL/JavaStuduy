//2015.10.6

package Ch02;

import java.util.Scanner;

public class ComparingIntegers {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		System.out.print("Enter first integer:");
		int a=input.nextInt();
		System.out.print("Enter second integer:");
		int b=input.nextInt();
		
		if(a>b)
			System.out.printf("%d is larger",a);
		if(a==b)
			System.out.print("These numbers are equal");
		if(a<b)
			System.out.printf("%d is larger",b);
		
		input.close();
	}
}
