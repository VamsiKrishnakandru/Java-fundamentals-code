abstract class AeroPlane1
{
	public abstract void fly();
	protected abstract void takeOff();
}
class CargoPlane1 extends AeroPlane1
{
	public void fly()
	{
		System.out.println("CargoPlane flies at lower height");
	}
	public void takeOff()
	{
		System.out.println("CargoPlane takes longer runway for takeoff");
	}
}
class FighterPlane1 extends AeroPlane1
{
	public void fly()
	{
		System.out.println("FighterPlane flies at higher height");
	}
	public void takeOff()
	{
		System.out.println("FighterPlane takes shorter runway for takeoff");
	}
}
class PassengerPlane1 extends AeroPlane1
{
	public void fly()
	{
		System.out.println("PassengerPlane flies at medium height");
	}
	public void takeOff()
	{
		System.out.println("PassengerPlane takes medium runway for takeoff");
	}
}
class Airport
{
	public void permit(AeroPlane1 ref)
	{
		ref.fly(); //1:many --> polymorphism
		ref.takeOff();
	}
}
public class LaunchInh9 
{
	public static void main(String[] args) 
	{
		CargoPlane1 cp = new CargoPlane1();
		FighterPlane1 fp = new FighterPlane1();
		PassengerPlane1 pp = new PassengerPlane1();
		Airport a = new Airport();
		a.permit(cp);
		a.permit(fp);
		a.permit(pp);
//		cp.fly();
//		cp.takeOff();
//		fp.fly();
//		fp.takeOff();
//		pp.fly();
//		pp.takeOff();
	}
}
