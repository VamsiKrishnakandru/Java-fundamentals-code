class Employee
{
	private int id;

	private String name;
	
	Employee(int id, String name)
	{
		this.id = id;
		this.name = name;
		System.out.println("Param constructor");
	}
	
	Employee()
	{
		System.out.println("Zero parameterized constructor");
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
public class LaunchConstructor1 
{
	public static void main(String[] args) 
	{
		Employee emp = new Employee(5, "Tron");
		System.out.println(emp.getId());
		System.out.println(emp.getName());
		
		System.out.println("************************************");
		
		Employee emp1 = new Employee();
		emp1.setId(4);
		emp1.setName("Vamsi");
		System.out.println(emp1.getId());
		System.out.println(emp1.getName());
	}

}
