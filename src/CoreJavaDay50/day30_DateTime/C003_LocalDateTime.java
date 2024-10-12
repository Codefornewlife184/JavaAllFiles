package CoreJavaDay50.day30_DateTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
public class C003_LocalDateTime {

	public static void main(String[] args) {
		// -----------------------TARIH // ZAMAN-----------------------
		LocalDateTime ldt = LocalDateTime.now();

		System.out.println("aktual tarih ve zaman : " + ldt);
		// aktual tarih ve zaman : 2024-09-23T22:57:03.340944500

		LocalDate d = LocalDate.of(2016, 1, 10);
		LocalTime t = LocalTime.of(13, 30);

		LocalDateTime ldt1 = LocalDateTime.of(d, t);
		System.out.println(d); // 2016-01-10
		System.out.println(t);// 13:30
		System.out.println(ldt1);// 2016-01-10T13:30

		System.out.println(ldt.getHour()); // 22
		// -----------------------------------------------------------
		// Diger detaylarda asagidadir...

		System.out.println(ldt);
		// 2024-09-23T22:57:03.340944500

		System.out.println(ldt.toString());
		// 2024-09-23T22:57:03.340944500

		// toString bize manipulation icin lazim olacak. mesela ;

		String time = ldt.toString();
		System.out.println(time.startsWith("2021")); // false
	}
}
