class Tron5
{
	public void alien()
	{
		//alien(); --> will cause run time error not Exception.
		//function will call itself infinite number of times. Until overflow occurs.
		System.out.println("Hello Alien! Welcome back");
	}
}
public class LaunchRunTimeError 
{
	public static void main(String[] args) 
	{
		Tron5 t=new Tron5();
		t.alien();
	}
}
