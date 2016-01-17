//2015.10.6
package Ch02;

import java.util.Scanner;

public class Calculation_Circle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// D=diameter,C=circumference,S=area,r=radius
		System.out.print("Enter the circle'radius:");
		float radius = input.nextFloat();
		// 默认double 型的PI值，使用Eclipse的提示转换类型（Add cast to "float"）
		System.out.printf("Diameter of circle is %f\n", 2 * radius);
		System.out.printf("Circumference of circle is %g\n",2 * Math.PI * radius );
		
		System.out.printf("Area of circle is %f\n", (Math.PI * radius * radius));
	}

}

/*对circumference使用%d,输出错误，即f!-->int*/
/*对C使用%s,输出14位小数*/
//求double 的占位符
//%g,输出4位小数	
