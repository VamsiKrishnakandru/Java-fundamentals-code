class Calc
{
	int num1, num2, res;
	
//	void add()
//	{
//		num1=4;
//		num2=1;
//		res=num1+num2;
//		System.out.println("Result is " + res);
//	}
	
//	void add(int n1, int n2)
//	{
//		num1=n1;
//		num2=n2;
//		res=num1+num2;
//		System.out.println("Result is " + res);
//	}
	
	int add()
	{
		num1=3;
		num2=2;
		res=num1+num2;
		return res;
	}
	
	int add(int n1, int n2)
	{
		num1=n1;
		num2=n2;
		res=num1+num2;
		return res;
	}
}


public class LaunchMethod1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calc calc = new Calc();
		int result = calc.add();
		System.out.println(result);
	}

}
