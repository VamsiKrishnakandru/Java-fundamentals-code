package loosecoupling;

public class Flipkart 
{
	private IDelivery deliver;
	public Flipkart(IDelivery deliver) {
		super();
		this.deliver = deliver;
	}
	public Flipkart() {
		super();
	}
	public void setDeliver(IDelivery deliver) {
		this.deliver = deliver;
	}
	public Boolean deliverTheProduct()
	{
		return deliver.deliverTheProduct(4545.4);
	}
}
