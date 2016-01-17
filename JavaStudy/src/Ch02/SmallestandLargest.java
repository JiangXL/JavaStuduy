
//2015.10.6

package Ch02;

import java.util.Scanner;

public class SmallestandLargest {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		
		System.out.print("请输入第一个整数：");
		int n1=input.nextInt();
		System.out.print("请输入第二个整数：");
		int n2=input.nextInt();
		System.out.print("请输入第三个整数：");
		int n3=input.nextInt();
		
		
		System.out.printf("Sum is %d\n",n1+n2+n3);
		System.out.printf("Average is %d\n",(n1+n2+n3)/3);
		System.out.printf("Product is %s\n",n1*n2*n3);
		
		if(n1>=n2&&n1>n3&&n2>n3)
			System.out.printf("最大的数是 %d\n最小的数是 %d\n",n1,n3);
		if(n1>n2&&n1>n3&&n3>=n2)
			System.out.printf("最大的数是%d\n最小的数是%d\n",n1,n2);
		if(n2>=n1&&n2>n3&&n1>n3)
			System.out.printf("最大的数是%d\n最小的数是%d\n",n2,n3);
		if (n2>n1&&n2>n3&&n3>=n1)
			System.out.printf("最大的数是%d\n最小的数是%d\n",n2,n1);
		if(n3>=n1&&n3>n2&&n1>n2)
			System.out.printf("最大的数是%d\n最小的数是%d\n",n3,n2);
		if(n3>n1&&n3>n2&&n2>=n1)
			System.out.printf("最大的数是%d\n最小的数是%d\n",n3,n1);
		if(n1==n2&&n2==n3)
			System.out.printf("最大的数是%d\n最小的数是%d\n",n3,n1);
		//分类讨论，尤其是想等情况的讨论
		//if表达式中，前2个判断语句判断出最大值；后一个判断出最小值
		//先分析存在一个等号的情况，最后分析存在两个等号的条件6_6
		//Q1:在Console输入数据时，有时不会自动显示在最后？
		
		
		//更优解：设其中一个数最大，然后再替换；最小值亦是如此
		int max=n1;
		int min=n1;
		
		if(max>n2){
		}
		else{
			max=n2;
		}
		
		if(max>n3){
		}
		else{
			max=n3;
		}
		
		if(min>n2){
			min=n2;
		}
		if(min>n3){
			min=n3;
		}
		
		System.out.printf("最大的数：%d\n最小的数：%d\n",max,min);
		
		//多元运算符
		int largest=n1>n2? n1:n2;
		largest=largest>n3?largest:n3;
		
		int smallest=n1>n2?n2:n1;
		smallest=smallest>n3?n3:smallest;
		
		System.out.printf("最大的树：%d\n最小的树：%d",largest,smallest);

		
		
		
	}	
}				