import java.io.*;

class StudentSe implements Serializable
{
	String name;
	int id;
	transient int dob;
	
	public StudentSe(int id, String name, int dob)
	{
		this.id=id;
		this.name=name;
		this.dob=dob;
	}
	public void display()
	{
		System.out.println("Id: " + id);
		System.out.println("Name: " + name);
		System.out.println("Dob: " + dob);
	}
}

public class LaunchIO7 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		String filePath = "C:\\Users\\kvams\\Desktop\\Telusko\\Java fundamentals code\\IODir\\serial.txt";
//		StudentSe se = new StudentSe(1, "Tron", 1999);
//		se.display();
		File file = new File(filePath);
//		FileOutputStream fos = new FileOutputStream(file);
//		BufferedOutputStream bos = new BufferedOutputStream(fos); //to increase performance and write bos inplace of fos below file
//		ObjectOutputStream oos = new ObjectOutputStream(fos);
//		oos.writeObject(se);
//		oos.close();
//		fos.close();
		FileInputStream fis = new FileInputStream(file);
		BufferedInputStream bis = new BufferedInputStream(fis);
		ObjectInputStream ois = new ObjectInputStream(bis);
		StudentSe se = (StudentSe) ois.readObject();
		se.display();
		fis.close();
		bis.close();
		ois.close();
	}

}
