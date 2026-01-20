//Functional Interface
@FunctionalInterface
interface Tron2
{
	//single abstract method 
	void disp();
}
//older implementation
//class Alien implements Tron2
//{
//	@Override
//	public void disp()
//	{
//		System.out.println("Implemented in alien class");
//	}
//}
public class LaunchLambda1 
{
	public static void main(String[] args) 
	{
//		traditional way
//		Alien alien=new Alien();
//		alien.disp();
		
		//Anonymous inner class
//		Tron2 t=new Tron2() {
//
//			@Override
//			public void disp() 
//			{
//				System.out.println("Implemented in anonymous class");
//			}			
//		};
		
		//No method name so Lambda works only for functional interface.
		Tron2 tron2 = () -> {
			System.out.println("Implemented with Lambda");
		};
		tron2.disp();
		
		//no brackets if one statement in method
		Tron2 tron3 = () -> System.out.println("Implemented with Lambda2");
		tron3.disp();
	}
}
 