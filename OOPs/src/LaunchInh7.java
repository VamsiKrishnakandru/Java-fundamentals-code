class Animal
{
	static int age;
	static void disp()
	{
		age=44;
		System.out.println("Animal static method");
	}
	void show()
	{
		System.out.println("Show of Animal");
	}
}
class Deer extends Animal
{
	//@Override - hear we cannot use as we are not overriding the parent class method.
	static void disp()
	{
		System.out.println("Deer static method");
	}
	@Override
	void show()
	{
		System.out.println("Show of Deer");
	}
}
public class LaunchInh7 
{
	public static void main(String[] args) 
	{
		Deer deer = new Deer();
		deer.disp(); //child class method will hide the parent class method.
		Deer.disp(); //hear too child class method will execute.
		Deer.age=18; //parent class static variable is accessible.
		Animal deer1 = new Deer(); //parent class reference.
		deer1.disp(); //parent class reference - so parent class method executes.
		((Deer)(deer1)).disp(); //down casting - so child class method executes.
	}
}
