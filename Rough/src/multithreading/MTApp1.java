package multithreading;

public class MTApp1 {

	public static void main(String[] args) 
	{
		Item i1 = new Item();
		Producer t1 = new Producer(i1);
		Consumer t2 = new Consumer(i1);
		t1.start();
		t2.start();
	}

}
