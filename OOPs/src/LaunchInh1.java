//Parent class //Super class //Base Class
class Telusko
{
	int age;
	void disp()
	{
		System.out.println("Telusko has also Launched DeveOps with AWS Course");
	}
	void course() //overridden method
	{
		System.out.println("Telusko has Live courses");
	}
}
//Child Class //sub Class //derived class
class Alien extends Telusko
{
	//disp() --> inherited methods
	void show() //Specialized methods
	{
		age=10; //need not declare the variable as it is done in parent class.
		System.out.println("Telusko age is "+ age);
	}
	void course() //overriding method	
	{
		System.out.println("Telusko has Recorded courses");
	}
}
public class LaunchInh1 
{
	public static void main(String[] args) 
	{
		Alien alien = new Alien();
		alien.disp();
		alien.show();
		alien.course();
	}
}
