
public class LaunchWrapper 
{
	public static void main(String[] args) 
	{
		//Integer i =new Integer(10); -> deprecated
		Integer i = Integer.valueOf(10);
		System.out.println("i " + i);
		//Boxing: Converting primitive data type into its corresponding wrapper class. 
		int n1=14;
		Integer n2=n1; //Autoboxing
		Integer n3=Integer.valueOf(n1);//Boxing-explicitly converting
		Integer x = Integer.valueOf(45);
		//Unboxing: converting wrapper class object back to its corresponding primitive data type. 
		int z=x;//autounboxing
		int y = x.intValue();//unboxing
	}
}

