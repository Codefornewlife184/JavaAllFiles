package CoreJavaDay50.day30_DateTime;
import java.time.LocalTime;
import java.time.ZoneId;
public class C002_LocalTime {

	public static void main(String[] args) {

		// -------------------------------ZAMAN-----------------------------------------

		LocalTime saat = LocalTime.now();
		// now su an ki zamani verir.

		System.out.println(saat); // 22:47:06.495612500

		for (int i = 0; i < 1000000; i++) {
			i += 1;
		}

		// -----------------------------------------------------------------------------------
		// plusSeconds ---> saniye sonra
		// plusMinutes ---> dakika sonra
		// plusHours ---> saat sonra

		System.out.println(saat.plusHours(5)); // 03:47:06.495612500
		System.out.println(saat.plusSeconds(14593983)); // 20:40:09.495612500
		System.out.println(saat.plusMinutes(120)); // 00:47:06.495612500

		// -----------------------------------------------------------------------------------
		// minusSeconds ---> saniye once
		// minusMinutes ---> dakika once
		// minusHours ---> saat once

		System.out.println(saat.minusHours(5)); // 17:47:06.495612500
		System.out.println(saat.minusSeconds(14593983)); // 00:54:03.495612500
		System.out.println(saat.minusMinutes(120)); // 20:47:06.495612500

		// -----------------------------------------------------------------------------------
		// Hepsini toplu da yazdirabiliriz.
		System.out.println(saat.plusHours(15).plusMinutes(20).plusSeconds(7897347));
		// 23:49:33.495612500

		System.out.println(saat.minusHours(15).minusMinutes(20).minusSeconds(7897347));
		// 21:44:39.495612500

		// Karisikkta yazdirabiliriz..
		System.out.println(saat.minusHours(15).plusMinutes(20).minusSeconds(7897347));
		// 22:24:39.495612500

		// -----------------------------------------------------------------------------------
		// getSeconds getHours ve getMinutes ile de o an ki saat dakika ve saniyeyi
		// getirebiliriz..
		System.out.println(saat.getHour()); // 22 ---> su an da saat 3 sadece saati getirir..

		// -----------------------------------------------------------------------------------
		// Baska ulke saatleri ZoneId methodu ile yapilir..

		System.out.println(saat.now(ZoneId.of("Japan"))); // 04:47:06.507606400
		System.out.println(saat.now(ZoneId.of("America/Chicago"))); // 14:47:06.511605500

	}
}








