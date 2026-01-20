import java.util.ArrayList;

class Human
{
	int age;
	public void disp()
	{
		System.out.println("Humans are best creatures");
	}
}
class Student extends Human
{
}
class Employee
{
}
public class LaunchGen3 {

	public static void main(String[] args) 
	{
		//wild card //upperbound //lowerbound
		Human h = new Human();
		Student st = new Student();
		h=st;
		//st=h;//ce // downcasting
//		ArrayList<Human> humanList1 = new ArrayList<>();
//		ArrayList<Student> stuList1 = new ArrayList<>();
//		//humanList1 = stuList; //ce - arraylist is not child of another arraylist
		
		ArrayList<?> humanList1 = new ArrayList<>(); //? - unknown or wild card
		ArrayList<Student> stuList1 = new ArrayList<>();
		ArrayList<Employee> empList1 = new ArrayList<>();
		humanList1 = stuList1;
		humanList1 = empList1;
		
		ArrayList<? extends Human> humanList2 = new ArrayList<>(); //upperbound
		ArrayList<Student> stuList2 = new ArrayList<>();
		ArrayList<Employee> empList2 = new ArrayList<>();
		humanList2 = stuList2;
		//humanList2 = empList2; //ce
		
		ArrayList<? super Human> humanList3 = new ArrayList<>(); //lowerbound
		ArrayList<Student> stuList3 = new ArrayList<>();
		ArrayList<Employee> empList3 = new ArrayList<>();
		ArrayList<Object> objList3 = new ArrayList<>();
		//humanList3 = stuList3; //ce
		//humanList3 = empList3; //ce
		humanList3 = objList3;
	}
}
