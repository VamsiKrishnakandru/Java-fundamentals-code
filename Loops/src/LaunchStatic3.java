class CountObjects
{
	static int objectsnum;
	
	CountObjects()
	{
		objectsnum++;
	}
}
public class LaunchStatic3 
{
	public static void main(String[] args) 
	{
		CountObjects obj1 = new CountObjects();
		CountObjects obj2 = new CountObjects();
		CountObjects obj3 = new CountObjects();
		System.out.println("Number of objects created: " + CountObjects.objectsnum);
	}
}
