import java.time.*;
import java.time.format.*;
public class TimeFunction1{
	public static void main(String[] args){
		System.out.println("GMT TIME :     " + ZonedDateTime.now(ZoneId.of("GMT")));
		System.out.println("IST TIME :     " + ZonedDateTime.now(ZoneId.of("Asia/Kolkata")));
		System.out.println("PST TIME :     " + ZonedDateTime.now(ZoneId.of("America/Los_Angeles")));
	}

		
	
}
