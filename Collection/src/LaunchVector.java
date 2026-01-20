import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class LaunchVector {

	public static void main(String[] args) 
	{
		Vector v = new Vector();
		v.addElement(200);
		v.add(100);
		v.add(200);
		v.add(400);
		
		Iterator itr = v.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("***********************");
		
		//is the same code as above iterator but using enumeration. 
		Enumeration el = v.elements();
		while(el.hasMoreElements())
		{
			System.out.println(el.nextElement());
		}
	}
}
