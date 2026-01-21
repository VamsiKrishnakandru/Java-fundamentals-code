import java.io.*;

public class LaunchIO4 {

	public static void main(String[] args) throws IOException {
		String filePath = "C:\\\\Users\\\\kvams\\\\Desktop\\\\Telusko\\\\Java fundamentals code\\\\IODir\\\\IOFile1.txt";
		FileWriter writer = null;
		BufferedWriter bwriter = null;
		try
		{
			File file = new File(filePath);
			writer = new FileWriter(file, true);
			bwriter = new BufferedWriter(writer);
			bwriter.write("Alien");
			bwriter.newLine();
			bwriter.write(65);
			bwriter.newLine();
			bwriter.write(97);
			bwriter.newLine();
			char []ch = {'J', 'a', 'v', 'a'};
			bwriter.write(ch);
		}
		catch(Exception e)
		{
			System.out.println("Some problem");
		}
		finally
		{
			bwriter.flush(); //not compulsory
			bwriter.close(); //does automatic flush and no need for closing writer.
		}
	}

}
