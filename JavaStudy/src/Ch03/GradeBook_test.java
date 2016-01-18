package Ch03;

public class GradeBook_test {

	public static void main(String []args){
		GradeBook German=new GradeBook();
		German.setName("SALLY","German");
		German.displayName();
		
		System.out.println("\n");
		
		GradeBook  Thermodynamic =new GradeBook();
		Thermodynamic.setName("Bolztmam", "My Thermodynamic");
		Thermodynamic.displayName();
		
		
		/*
		 * T_T,原来可以不用method来做get 和set; 
		 * 在testclass可以用路径来获取和赋值
		 */

	}
}
