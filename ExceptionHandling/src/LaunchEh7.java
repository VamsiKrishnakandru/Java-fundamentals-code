import java.util.Scanner;
class InvalidCustomerException extends Exception //by default it will extend checked exception but if you want unchecked exception then extend with RuntimeException.
{
	public InvalidCustomerException(String msg)
	{
		super(msg);
	}
}

class Atm
{
	int accNo = 1111;
	int password=2222;
	int acc;
	int pw;
	public void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Kindly Enter the user name: ");
		acc=sc.nextInt();
		System.out.println("Kindly Enter the password: ");
		pw=sc.nextInt();
	}
	
	public void verify() throws InvalidCustomerException
	{
		if(accNo == acc && password==pw)
		{
			System.out.println("Credentials Matched! You can go further with Transaction!");
		}
		else
		{
			//InvalidCustomerException ice = new InvalidCustomerException();
			//System.out.println("Invalid Credentials!");
			//throw ice;
			throw new InvalidCustomerException("Invalid Credentials!");
		}
	}
}
class Bank
{
	public void initiate()
	{
		Atm atm=new Atm();
		try
		{
			atm.input();
			atm.verify();
		}
		catch(InvalidCustomerException ice)
		{
			System.out.println(ice.getMessage()); //message is a variable of throwable class.
			try
			{
				atm.input();
				atm.verify();
			}
			catch(InvalidCustomerException ic)
			{
				System.out.println("You are blocked!");
			}
		}
	}
}
public class LaunchEh7 
{
	public static void main(String[] args) 
	{
		Bank bank = new Bank();
		bank.initiate();
	}
}
