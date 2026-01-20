
enum Week
{
	MON, TUE, WED, THU, FRI, SAT, SUN;
}

public class LaunchEnum1 {
	public static void main(String[] args) 
	{
		Week week = Week.MON;
		System.out.println(week);
		
		int index = Week.THU.ordinal();
		System.out.println(index);
		
		Week[] value = week.values();
		for(Week data:value)
		{
			System.out.println(data.ordinal() + " -> " + data);
		}
	}
}
