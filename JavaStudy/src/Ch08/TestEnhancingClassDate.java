package Ch08;

public class TestEnhancingClassDate {


		public static void main(String[] args) {
			
			EnhancingClassDate date =new EnhancingClassDate(2,3,2015);
			date.nextDay("month", 1);
			date.nextDay("year", 1);
			
		}

	}