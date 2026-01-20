package loosecoupling;

public class LaunchApp 
{
	public static void main(String[] args) 
	{
		Flipkart f=new Flipkart(); //target object
		
		f.setDeliver(new BlueDart()); //setter based dependency injection / Blue dart is dependent object.
		
		Flipkart f1=new Flipkart(new FedEx()); //constructor injection
		//if both type of injections are present then constructor injection happens and then the setter based.
		boolean status=f.deliverTheProduct();
		if(status)
			System.out.println("Product delivered successfully");
		else
			System.out.println("Failed to deliver the product");
	}
}
