class Producer extends Thread
{
	Queue q;
	int i=1;
	public Producer(Queue q)
	{
		this.q=q;
	}
	@Override
	public void run()
	{
		while(true)
		{
			q.produce(i++);
		}
	}
}
class Consumer extends Thread
{
	Queue q;
	public Consumer(Queue q)
	{
		this.q=q;
	}
	@Override
	public void run()
	{
		while(true)
		{
			q.consume();
		}
	}
}
class Queue
{
	int data;
	boolean flag = false;
	synchronized public void produce(int i) //step 1
	{
		try
		{
			if(flag==true)
			{
				wait(); //step 2
			}
			else
			{
				data=i;
				System.out.println("I have Produced Data " + data);
				flag=true;
				notify();
			}	
		}
		catch(Exception e)
		{}
	}
	synchronized public void consume()
	{
		try
		{
			if(flag==false)
			{
				wait();
			}
			else
			{
				System.out.println("I have Consumed Data " + data);
				flag=false;
				notify();
			}
		}
		catch(Exception e)
		{}
	}
}
public class LaunchInterThread {

	public static void main(String[] args) 
	{
		Queue q=new Queue();
		Producer prod = new Producer(q);
		Consumer cons = new Consumer(q);
		prod.start();
		cons.start();
	}
}
