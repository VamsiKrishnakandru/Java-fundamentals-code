class Alien //POJO
{
	private int id;
	private String name;
	public int getId() 
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
}


public class LaunchAlien 
{

	public static void main(String[] args) 
	{
		Alien alien1 = new Alien();
		alien1.setId(4);
		alien1.setName("vamsi");
		System.out.println(alien1.getId());
		System.out.println(alien1.getName());
		
		System.out.println("*******************************");
		
		Alien alien2 = new Alien();
		alien2.setId(4);
		alien2.setName("tron");
		System.out.println(alien2.getId());
		System.out.println(alien2.getName());
	}

}
