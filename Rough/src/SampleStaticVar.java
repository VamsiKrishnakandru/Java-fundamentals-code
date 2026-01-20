class SampleCount
{
	static int objCount;
	static
	{
		objCount = 0;
	}
	{
		objCount++;
	}
	static public void display()
	{
		System.out.println("Number of Objects created: " + objCount);
	}
}
public class SampleStaticVar {

	public static void main(String[] args) 
	{
		SampleCount s1 = new SampleCount();
		SampleCount s2 = new SampleCount();
		SampleCount s3 = new SampleCount();
		SampleCount s4 = new SampleCount();
		SampleCount s5 = new SampleCount();
		SampleCount.display();
	}

}
