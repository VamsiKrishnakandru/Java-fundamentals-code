
interface Add1
{
	int add();
}
interface Add2 extends Add1
{
	int add1();
}
interface Add3 extends Add1
{
	int add1();
}
class Calculator implements Add2, Add3
{
	public int add()
	{
		return 40;
	}
	public int add1()
	{
		return 50;
	}
}
public class LaunchInterface4 {
	
	public static void main(String[] args) 
	{
		Add2 part1 = new Calculator();
		Add3 part2 = new Calculator();
		System.out.println(part1.add());
		System.out.println(part1.add1());
		System.out.println(part2.add());
		System.out.println(part2.add1());
	}

}
