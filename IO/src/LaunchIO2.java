import java.io.*;

public class LaunchIO2 {

	public static void main(String[] args) throws IOException {
		File f1 = new File("C:\\Users\\kvams\\Desktop\\Telusko\\Java fundamentals code\\IODir\\IOFile1.txt");
		FileWriter writer = null; //if written in try block then error in finally block
		try {
			writer = new FileWriter(f1, true);
			writer.write("Tron");
			writer.write("\n");
			writer.write(97); //respective char will print
			writer.write("\n");
			writer.write(65);
			writer.write("\n");
			char[] ch = {'c', 'a', 's', 'e'}; //case
			writer.write(ch);
		} catch (IOException e) {
			System.out.println("some problem...");
		} finally
		{
			writer.close(); //imp
		}
	}

}
