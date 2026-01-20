
public class LaunchStr4 
{
	public static void main(String[] args) 
	{
		String str="RajaRamMohanRoy";
		System.out.println(str.length());
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		System.out.println(str.charAt(5));
		System.out.println(str.startsWith("Raj"));
		System.out.println(str.startsWith("Tron"));
		System.out.println(str.substring(7, 12));
		System.out.println(str.endsWith("Roy"));
		char c[] = str.toCharArray();
		for(char ch:c)
		{
			System.out.println(ch);
		}
	}
}
