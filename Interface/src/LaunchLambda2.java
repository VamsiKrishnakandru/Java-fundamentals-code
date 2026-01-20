@FunctionalInterface
interface FI
{
	int disp(int a);
}
public class LaunchLambda2 
{
	public static void main(String[] args) 
	{
		FI fi1 = a -> {
			System.out.println("Value of a is " + a);
			return a;
		};
		System.out.println(fi1.disp(4));
	}
}
