class Tron4
{
	static
	{
		System.out.println("external class with static block");
	}
	int courseId=4;
	String courseName="AWS";
	@Override
	public String toString() {
		return "Tron4 [courseId=" + courseId + ", courseName=" + courseName + "]";
	}
}
public class LaunchtoString 
{
	static
	{
		System.out.println("class with main method static block");
	}
	public static void main(String[] args) 
	{
		Tron4 t=new Tron4();
		System.out.println(t);
	}
}
