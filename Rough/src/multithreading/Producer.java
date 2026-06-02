package multithreading;

public class Producer extends Thread
{
	Item item;
	
	int count = 0;
	
	public Producer(Item item)
	{
		this.item = item;
	}
	
	@Override
	public void run()
	{
		while(true)
			try {
				item.produce(count++);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	}	
}
