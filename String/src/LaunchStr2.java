
public class LaunchStr2 
{
	public static void main(String[] args) 
	{
		//concatenation -> + , concat()
		//string class can only have immutable objects. 
		String str="Tron";
		System.out.println(str);
		str.concat(" Alien");
		System.out.println(str); //O/P - Tron
		str=str.concat(" Alien"); //concat will create a new object and that address is given to reference variable.
		System.out.println(str); //O/P - Tron Alien, str is referring to new string object.
	}
}
