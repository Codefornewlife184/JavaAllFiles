package CoreJavaDay50.day30_DateTime;
import java.time.LocalDate;
public class C01_LocalDate {
public static void main(String[] args) {

	LocalDate tarih= LocalDate.now();
	//tarih isiminde obj creat ettik.TRICK :new anahtari kullanilmaz
	System.out.println("bugunun tarihi : "+tarih);
	
	System.out.println("bugunden 21 gun sonrasi : "+tarih.plusDays(21));
	System.out.println("bugunden 3 yil sonrasi : " +tarih.plusYears(3));
	System.out.println("bugunden 3 gun  5 ay 2 yil sonrasi :"
	+tarih.plusDays(3).plusMonths(5).plusYears(2));
	System.out.println("bugunden 40 gun oncesi : " +tarih.minusDays(40));
	System.out.println("bugunun 5 yil oncesi 2 ay sonrasi 3 hafta ertesi : "
	+tarih.minusYears(5).plusMonths(2).plusWeeks(3));
	
	/* localDate class ndan uretilen obj method chain kuralina uyar .
	 * ve methodlar ayni (homojen ) olmak zorunda degildir EX:15. satir.. */
	
	System.out.println(tarih.getDayOfMonth());
	System.out.println(tarih.getDayOfWeek());
	System.out.println(tarih.getMonthValue());
	System.out.println(tarih.getMonth());
	
	LocalDate dogumGunuDate =LocalDate.of(1974, 4, 3);
	System.out.println("dogum tarihi : "+dogumGunuDate);
	System.out.println("dogum gunu : "+dogumGunuDate.getDayOfWeek());
	
	System.out.println(tarih.isAfter(dogumGunuDate));
	System.out.println(dogumGunuDate.isBefore(tarih));
	System.out.println("bugun artik yil mi : "+tarih.isLeapYear());
}
}