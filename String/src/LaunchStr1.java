
public class LaunchStr1 
{
	public static void main(String[] args) 
	{
		String str1 = "Tron"; //SCP
		String str2 = "Tron"; //SCP
		System.out.println(str1==str2); //True - SCP area/ no duplications
		String str3 = new String("Tron");//inside Heap outside SCP
		String str4 = new String("Tron");
		System.out.println(str3==str4);//False - duplications are allowed
		System.out.println("Tron"=="Tron");//True
		System.out.println(str3.equals(str4));//True - only contents are compared
		String str5 = "Tron"; //SCP 
		String str6 = "tron"; //SCP
		System.out.println(str5==str6); //false - case sensitive.
		System.out.println(str5.equals(str6)); //false
		System.out.println(str5.equalsIgnoreCase(str6));//true
	}
}
