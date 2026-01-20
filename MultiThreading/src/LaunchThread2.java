import java.util.Scanner;

class Alpha
{
	public void addition()
	{
		System.out.println("Addition Activity Started...");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter First Number for Addition");
		int num1=scan.nextInt();
		System.out.println("Enter second number for Addition");
		int num2=scan.nextInt();
		int res=num1+num2;
		System.out.println("Res is "+ res);
		System.out.println("Addition Acitvity Completed...");
	}
	public void focus() throws InterruptedException
	{
		System.out.println("Printing impt messager activity started");
		for(int i=0;i<4;i++)
		{
			System.out.println("Focus is the key...");
			Thread.sleep(4000);
		}
		System.out.println("Printing impt messager activity ended");
	}
	public void printingStars() throws InterruptedException
	{
		System.out.println("Printing stars activity started");
		for(int i=0;i<4;i++)
		{
			System.out.println("* *");
			Thread.sleep(4000);
		}
		System.out.println("Printing stars activity ended");
	}
}
public class LaunchThread2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.out.println("Main method activity started");
		Alpha a = new Alpha();
		a.addition();
		a.focus();
		a.printingStars();
		System.out.println("Main method activity completed");
	}
}
