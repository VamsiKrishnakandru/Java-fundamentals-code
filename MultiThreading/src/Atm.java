
public class Atm extends Thread
{
	private HSBCBank bank;
	public Atm(HSBCBank bank)
	{
		this.bank = bank;
	}
	@Override
	public void run()
	{
		bank.withdrawal(4000);
	}
}
