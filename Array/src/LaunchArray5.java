class Tron3
{
	int courseId;
	String courseName;
}
public class LaunchArray5 
{

	public static void main(String[] args) 
	{
		Tron3 []tron3 = new Tron3[3];
		tron3[0] = new Tron3();
		tron3[1] = new Tron3();
		tron3[2] = new Tron3();
		tron3[0].courseId = 1;
		tron3[0].courseName = "DevOps";
		tron3[1].courseId = 2;
		tron3[1].courseName = "AWS";
		tron3[2].courseId = 3;
		tron3[2].courseName = "SpringBoot";
		
		System.out.println(tron3[0].courseId);
		System.out.println(tron3[0].courseName);
	}

}
