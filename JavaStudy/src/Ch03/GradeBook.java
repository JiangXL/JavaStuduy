package Ch03;

public class GradeBook {

	private String instructorName, courseName;

	/*
	 * public GradeBook(){} 编译器默认写一个没有参数的construtor
	 */

	public void setName(String instructorName, String courseName) {
		this.instructorName = instructorName;
		this.courseName = courseName;
		/*错误用法
		courseName = this.courseName;
		结果是null!
		*/
	}

	
	public String getinstructorName() {
		return instructorName	;
		/*
		 * return 并不是一块路标 return
		 * primitive type,value,object都可以是返回的对象
		 */
	}

	
	public void test_return(){
		return;
		/*
		 * Any method declared void doesn't return a value. It does not need to
		 * contain a return statement, but it may do so. In such a case, a return
		 * statement can be used to branch out of a control flow block and exit the
		 * method and is simply used like this:
		 */
	}
	
	public String getcourseName() {
		return courseName;
	}

	public void displayName() {
		System.out.printf("Welcome to the grade book for %s!\n",
				getcourseName());
		System.out.printf("This course is presented by:%sn", instructorName);
		//即使不用get方法，直接有变量名，也能正确指引
	}
	
	
	
}

