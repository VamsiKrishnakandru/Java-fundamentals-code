import java.util.LinkedList;

public class LaunchLL {

	public static void main(String[] args) 
	{
		LinkedList ll = new LinkedList();
		
	    ll.add(44);
		ll.add(454);
		ll.add(454.4);
		ll.add(65);
		
		System.out.println(ll);
		ll.addFirst(454);
		ll.add(null);
		
		System.out.println(ll);
		
		ll.offer("Java"); //similar to add but based on availability it will add and return true or false
		ll.offerFirst("SpringBoot");
		System.out.println(ll);
		
		System.out.println(ll.peekFirst()); //gives only first value
		System.out.println(ll.peekLast());
		System.out.println(ll);
		System.out.println(ll.pollFirst()); //gives only first value but also removes it from list
		System.out.println(ll.pollLast());
		System.out.println(ll); //Here Java and SpringBoot are both absent
		ll.remove(4); //removes data at that index
	}
}
