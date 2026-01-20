
public class LaunchStr3 
{
	public static void main(String[] args) 
	{
		String s1="Alien";
		String s2="Tron" + " is " + s1; //reference var is used so memory outside the SCP.
		String s3="Tron" + " is " + "Alien";
		String s4="Tron " + "is" + " Alien";
		System.out.println(s2==s3); //false - s2 is referring to address outside of SCP and s3 is referring to address inside SCP.
		System.out.println(s4==s3); //true
	}
}
