package time;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;


public class LocalDateEx1 {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 mm월 dd일 EEE요일 hh시 mm분 ss초");
		System.out.println(sdf.format(date));
		
	
		
		LocalDate currDate=LocalDate.now();
		System.out.println(currDate);
		
		LocalTime localtime = LocalTime.now();
		System.out.println(localtime);
		
		LocalDateTime localdatetime = LocalDateTime.now();
		System.out.println(localdatetime);
	}

}
