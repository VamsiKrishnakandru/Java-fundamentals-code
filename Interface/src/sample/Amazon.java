package sample;

public class Amazon 
{
	IDelivery delivery;
	
	Amazon()
	{
		
	}
	Amazon(IDelivery delivery)
	{
		this.delivery = delivery;
	}
	void getIDelivery(IDelivery delivery)
	{
		this.delivery = delivery;
	}
	void isDelivered()
	{
		System.out.println("Is the package delivered: " + delivery.isItDelivered());
	}
}
