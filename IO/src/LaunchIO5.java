import java.io.*;

public class LaunchIO5 {

	public static void main(String[] args) throws IOException {
		String filePath = "C:\\Users\\kvams\\Desktop\\Telusko\\Java fundamentals code\\IODir\\IOFile1.txt";
		FileReader reader = null;
		BufferedReader br = null;
		try
		{
			File file = new File(filePath);
			reader = new FileReader(file);
			br = new BufferedReader(reader);
			String s = br.readLine(); //entire line
			while(s != null)
			{
				System.out.println(s);
				s=br.readLine();
			}
		}
		catch(Exception e)
		{
			System.out.println("Some Problem");
		}
		finally
		{
			br.close();
		}
	}

}
