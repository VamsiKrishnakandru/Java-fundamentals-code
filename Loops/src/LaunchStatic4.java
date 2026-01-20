import java.util.Scanner;

class Farmer
{
	float pa;
	float td;
	float si;
	
	static float ri;
	
	static
	{
		ri=5.4f;
	}
	
	void input()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Loan amount required");
		pa=scan.nextFloat();
		System.out.println("Enter the Time required in Years to repay");
		td=scan.nextFloat();
	}
	void findSI()
	{
		si=(pa*td*ri)/100.0f;
	}
	void dispSI()
	{
		System.out.println("The SI is : "+ si);
	}
}


public class LaunchStatic4 
{

	public static void main(String[] args) 
	{
		System.out.println("Farmer loan App");
		Farmer f1 = new Farmer();
		Farmer f2 = new Farmer();
		Farmer f3 = new Farmer();
		
		System.out.println("Farmer 1: ");
		f1.input();
		f1.findSI();
		f1.dispSI();
		
		System.out.println("Farmer 2: ");
		f2.input();
		f2.findSI();
		f2.dispSI();
		
		System.out.println("Farmer 3: ");
		f3.input();
		f3.findSI();
		f3.dispSI();

	}

}
