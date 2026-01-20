
class Animal
{
	//this method
	public void animalHuntsAndEats()
	{
		System.out.println("Animal is eating .....");
	}
}

class Tiger extends Animal
{
	//its overridden method from Animal
	@Override
	public void animalHuntsAndEats()
	{
		System.out.println("Tiger hunts and eat .....");
	}
}

public class LaunchAnnotation1 {

	public static void main(String[] args) 
	{
		Tiger t= new Tiger();
		t.animalHuntsAndEats();
	}

}
