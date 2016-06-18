package Ch11_exceptionHanding;
import java.util.InputMismatchException;
import java.util.Scanner;

public class firstErroHanding {
	
	public static double cal(int n1,int n2){
		return n1/n2;
	}
	
	public static void main(String args[]){
		
	Scanner input=new Scanner(System.in);	
	boolean continueloop=true;
	do{
		try{
			//input two numbers 
			System.out.println(cal(input.nextInt(),input.nextInt()));
			continueloop=false;
		}
		catch(InputMismatchException inputmismatchexception){
			
			//print URL
			System.out.println(inputmismatchexception);
			
			System.out.println(inputmismatchexception.getMessage());
			//why print "null"
			
			System.out.println("what is love");
			
			System.out.println(inputmismatchexception.getStackTrace()[0].getClassName());
			System.out.println(inputmismatchexception.getStackTrace()[1].getClassName());
			System.out.println(inputmismatchexception.getStackTrace()[0].getMethodName());
			
			System.out.println(inputmismatchexception.getStackTrace()[0].getFileName());
			//why print "null"
			
			System.out.println(inputmismatchexception.getStackTrace()[1].getLineNumber());
			//why print "-1"
			
			//print all err info
			inputmismatchexception.printStackTrace();
			
			input.nextLine();

		}
		catch(ArithmeticException arithmeticexception){
			System.out.println(arithmeticexception);
			
		}
		finally{
			System.out.println("Finally,How is world?");
		}
	}
	while(continueloop);
	}
}
