package multithreading;

public class Consumer extends Thread
{
	Item item;
	
	public Consumer(Item item)
	{
		this.item = item;
	}
	
	@Override
	public void run()
	{
		while(true)
			try {
				item.consume();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	}	
}
