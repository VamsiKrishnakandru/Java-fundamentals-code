interface Alpha<T>
{
}
class Generics<T> implements Alpha<String> //to apple generics to our class
{
	private T ref;
	
	public Generics(T ref)
	{
		this.ref = ref;
	}
	public void disp()
	{
		System.out.println("The Type of t is " + ref.getClass().getName());
	}
	public T getRef() {
		return ref;
	}
	
}
public class LaunchGen2 {

	public static void main(String[] args) 
	{
		Generics<Integer> gen = new Generics<>(45);
		gen.disp();
		System.out.println(gen.getRef());
		Generics<String> gen2 = new Generics<>("Telusko");
		gen2.disp();
		System.out.println(gen2.getRef());
	}
}
