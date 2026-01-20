class Demo1
{
	int i=10;
	void disp()
	{
		System.out.println("Disp method of Demo1");
	}
}
class Demo2 extends Demo1
{
	int i=4;
	void disp()
	{
		System.out.println("Disp of method of Demo2");
		System.out.println("I : " + super.i); //--> will display parent class i
	}
	void show()
	{
		System.out.println("Show method to call disp()");
		super.disp(); //--> will call parent disp method
	}
}
public class LaunchInh6 
{
	public static void main(String[] args) 
	{
		Demo2 d = new Demo2();
		d.disp();
		d.show();
	}
}
