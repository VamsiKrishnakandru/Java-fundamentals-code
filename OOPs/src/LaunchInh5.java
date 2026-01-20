class Alpha2
{
	int a, b;
	
	Alpha2()
	{
		System.out.println("Alpha zero Param Constructor");
		a=10;
		b=20;
	}
	Alpha2(int m, int n)
	{
		System.out.println("Alpha Param Constructor");
		a=m;
		b=n;
	}
}

class Beta2 extends Alpha2
{
	int x, y;
	Beta2()
	{
		super(10, 20);
		System.out.println("Beta zero Param Constructor");
		x=4;
		y=5;
	}
	Beta2(int m,int n)
	{
		//super(m, n);
		this();
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

public class LaunchInh5 
{
	public static void main(String[] args) 
	{
		Beta2 beta=new Beta2(44,55);
		beta.disp();
	}
}
