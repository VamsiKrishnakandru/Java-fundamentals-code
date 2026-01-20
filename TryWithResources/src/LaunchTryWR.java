import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
class Alien implements AutoCloseable
{
	@Override
	public void close() throws Exception
	{
		System.out.println("Close method of alien");
	}
}
public class LaunchTryWR {
	public static void main(String[] args) throws Exception 
	{
//		Alien alien=null;
//		try
//		{
//			alien=new Alien();
//		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//		}
//		finally
//		{
//			alien.close();
//		}
		try(Alien a=new Alien())
		{
			
		}
//		BufferedWriter writer=null;
//		try
//		{
//			writer=new BufferedWriter(new FileWriter("D:\\java.txt"));
//		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//		}
//		finally
//		{
//			writer.close();
//		}
		//below the resources are automatically closed if any error occurs
		try(BufferedWriter writer=new BufferedWriter(new FileWriter("D:\\java.txt")))
		{	
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
