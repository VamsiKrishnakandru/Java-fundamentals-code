import java.io.*;

public class LaunchIO6 {

	public static void main(String[] args) {
		String filePath = "C:\\Users\\kvams\\Desktop\\Telusko\\Java fundamentals code\\IODir\\IOFile1.txt";
		FileWriter writer = null;
		PrintWriter pw = null;
		try
		{
			File file = new File(filePath);
			writer = new FileWriter(file);
			pw = new PrintWriter(writer);
			pw.write("Hello");
			pw.write("\n");
			pw.write(65); //A
			pw.write("\n");
			pw.println(65); //65
			pw.println(true); //true
			pw.print('A'); //A
		}
		catch(Exception e)
		{
			System.out.println("Some Problem");
		}
		finally
		{
			pw.close();
		}
	}

}
