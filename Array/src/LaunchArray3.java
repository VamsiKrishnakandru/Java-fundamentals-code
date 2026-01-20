 import java.util.Scanner;
  
public class LaunchArray3 
{

	public static void main(String[] args) 
	{
		int [][]arr=new int[3][];
		arr[0]=new int[4];
		arr[1]=new int[2];
		arr[2]=new int[3];
		
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				System.out.println("Enter marks of class " + i + " Student " + j);
				arr[i][j] = scan.nextInt();
			}
		}
		System.out.println("Marks of students stored are : ");
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
