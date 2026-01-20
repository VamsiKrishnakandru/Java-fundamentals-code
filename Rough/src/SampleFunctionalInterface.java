@FunctionalInterface
interface SampleDisplay
{
	void display();
}
public class SampleFunctionalInterface {
	public static void main(String[] args) 
	{
		SampleDisplay s1 = new SampleDisplay() {
			@Override
			public void display()
			{
				System.out.println("Inside annonymous inner class");
			}
		};
		SampleDisplay s2 = () -> {
			System.out.println("Inside Lambda expression");
		};
		s1.display();
		s2.display();
	}
}
