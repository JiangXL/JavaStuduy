/**
 * 
 */
package assigements;

/**
 * @author weirdest_tap
 *
 */
public class testDate2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Date2 date =new Date2(2,3,2015);
		date.nextDay("month", 1);
		System.out.println("---------");
		Date2 date2=new Date2(2,3,2015);
		date2.nextDay("year", 1);
		
		
		
		
	}

}
