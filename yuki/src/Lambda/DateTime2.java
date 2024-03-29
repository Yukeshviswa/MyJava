package Lambda;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
//import java.util.Scanner;
public class DateTime2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LocalDate dl=LocalDate.now();
System.out.println(dl);
LocalTime tl=LocalTime.now();
System.out.println(tl);
LocalDateTime dtl=LocalDateTime.now();
System.out.println(dtl);
DateTimeFormatter dtf=DateTimeFormatter.ofPattern("MM/dd/yyyy ss:mm:HH");
String fd=dtl.format(dtf);
System.out.println(fd);
DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("MMM/dd/yyyy ss:mm:HH");
String fd1=dtl.format(dtf1);
System.out.println(fd1);
DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("E,MMM/yyyy ss:mm:HH");
String fd2=dtl.format(dtf2);
System.out.println(fd2);

	}

}
