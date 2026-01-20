class Student
{
	 int id;
	 
	 void info()
	 {
		 id=4;
		 double avg=4.5;
		 System.out.println(id + " " + avg);
	 }
	 
//	 void disp()
//	 {
//		 id=5;
//		 // avg=5.5; --> 
//	 }
}



public class LaunchOpp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student stu = new Student(); //object creation //object instantiation
		stu.info();

	}

}
