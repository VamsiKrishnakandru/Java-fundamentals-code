
public class LaunchArray6
{

	public static void main(String[] args)
	{
		int ar[]= {4,5,5};
		for(int  elem: ar) //for each loop
		{
			System.out.println(elem);
		}
		int ar1[][]= {{4,2,3,3},{3,5,3,3}};
		for(int row[]:ar1) //row is an int array
		{
			for(int elem:row)
			{
				System.out.println(elem);
			}
		}
	}

}
