package Ch03;

public class Account {
	
	private double balance;
	
	
	public Account(double initialBalance) {
		if (initialBalance > 0.0)
			balance = initialBalance;
	}

	
	public void debit(double amount) {
		balance = balance - amount;
		if (balance < 0)
			System.out.print("Debit amount exceeded account balance.");
		else{System.out.printf("\nwithdrawing %.2f to account1 balance\n\n", amount);
		System.out.printf("account balance:￥%.2f", balance);}
	}

	public double getBalance() {
		return balance;
	}

}