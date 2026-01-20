class Multiply
{
	double mul(double n2, int n1)
	{
		return n1*n2;
	}
	double mul(int n1, double n2)
	{
		return n1*n2;
	}
}
public class LaunchMo2 {
	public static void main(String[] args) {	
		Multiply mul = new Multiply();
//		System.out.println(mul.mul(4, 4)); --> due to implicit type casting this will in result in calling both methods.
	}
}
