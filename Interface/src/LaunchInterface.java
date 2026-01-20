interface Calc
{
	void add();//inside interface every method is public abstract.
	void sub();
}
//interface Calc2 implements Calc --> interface cannot implement another interface.
//{} --> interface can extend another interface.
abstract class MyCalc implements Calc //abstract since one method is abstract. if all the methods are overridden properly no need of abstract.
{
	public void add() //compulsory to mention public so visibility does not decrease.
	{
		int a=10;
		int b=20;
		int res=a+b;
		System.out.println(res);
	}
	abstract public void sub(); //if we don't want to override then need to declare it abstract.
}
public class LaunchInterface 
{

	public static void main(String[] args) 
	{
		//MyCalc c = new MyCalc(); cannot create a instance of abstract class.
	}

}