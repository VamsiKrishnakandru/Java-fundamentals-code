class SampleCar
{
	String name;
	int Mfyear;
	public SampleCar(String name, int mfyear) {
		super();
		this.name = name;
		Mfyear = mfyear;
	}
	public void display()
	{
		System.out.println("Car name: " + name + ", Year of Manufacturing: " + Mfyear);
	}
	public void display(String name)
	{
		System.out.println("Year of Manufacturing: " + Mfyear);
	}
	public void size(int length, double width)
	{
		System.out.println(length*width);
	}
	public void size(double width, int length)
	{
		System.out.println(length*width);
	}
}

public class SampleMethodOverloading {
	public static void main(String[] args) 
	{
		SampleCar car1 = new SampleCar("Maruthi", 2011);
		car1.display();
		car1.display("Maruthi");
		car1.size(4.7,5);
	}
}
