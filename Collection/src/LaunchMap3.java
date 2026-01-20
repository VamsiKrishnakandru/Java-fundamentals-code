import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

class Passport
{
	private String name;
	private String city;
	private String country;
	public Passport(String name, String city, String country) {
		super();
		this.name = name;
		this.city = city;
		this.country = country;
	}
	@Override
	public String toString() {
		return "Passport [name=" + name + ", city=" + city + ", country=" + country + "]";
	}
}

public class LaunchMap3 {

	public static void main(String[] args) 
	{
		System.out.println("Passport Information App");
		Passport pass1 = new Passport("Rohan", "Bengaluru", "India");
		Passport pass2 = new Passport("Rohit", "Mumbai", "India");
		Passport pass3 = new Passport("Rohan", "Calgary", "Canada");
		
		Integer id1 = Integer.valueOf(101);
		Integer id2 = Integer.valueOf(102);
		Integer id3 = Integer.valueOf(103);
		
		HashMap<Integer, Passport> hm = new HashMap<>();
		hm.put(id1, pass1);
		hm.put(id2, pass2);
		hm.put(id3, pass3);
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Kindly enter your Passport number to get info");
		Integer id=scn.nextInt();
		
		Set<Entry<Integer, Passport>> entry = hm.entrySet();
		Boolean flag = false;
		Iterator<Entry<Integer, Passport>> itr = entry.iterator();
		while(itr.hasNext() && !flag)
		{
			Entry<Integer, Passport> keyValue = itr.next();
			Integer key = keyValue.getKey();
			if(key.equals(id))
			{
				System.out.println("Please Find your Info Below : ");
				System.out.println(keyValue.getValue());
				flag=true;
			}
		}
		if(flag==false)
		{
			System.out.println("Unable to fetech record based on given id");
		}
	}
}
