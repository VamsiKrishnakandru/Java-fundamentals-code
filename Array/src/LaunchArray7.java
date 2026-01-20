import java.util.Arrays;

public class LaunchArray7 
{
	public static void main(String[] args) 
	{
		int ar[]=new int[4];
		double ar1[][]=new double[4][5];
		System.out.println(ar.getClass().getName()); //[I
		System.out.println(ar1.getClass().getName()); //[[D
		int a[]= {2,3,4,2,3};
		for(int data:a)
		{
			System.out.print(data+ " ");
		}
		System.out.println();
		Arrays.sort(a);
		System.out.println("Sorted Array");
		for(int data:a)
		{
			System.out.print(data+ " ");
		}
	}
}
