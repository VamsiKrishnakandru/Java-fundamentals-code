class Student1
{
	private int age; //--> highly recommended to have private. 
	//setter
	void setAge(int age)
	{
		if(age>0)
		{
			//age=age;--> shadowing problem: will not assign properly.
			this.age = age;//this-->refers to currently running object. 
		}
		else
			System.out.println("Invalid age data");
	}
	//getter
	int getAge()
	{
		return age;
	}
}
public class LaunchEncap {
	public static void main(String[] args) 
	{
		Student1 stu = new Student1();
		stu.setAge(18);
		System.out.println(stu.getAge());
		//stu.age = 18; --> we cannot set age variable directly.
		//System.out.println(stu.age);  --> we cannot use age variable directly.
	}
}
