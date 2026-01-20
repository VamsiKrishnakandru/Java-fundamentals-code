interface Telusko1
{
	void show();
	default void disp()// from java 8 - we can use default keyword to have method with body in an interface.
	{
		System.out.println("Tron is launching multiple courses");
	}
	static void course() //interface can have static methods
	{
		System.out.println("Java Spring Boot AI live course");
	}
}

class Alien1 implements Telusko1
{
	public void show()
	{
		System.out.println("Show method implementated to Alien");
	}
	//default methods are inherited in implemented classes but overriding them is optional.
}
public class LaunchInterface2 
{
	public static void main(String[] args) 
	{
		Alien1 alien = new Alien1();
		alien.show();
		alien.disp();
		//Telusko1.disp(); --> will not work as it disp is not static.
		Telusko1.course(); //cannot use implementing class objects to access static methods of interface. Use directly the interface.
	}
}
