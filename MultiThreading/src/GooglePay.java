
public class GooglePay extends Thread
{
	private HSBCBank bank;
	public GooglePay(HSBCBank bank)
	{
		this.bank = bank;
	}
	@Override
	public void run()
	{
		bank.deposit(4000);
	}
}
