import java.util.ArrayList;

class Telusko
{
	Integer i1;
	String name;
	Double price;
	Telusko(Integer i1, String name, Double price)
	{
		this.i1=i1;
		this.name=name;
		this.price=price;
	}
	@Override
	public String toString() {
		return "Telusko [i1=" + i1 + ", name=" + name + ", price=" + price + "]";
	}
}

public class LaunchGen1 {

	public static void main(String[] args) 
	{
//		//arrays are fast and type safe compared to collection
//		int ar[] = new int[3];
//		ar[0] = 21;
//		ar[1] = 34;
//		ar[2] = 24;
//		
//		int data = ar[1]; // we know beforehand what datatype is present.
//		
//		//no type safety in collection
//		ArrayList al = new ArrayList();
//		al.add("Telusko");
//		al.add("Java");
//		al.add(44);
//		
//		String data1 = (String) al.get(0);
//		data1 = data1.toUpperCase();
//		System.out.println(data1);
//		
//		String data2 = (String) al.get(1);
//		data2 = data2.toUpperCase();
//		System.out.println(data2);
//		
//		//below code will cause run time ClassCastexception.
//		String data3 = (String) al.get(2);
//		data3 = data3.toUpperCase();
//		System.out.println(data3);
		
		ArrayList<String> al = new ArrayList<>();
		al.add("Telusko");
		al.add("Java");
//		al.add(44); -> at compile time we get error
		
		String data1 = al.get(0); //no need for type casting
		data1 = data1.toUpperCase();
		System.out.println(data1);
		String data2 = al.get(1);
		data2 = data2.toUpperCase();
		System.out.println(data2);
		
		ArrayList<Telusko> telusko = new ArrayList<>();
		telusko.add(new Telusko(1, "AWS", 5656.3));
		telusko.add(new Telusko(2, "SpringBoot", 556.3));
		telusko.add(new Telusko(3, "DevOps", 5656.3));
		for(Telusko t:telusko)
		{
			System.out.println(t);
		}
	}
}
