package multithreading;

public class Item {
	
	int item = 0;
	
	boolean flag = false;
	
	synchronized public void produce(int num) throws InterruptedException
	{
		if(flag)
			wait();
		else
		{
			item = num;
			flag = true;
			System.out.println("Produced - " + item);
			notify();
		}
	}

	synchronized public void consume() throws InterruptedException
	{
		if(flag)
		{
			flag = false;
			System.out.println("Consumer - " + item);
			notify();
		}
		else
			wait();
	}
}
