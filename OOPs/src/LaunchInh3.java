//class Alpha //extends Beta --> this will cause cyclic inheritance.
//{
//	Alpha() //This will not participate in inheritance.
//	{
//		System.out.println("Alpha Constructor");
//	}
//}
//class Beta extends Alpha
//{
//	Beta()
//	{
//		this(5);
//		//super(); --> by default this is present. It will call the parent class constructor.
//		System.out.println("Beta Constructor");
//	}
//	Beta(int num)
//	{
//		System.out.println("param Constructor");
//	}
//}
class Alpha
{
	void disp()
	{
		System.out.println("Tron has DevOps live course");
	}
	void show()
	{
		System.out.println("Tron also has Java live course");
	}
}
class Beta extends Alpha
{
	void show()
	{
		System.out.println("Tron also has Java and Spring boot live course");
	}
	void print()
	{
		System.out.println("Tron has no courses");
	}
}
public class LaunchInh3 
{
	public static void main(String[] args) 
	{
		Alpha alpha = new Beta(); //why --> Polymorphism
		alpha.disp(); //inherited method is accessed.
		alpha.show(); //overridden method is accessed.
		// alpha.print(); --> 
	}
}
