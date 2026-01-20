package loosecoupling;

public class BlueDart implements IDelivery
{
	@Override
	public boolean deliverTheProduct(double amount)
	{
		System.out.println("The Product is delivered by FedEx and amount paid is " + amount);
		return true;
	}
}
