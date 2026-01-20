
public class objectlevellocking {

	public static void main(String[] args) 
	{
		HSBCBank bank = new HSBCBank(6000);
		Atm atm=new Atm(bank);
		atm.setName("ATM THREAD");
		GooglePay gpay = new GooglePay(bank);
		gpay.setName("GooglePay Thread");
		PhonePe pp=new PhonePe(bank);
		pp.setName("PhonePe Thread");
		atm.start();
		gpay.start();
		pp.start();
	}
}
