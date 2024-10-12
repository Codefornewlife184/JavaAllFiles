package CoreJavaDay50.day30_DateTime;

import java.time.LocalDate;

public class C001_LocalDate {

	public static void main(String[] args) {

		// ---------------------------TARIH------------------------------

		LocalDate tarih = LocalDate.now();
		// now su an ki tarihi verir.
		// new keyword u kullanilmaz..

		System.out.println(tarih); // 2024-09-23

		// ---------------------------------------------------------------
		// plusDay ---> gun sonra
		// plusWeek ---> hafta sonra
		// plusMonths ---> ay sonra
		// plusYears ---> yil sonra

		System.out.println(tarih.plusDays(15)); // 2024-10-08
		System.out.println(tarih.plusWeeks(20)); // 2025-02-10
		System.out.println(tarih.plusMonths(7)); // 2025-04-23
		System.out.println(tarih.plusYears(3)); // 2027-09-23

		// ---------------------------------------------------------------







		// minusDay ---> gun once
		// minusWeek ---> hafta once
		// minusMonths ---> ay once
		// minusYears ---> yil once

		System.out.println(tarih.minusDays(15)); // 2024-09-08
		System.out.println(tarih.minusWeeks(20)); // 2024-05-06
		System.out.println(tarih.minusMonths(7)); // 2024-02-23
		System.out.println(tarih.minusYears(3)); // 2021-09-23

		// ---------------------------------------------------------------
		// Hepsini toplu da yazdirabiliriz.

		System.out.println(tarih.plusDays
				(15).plusWeeks(20).plusMonths(7).plusYears(3));
		// 2028-09-25

		System.out.println(tarih.minusDays(15).minusWeeks(20).minusMonths(7).minusYears(3));
		// 2020-09-21

		// Karisikta yazdirabiliriz..

		System.out.println(tarih.minusDays(15).plusWeeks(20).minusMonths(7).plusYears(3));
		// 2027-06-26

		// ---------------------------------------------------------------
		// artik yil hesaplama... true ve false dondurur. boolean dir.

		System.out.println(tarih.isLeapYear()); // true






		// ---------------------------------------------------------------
		// Kendimiz tarih olusturacak isek ve eski bir tarih olusturacaksak;
		// LocalDate.of methodu kullanilr.

		LocalDate tarih1 = LocalDate.of(1995, 12, 15);
		LocalDate tarih2 = LocalDate.of(1995, 12, 10);

		// Bu 2 tarihi soyyle kiyaslariz..
		// tarih1 tarih2 den sonra mi once mi

		System.out.println(tarih1.isAfter(tarih2)); // true
		System.out.println(tarih1.isBefore(tarih2)); // false

	}

}















