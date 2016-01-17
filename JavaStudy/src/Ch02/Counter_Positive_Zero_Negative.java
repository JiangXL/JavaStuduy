//2015.10.6
package Ch02;

import java.util.Scanner;

public class Counter_Positive_Zero_Negative {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入第一个数字：");
		double a = input.nextDouble();
		System.out.print("请输入第二个数字：");
		double b = input.nextDouble();
		System.out.print("请输入第三个数字：");
		double c = input.nextDouble();
		System.out.print("请输入第四个数字：");
		double d = input.nextDouble();
		System.out.print("请输入第五个数字：");
		double e = input.nextDouble();

		int Negative = 0, Positive = 0, Zero = 0;
		/* Negative=the Number Of Negative, 
		 * Positive=the Number Of Positive,
		 *  Zero=the Number Of Zeros*/

		if (a > 0)
			Negative++;
		if (a == 0)
			Zero++;
		if (a < 0)
			Positive++;
		if (b > 0)
			Negative++;
		if (b == 0)
			Zero++;
		if (b < 0)
			Positive++;
		if (c > 0)
			Negative++;
		if (c == 0)
			Zero++;
		if (c < 0)
			Positive++;
		if (d > 0)
			Negative++;
		if (d == 0)
			Zero++;
		if (d < 0)
			Positive++;
		if(e>0)
			Negative++;
		if(e==0)
			Zero++;
		if(e<0)
			Positive++;//计算正数、负数、零的个数
		
		System.out.printf("The number of Negative is %d\n",Negative);
		System.out.printf("The number of Postive is %d\n",Positive);
		System.out.printf("The number of Zeros is %d\n",Zero);
		//Other way
		
		 Negative = 0;
		 Positive = 0;
		 Zero = 0;
		for(int i=1;i<=5;i++){
			System.out.printf("请输入第%d个数字：",i);
			double SALLY = input.nextDouble();
			if(SALLY>0){
				Positive++;
			}
			else if(SALLY==0){
				Zero++;
			}
			else{
				Negative++;
			}
		}
		
		System.out.printf("The number of Negative is %d\n",Negative);
		System.out.printf("The number of Postive is %d\n",Positive);
		System.out.printf("The number of Zeros is %d\n",Zero);
		
	}

}
// D:缺少"String []args"将无法编译