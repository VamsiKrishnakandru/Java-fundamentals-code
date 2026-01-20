
public class LaunchMStr1 
{
	public static void main(String[] args) 
	{
		StringBuffer sb= new StringBuffer("Tron");
		System.out.println(sb);
		StringBuilder sb1= new StringBuilder("Tron");
		System.out.println(sb1);
		StringBuffer sb2=new StringBuffer();
		System.out.println(sb2.capacity());//By default - 16
		StringBuilder sb3=new StringBuilder();
		System.out.println(sb3.capacity()); //by default - 16
		sb3.append("Alien"); //existing String object is modified
		System.out.println(sb3);
		sb3.append(" is not from this planet"); //here we are exceeding the capacity.
		System.out.println(sb3.capacity());//new capacity = old capacity * 2 + 2 = 34
		//even if add even 1 more extra char more than 16 the capacity changes to 34.
		sb3.append("adding more content");
		System.out.println(sb3.capacity());//34*2+2 = 70
	}
}
