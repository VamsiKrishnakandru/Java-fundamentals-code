class Human //extends Object
{
	private int age;
	
	void disp()
	{
		System.out.println("Humans are intelligent");
	}
}
class Employee extends Human
{
//	void disp()
//	{
////		age=40; age is private in parents and didn't get inherited. 
////		System.out.println("Employee works hard " + age + " years on average");
//	}
}
class Student extends Employee
{
	
}
public class LaunchInh2 
{

	public static void main(String[] args) 
	{
		Employee emp1 = new Employee();
		emp1.disp();
		
		Student stu = new Student();
		stu.disp();
	}

}
