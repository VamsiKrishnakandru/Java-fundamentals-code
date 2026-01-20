
public class launchMstr2 
{
	public static void main(String[] args) 
	{
		StringBuffer sb1= new StringBuffer("Tron");
		StringBuffer sb2= new StringBuffer("Tron");
		System.out.println(sb1==sb2); //false - two different objects and memory in heap area.
		System.out.println(sb1.equals(sb2));//false - equals is method of object class is used to compare references.
		//StringBuffer class does not over ride the equals method like it is been done by String class.
	}
}
