package Ch03;
	import java.util.Scanner;

public class Account_test {

		public static void main(String[] args) {
			Account account1 = new Account(50.00);
			System.out.printf("account balance:￥%.2f\n", account1.getBalance());
			Scanner input = new Scanner(System.in);
			System.out.printf("Enter your withdraw money:");
			double debit= input.nextDouble();
			account1.debit(debit);
			input.close();
		}
	}

