package sample;

public class ExampleInterface {

	public static void main(String[] args) {
		
		Amazon package1 = new Amazon(new BlueDartcamp());
		Amazon package2 = new Amazon();
		package2.getIDelivery(new FedExcamp());
		package1.isDelivered();
		package2.isDelivered();
	}

}
