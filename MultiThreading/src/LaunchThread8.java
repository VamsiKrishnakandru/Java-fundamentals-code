class MSWord extends Thread
{
	@Override
	public void run()
	{
		String name = Thread.currentThread().getName();
		if(name.equals("TYPE"))
		{
			typing();
		}
		else if(name.equals("SPELL"))
		{
			spellCheck();
		}
		else
		{
			saving();
		}
	}
	public void typing()
	{
		try
		{
			for(int i=0;i<4;i++)
			{
				System.out.println("Typing...");
				Thread.sleep(3000);
			}
		}
		catch(Exception e)
		{}
	}
	public void spellCheck()
	{
		try
		{
			for(;;) //make infinite
			{
				System.out.println("spell check...");
				Thread.sleep(3000);
			}
		}
		catch(Exception e)
		{}
	}
	public void saving()
	{
		try
		{
			for(;;) //make infinite
			{
				System.out.println("saving...");
				Thread.sleep(3000);
			}
		}
		catch(Exception e)
		{}
	}
}
public class LaunchThread8 {

	public static void main(String[] args) 
	{
		MSWord t1 = new MSWord();
		MSWord t2 = new MSWord();
		MSWord t3 = new MSWord();
		
		t1.setName("TYPE");
		t2.setName("SPELL");
		t3.setName("SAVE");
		
		t2.setDaemon(true); //set as daemon thread
		t3.setDaemon(true);
		
		t2.setPriority(4); //set priority lower than 5
		t3.setPriority(3);
		
		t1.start();
		t2.start();
		t3.start();
	}
}
