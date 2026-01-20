
public class HSBCBank {
	int accountBal;
	
	public HSBCBank(int accountBal)
	{
		this.accountBal=accountBal;
	}
	synchronized public void withdrawal(int withdrawal)
	{
		accountBal=accountBal-withdrawal;
	}
	synchronized public void deposit(int deposit)
	{
		accountBal=accountBal+deposit;
	}
	synchronized public void checkBalance()
	{
		System.out.println("The Balance in the account is : "+ accountBal);
	}
}
