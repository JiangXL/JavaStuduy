package assigements;

public class Date {


	public Date(int MM, int DD, int YY) {
		System.out.println(MM + "/" + DD + "/" + YY);
	}

	public Date(String Month,int day,int year){
		System.out.println(Month+" "+day+","+year);
	}

	public Date(int DDD,int YYYY){
		System.out.println(DDD+" "+YYYY);
	}
	public static void main(String args[]) {
		
		Date d1=new Date(7,24,2013);
		Date d2=new Date("June",13,2012);
		Date d3=new Date(360,2015);
	}

}
