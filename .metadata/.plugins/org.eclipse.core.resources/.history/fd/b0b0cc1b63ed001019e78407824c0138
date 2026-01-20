
public class LaunchThread1 {
	public static void main(String[] args) throws InterruptedException 
	{
		System.out.println("Application Started...");
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName()); //main - default thread 
		System.out.println(thread.getPriority());//5
		Thread.sleep(4000);
		thread.setName("Telusko"); //can change the name/priority
		thread.setPriority(4);
		System.out.println(thread.getName());
		System.out.println(thread.getPriority());
		System.out.println("Application Terminated...");
	}
}
