class Alpha
{
	static int num1; //static var only once the space will be allocated.
	int num2; //instance variable will be created when object is created.
	static
	{
		num1=4;
		System.out.println("Static Block");
	}
	{// this will block executed when object is created i.e, before the any constructor.
		System.out.println("Java Block --> Non Static");
	}
	Alpha(int num2)
	{
		this.num2=num2;
		System.out.println("Alpha Constructor");
	}
	static void disp()
	{
		System.out.println("static disp method");
		System.out.println(num1);
		//num2=10; --> it is an instance variable so we cannot access static method.
	}
	void disp1()
	{
		System.out.println("non static disp method");
		System.out.println(num1);
		System.out.println(num2);
	}
}
public class LaunchStatic2 
{
	public static void main(String[] args) 
	{
		System.out.println("Main Method");
		Alpha.disp(); //we can execute the static code without creating the object.
		//here the class is loaded.
		Alpha alpha1=new Alpha(5); //new space will be allocated for instance var.
		alpha1.disp1();
		Alpha alpha2=new Alpha(7); //again new space will be allocated for instance var. 
		alpha2.disp1();
	}
}
