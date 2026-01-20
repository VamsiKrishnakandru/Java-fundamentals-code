import java.util.Scanner;

interface Calc1
{
	void add();
	void sub();
}
interface Calc2 extends Calc
{
	float pi=3.14f; //by default this public static final.
	void mul();
}
class Alpha2
{
	public void disp()
	{
		System.out.println("Alpha class disp method");
	}
}
class MyCalc1 extends Alpha2 implements Calc1, Calc2 //first extend then implement.
{
	public void add()
	{
		int a=10;
		int b=20;
		int res=a+b;
		System.out.println(res);
	}
	public void sub()
	{
		int a=40;
		int b=20;
		int res=a-b;
		System.out.println(res);
	}
	public void mul()
	{
		System.out.println("Multiplication");
	}
}
class MyCalc2 implements Calc1
{
	public void add()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number for addition");
		int n1=scan.nextInt();
		System.out.println("Enter second number for addition");
		int n2=scan.nextInt();
		int res=n1+n2;
		System.out.println("The result is " + res);
	}
	public void sub()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number for subrtraction");
		int n1=scan.nextInt();
		System.out.println("Enter second number for subrtraction");
		int n2=scan.nextInt();
		int res=n1-n2;
		System.out.println("The result is " + res);
	}
}
class LaunchInterface1 
{
	public static void main(String[] args) 
	{
		//new MyCalc1().add(); --> Anonymous object. Unnamed object. recommended to use only when class only one method and it is used only once for entire program.
		Calc1 calc1=new MyCalc1(); //we can create interface as a reference
		Calc1 calc2= new MyCalc2();
		((MyCalc1) calc1).mul();
		calc1.add(); //we can invoke the implementing method of child class using interface reference(unlike normal inheritance (need down casting)) 
		calc1.sub();
		calc2.add(); //if there are specialized methods for child class then down casting is needed.
		calc2.sub();
		//Calc2.pi=4.4f; -> we can access directly by interface reference and we cannot reassign it. 
	}
}
