
public class LaunchEh6 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.out.println("App started");
		Thread.sleep(6000); //compiler throw error to handle InterruptedException
		//if we add throws then the compiler will not throw error
		System.out.println("App terminated");
	}
}
