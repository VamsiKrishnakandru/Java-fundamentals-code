interface Tron1
{
	void show();
	default void disp(int a, double c)
	{
		System.out.println("Tron is launching multiple courses");
	}
}

interface Telusko2
{
	void show();
	default void disp(double c, int a)
	{
		System.out.println("Telusko is launching multiple courses");
	}
}

class Alien2 implements Telusko2, Tron1
{
	public void show()
	{
		System.out.println("Show method implementated to Alien");
	}
}
public class LaunchInterface3 
{
	public static void main(String[] args) 
	{
		Alien2 alien = new Alien2();
		alien.show();
		alien.disp(3, 5.8);
		alien.disp(5.7, 6);
	}
}
