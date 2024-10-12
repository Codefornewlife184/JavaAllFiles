package CoreJavaDay50.day31_VarargsStringBuilder;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C01_DateTimeFormmatter {

	public static void main(String[] args) {
		
		LocalDateTime ldt=LocalDateTime.now();

		System.out.println(ldt); // 2024-09-23T23:02:58.739614900
	
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yy/MMMM/dd hh:mm");
		// istedigim formatta yazdirmis oldum
		System.out.println(dtf.format(ldt)); // 24/Eylül/23 11:02

		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yy/MMM/dd");
		System.out.println(dtf1.format(ldt)); // 24/Eyl/23
		
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("HH:mm"); // 24 saate gore
		System.out.println(dtf2.format(ldt)); // 23:02 ---> 24 saate gore
		
		DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("hh:mm"); // pm/am sistemine gore
		System.out.println(dtf3.format(ldt)); // 11:02 ---> 12 saate gore
		
		
		
	}

}
