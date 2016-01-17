package Ch08;

public class DateClass {
		public DateClass(int MM, int DD, int YY) {
			System.out.println(MM + "/" + DD + "/" + YY);
		}

		public DateClass(String Month,int day,int year){
			System.out.println(Month+" "+day+","+year);
		}

		public DateClass(int DDD,int YYYY){
			System.out.println(DDD+" "+YYYY);
		}
		public static void main(String args[]) {
			
			DateClass d1=new DateClass(7,24,2013);
			DateClass d2=new DateClass("June",13,2012);
			DateClass d3=new DateClass(360,2015);
		}

	}
		

