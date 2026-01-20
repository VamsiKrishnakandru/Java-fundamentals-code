import java.util.Scanner;

class Alpha2 implements Runnable
{
	public void run()//from runnable interface
	{
		addition();
	}
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
}
class Beta2 implements Runnable
{
	public void run()
	{
		try {
			focus();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
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
}
class Gamma2 implements Runnable
{
	public void run()
	{
		try {
			printingStars();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
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
public class LaunchThread4 {

	public static void main(String[] args) 
	{
		System.out.println("Main method activity started");
		Alpha2 a = new Alpha2();
		Beta2 b = new Beta2();
		Gamma2 g = new Gamma2();
		Thread t1 = new Thread(a);
		Thread t2 = new Thread(b);
		Thread t3 = new Thread(g);
		t1.start();
		t2.start();
		t3.start();
		System.out.println("Main method activity completed");
	}

}
