class AeroPlane
{
	public void fly()
	{
		System.out.println("AeroPlane flies");
	}
	protected void takeOff()
	{
		System.out.println("AeroPlane is taking off");
	}
	public void planeLastingAge()
	{
		System.out.println("AeroPlane can run upto 20 years without major problem");
	}
}
class CargoPlane extends AeroPlane
{
	public void fly()  
	{
		System.out.println("CargoPlane flies at lower height");
	}
	public void takeOff()
	{
		System.out.println("CargoPlane required longer runway for takeoff");
	}
	public void planeLastingAge()
	{
		System.out.println("CargoPlane can run upto 30 years without major problem");
//		return 30;
	}
}
public class LaunchInh8 
{

	public static void main(String[] args) 
	{
		CargoPlane cp = new CargoPlane();
		cp.fly();
	}

}
