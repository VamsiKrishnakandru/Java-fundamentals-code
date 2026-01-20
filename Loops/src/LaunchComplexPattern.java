
public class LaunchComplexPattern {

	public static void main(String[] args) {
		
		int i,j;
		int n=9;
		
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if( i==j || i+j==n-1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.print("  ");
			for(j=0;j<n;j++)
			{
				if( i==j || i+j==n-1 || i==0 || j==0 || i==n-1 || j==n-1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.print("  ");
			for(j=0;j<n;j++)
			{
				if( i==0 || j==0 || i==n-1 || j==n-1 || i+j==(n-1)/2 || j-i==(n-1)/2 || i-j==(n-1)/2 || i+j==(n-1)/2 + n-1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.print("  ");
			for(j=0;j<n;j++)
			{
				if( (i==0 && j>0 && j<3*(n-1)/4) 
						|| (i==n-1 && j>0 && j<3*(n-1)/4)
						|| (j==0 && i>0 && i<n-1) 
						|| (j==3*(n-1)/4 && i>0 && i<n-1)
						|| (i==j && i>=(n-1)/2))
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		System.out.println("**************************************************");
		
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if( i+j>=(n-1)/2 && j-i<=(n-1)/2 && i<=(n-1)/2)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.print("  ");
			
			for(j=0;j<n;j++)
			{
				if( i+j>=-(n-1)/2 && j-i>=-(n-1)/2 && i>=(n-1)/2)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.print("  ");
			
			System.out.println();
		}

	}

}
