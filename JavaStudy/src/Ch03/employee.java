package Ch03;

public class employee {

		private String FristName;
		private String SecondName;
		private double salary;

		public employee(String FirstName, String SecondName, double salary) {
			this.FristName = FirstName;
			this.SecondName = SecondName;
			this.salary = salary;
		}// 初始化constructor

		public void setFristName(String FristName) {
			this.FristName = FristName;
		}

		public String getFristName() {
			return FristName;
		}

		public void setSecondName(String salary) {
			this.SecondName = salary;
		}

		public String getSecondName() {
			return SecondName;
		}

		public void setSalary(double salary) {
			this.salary = salary;
		}

		public double getSalary() {
			return salary;
		}

		public void displayMessage() {
			if (salary > 0) {
				System.out.printf("%s %s's year salary :$%.2f\n", getFristName(), SecondName, 12 * salary);
				System.out.printf("%s %s's year salary with raise:$%.2f\n", 
						getFristName(), getSecondName(),12 * salary * 0.9);
			}
		}
	}
	
