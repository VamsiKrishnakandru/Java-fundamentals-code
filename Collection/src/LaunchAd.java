import java.util.ArrayDeque;

public class LaunchAd {

	public static void main(String[] args) 
	{
		ArrayDeque ad = new ArrayDeque();
		
		ad.add(4);
		ad.add(5);
		ad.add(55);
		ad.add(54);
		//ad.add(null); -> not allowed
		System.out.println(ad);
		ad.addFirst(6);
		System.out.println(ad);
	}

}
