package loosecoupling;

public class FedEx implements IDelivery 
{
	@Override
	public boolean deliverTheProduct(double amount) 
	{
		System.out.println("The Product is delivered by Blue Dart and amount paid is " + amount);
		return false;
	}
}
