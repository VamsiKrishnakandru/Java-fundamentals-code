
enum Result //result class will created which extends Enum class
{
	PASS, FAIL, NR;
	//public static final Result PASS = new Result();
	//public static final Result FAIL = new Result();
	//public static final Result NR = new Result();
	
	Result() //constructor - this 
	{
		System.out.println("Result Instance/Object is created");
	}
	int marks;
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
}

public class LaunchEnum2 {

	public static void main(String[] args) 
	{
		Result res = Result.PASS;
		
		Result.PASS.setMarks(44);
		int marks=Result.PASS.getMarks();
		System.out.println(marks);
	}
}
