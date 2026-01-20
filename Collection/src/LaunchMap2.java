import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LaunchMap2 {

	public static void main(String[] args) 
	{
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(1,  "Java"); //key-value pair -> Entry
		hm.put(2,  "Hibernate");
		hm.put(3,  "SpringBoot");
		System.out.println(hm);
		String data = hm.get(2);
		System.out.println(data);
		System.out.println("*********************");
		Collection<String> values = hm.values();
		Iterator<String> itr = values.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("*********************");
		Set<Integer> keys = hm.keySet();
		Iterator itr1 = keys.iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		System.out.println("*********************");
//		Set<Entry<Integer, String>> entry = hm.entrySet();
//		Iterator<Entry<Integer, String>> itr3 = entry.iterator();
		
		Set entry = hm.entrySet();
		Iterator itr3 = entry.iterator();
		while(itr3.hasNext())
		{
			//Entry<Integer, String> pair = itr3.next();
			Map.Entry pair = (Entry) itr3.next();
			System.out.println("key: " + pair.getKey() + " Value : " + pair.getValue());
		}
	}
}
