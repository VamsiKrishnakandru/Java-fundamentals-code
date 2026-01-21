import java.io.*;

public class LaunchIO3 {

	public static void main(String[] args) throws IOException {
		String filePath = "C:\\\\Users\\\\kvams\\\\Desktop\\\\Telusko\\\\Java fundamentals code\\\\IODir\\\\IOFile1.txt";
		FileReader reader = null;
		try
		{
			File file = new File(filePath);
			reader = new FileReader(file);
//			int i = reader.read(); //reads single char and returns it decimal equivalent
			char[] ch = new char[(int)file.length()];
			reader.read(ch);
			for(char c: ch)
			{
				System.out.println(c);
			}
//			while(i!=-1)
//			{
//				System.out.println(i + " -> " + (char)i);
//				i = reader.read();
//			}
		}
		catch(Exception ex)
		{
			System.out.println("Some problem");
		}
		finally
		{
			reader.close();
		}
	}
}
