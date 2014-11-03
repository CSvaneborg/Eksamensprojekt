package logic;

public class Events 
{
	private static String eventName;
	private static int eventDuration;
	
	public static void setEventName (String name)
	{
		eventName = name;
	}
	
	public static String getEventName()
	{
		return eventName;
	}

	public static void setEventDuration (int duration)
	{
		eventDuration = duration;
	}
	
	public static int getEventDuration ()
	{
		return eventDuration;
	}

}
