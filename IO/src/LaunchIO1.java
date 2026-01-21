import java.io.*;

public class LaunchIO1 {

	public static void main(String[] args) 
	{
		File dir = new File("C:\\Users\\kvams\\Desktop\\Telusko\\Java fundamentals code\\IODir");
	    System.out.println(dir.exists());
	    dir.mkdir();
	    System.out.println(dir.exists());
	    File file = new File("C:\\Users\\kvams\\Desktop\\Telusko\\Java fundamentals code\\IODir\\IOFile1.txt");
	    System.out.println(file.exists());
	    try {
			file.createNewFile();
		} catch (IOException e) {
			System.out.println("Some problem...");
		}
	    System.out.println(file.exists());
	    System.out.println(file.getPath());
	    System.out.println(file.isDirectory());
	    System.out.println(file.isFile());
	    File p1 = new File("C:\\\\Users\\\\kvams\\\\Desktop\\\\Telusko\\\\Java fundamentals code");
	    String[] listOfFiles = p1.list();
	    for(String f:listOfFiles)
	    {
	    	System.out.println(f);
	    }
	}

}
