package CoreJavaDay50.day30_DateTime;
import java.time.LocalDate;

public class C05_ComparingDateAndTime {

	public static void main(String[] args) {

		LocalDate bugun=LocalDate.now();
		LocalDate date=LocalDate.of(2021, 8, 15);

		int fark=bugun.compareTo(date); 
		// compareTo bize iki tarih arasindaki en buyuk parcasini verir.

		System.out.println(bugun); // 2024-09-23
		System.out.println(date); // 2021-08-15
		System.out.println(fark); // 3   bugunun tarihine gore

		// ---> karsilastirilan iki tarihin enbuyuk parcasinin farkini verir.(compareTo)

		// not : yil arasinda fark varsa yili cikarir
		// sonra aya bakar fark yoksa gune gecer..
		// burada da fark gunde oldugu icin buna gore hesap yapti..
		
	}

}