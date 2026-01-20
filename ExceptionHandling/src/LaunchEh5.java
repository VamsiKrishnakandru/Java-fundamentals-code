import java.util.Scanner;

class Demo2
{
	public void division() throws ArithmeticException
	{
		System.out.println("Demo start");
		Scanner scan=new Scanner(System.in);
		try
		{
			System.out.println("Enter the numerator for division");
			int num1=scan.nextInt();
			System.out.println("Enter the denominator for division");
			int num2=scan.nextInt();
			int res=num1/num2;
			System.out.println("The result is "+ res);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception is caught in demo");
			throw e;
			//throw new ArithmeticException;
		}
		finally
		{
			System.out.println("Demo endded - finally");
		}
	}
}
public class LaunchEh5 
{
	public static void main(String[] args) 
	{
		System.out.println("App Started");
		try
		{
			Demo2 demo = new Demo2();
			demo.division();
		}
		catch(Exception e)
		{
			System.out.println("Exception is thrown in main method");
		}
		System.out.println("App smoothly terminated - Main App");
	}
}
