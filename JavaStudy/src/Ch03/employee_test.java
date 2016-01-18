package Ch03;

public class employee_test {


		public static void main(String []args) {
			employee employee1 = new employee("Healer", "Kepler", 700);
			employee employee2 = new employee("Chris", "Cauchy", 799);
			
			employee1.displayMessage();
			employee2.displayMessage();
		}
	}
