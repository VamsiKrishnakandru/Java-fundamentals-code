class Alpha1
{
	int a, b;
	
	Alpha1()
	{
		System.out.println("Alpha zero Param Constructor");
		a=10;
		b=20;
	}
	Alpha1(int m, int n)
	{
		System.out.println("Alpha Param Constructor");
		a=m;
		b=n;
	}
}

class Beta1 extends Alpha1
{
	int x, y;
	Beta1()
	{
		System.out.println("Beta zero Param Constructor");
		x=4;
		y=5;
	}
	Beta1(int m,int n)
	{
		System.out.println("Alpha Param Constructor");
		x=m;
		y=n;
	}
	void disp()
	{
		System.out.println("a : "+ a);
		System.out.println("b : "+ b);
		System.out.println("x : "+ x);
		System.out.println("y : "+ y);
	}
}

public class LaunchInh4 
{
	public static void main(String[] args) 
	{
		Beta2 beta=new Beta2();
		beta.disp();
	}
}
