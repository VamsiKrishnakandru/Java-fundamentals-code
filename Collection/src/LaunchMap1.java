import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class LaunchMap1 {

	public static void main(String[] args) 
	{
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(1,  "Java"); //Key value pair
		hm.put(2,  "SpringBoot"); //key must be unique but value need not be
		hm.put(3,  "Microservices");
		System.out.println(hm);
		
		LinkedHashMap<Integer, String> hm1 = new LinkedHashMap<>();
		hm1.put(null,  "Java");
		hm1.put(2,  null); //key and/or value can be null (only in hashmap)
		System.out.println(hm);
		
		TreeMap tm = new TreeMap(); //based on key sorting takes place
		tm.put(3, "Hibernate");
		tm.put(2, "SpringBoot");
		//tm.put(null, "SpringBoot"); //key cannot be null (nullpointerexception)
		tm.put(4, null); //value can be null
		System.out.println(tm);
		
		Hashtable ht = new Hashtable(); //order of insertion is maintained
		ht.put(3, "Hibernate");
		ht.put(2, "SpringBoot");
		//ht.put(null, "java"); //key cannot be null amd value can be
		System.out.println(ht);
		
	}
}
