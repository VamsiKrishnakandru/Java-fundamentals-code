class Employee2
{
	private int id;
	private String name;
	private double salary;
	
	void setId(int id)
	{
		this.id=id;
	}
	void setName(String name)
	{
		this.name=name;
	}
	void setSalary(double salary)
	{
		this.salary=salary;
	}
	
	int getId()
	{
		return id;
	}
	String getName()
	{
		return name;
	}
	double getSalary()
	{
		return salary;
	}
}


public class LaunchEncap2 {

	public static void main(String[] args) 
	{
		Employee2 emp1 = new Employee2();
		emp1.setId(45);
		emp1.setName("Rohan");
		emp1.setSalary(45452.1);
		
		System.out.println(emp1.getId());
		System.out.println(emp1.getName());
		System.out.println(emp1.getSalary());
	}

}
