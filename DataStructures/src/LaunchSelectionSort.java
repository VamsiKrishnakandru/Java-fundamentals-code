public class LaunchSelectionSort {
	public static void main(String[] args) {
		int []array = {6,2,5,3,9,1,4,10,8,7};
		int size=array.length;
		int temp=0;
		int minIndex=-1;
		for(int ele:array)
		{
			System.out.print(ele + " ");
		}
		for(int i=0;i<size-1;i++)
		{
			minIndex=i;
			for(int j=i+1;j<size;j++)
			{
				if(array[i]>array[j])
				{
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		System.out.println();
		for(int ele:array)
		{
			System.out.print(ele + " ");
		}
	}
}
