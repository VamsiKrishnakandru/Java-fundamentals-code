
abstract class Car
{
	abstract public void carryPassenger();
}
class Ford extends Car
{
	public void carryPassenger()
	{
		System.out.println("Ford Car carry passengers from one place to another place");
	}
}

public class LaunchInh10 
{
	public static void main(String[] args) 
	{
		Ford ford=new Ford();
		ford.carryPassenger();
	}

}
