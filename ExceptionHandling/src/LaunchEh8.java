import java.util.Scanner;

class UnderAgeException extends RuntimeException
{
	public UnderAgeException(String msg)
	{
		super(msg);
	}
}
class OverAgeException extends Exception
{
	public OverAgeException(String msg)
	{
		super(msg);
	}
}

class Applicant
{
	int age;
	
	public void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Kindly Enter the Age: ");
		age=sc.nextInt();
	}
	public void verify() throws UnderAgeException, OverAgeException
	{
		if(age<18)
		{
			UnderAgeException uae = new UnderAgeException("You're Too Young!");
			System.out.println(uae.getMessage());
			throw uae;
		}
		else if(age>60)
		{
			OverAgeException oae = new OverAgeException("You're Old!");
			System.out.println(oae.getMessage());
			throw oae;
		}
		else
		{
			System.out.println("Eligible! Proceed further with license application");
		}
	}
}
class RTO
{
	public void initiate()
	{
		try
		{
			Applicant ap = new Applicant();
			ap.input();
			ap.verify();
		}
		catch(UnderAgeException| OverAgeException e)
		{
			try
			{
				Applicant ap = new Applicant();
				ap.input();
				ap.verify();
			}
			catch(UnderAgeException| OverAgeException e1)
			{
				System.out.println("Please reach out to RTO");
			}
		}
	}
}
public class LaunchEh8 
{
	public static void main(String[] args) 
	{
		RTO rto=new RTO();
		rto.initiate();
	}
}
