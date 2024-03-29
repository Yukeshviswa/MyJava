package Lambda;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LocalDate d=LocalDate.now();
System.out.println(d);
LocalTime t=LocalTime.now();
System.out.println(t);
System.out.println(LocalDate.now());
System.out.println(LocalTime.now());
LocalDateTime dt=LocalDateTime.now();
	System.out.println(dt);
	System.out.println(d.getDayOfMonth());
System.out.println(d.getMonth());
System.out.println(d.getYear());	
System.out.println(t.getHour());
System.out.println(t.getMinute());
System.out.println(t.getSecond());
System.out.println(t.getNano());	
System.out.println(d.plusDays(10));
System.out.println(d.plusMonths(3));
System.out.println(d.plusYears(5));
System.out.println(d.plusWeeks(8));
System.out.println(d.minusDays(4));
System.out.println(t.plusMinutes(30));
System.out.println(t.plusHours(4));
int g=d.getYear();
System.out.println(g);
	
	
	
	}

}

