package CoreJavaDay50.day14_methodCreationOverloading;

public class C06_MethodOverloading01 {

	public static void main(String[] args) {

		String str = "Java candir";

		System.out.println(str.substring(5)); // candir
		System.out.println(str.substring(5, 7)); // ca

		String isim = "Mehmet";
		String soyisim = "Bilge";
		int sayi1 = 10;
		int sayi2 = 20;
		double sayi3 = 15.0;
		double sayi4 = 3.14;

		toplama(isim, soyisim); // 52.satıra gider metoda gider ve ordan yazdırma yapar...
		toplama(sayi1, sayi2); // 36.satıra gider metoda gider...
		toplama(sayi3, sayi4); // 29.satıra gider metoda gider...

		toplama(20, 45.3); // double genis oldugu icin direk toplama yapar
		toplama(45.3, 20);// double genis oldugu icin  direk toplama yapar

	}

	private static void toplama(double sayi3, double sayi4) {
		System.out.println("28.Satırdaki method : " + (sayi3 + sayi4)); // 18.14
		System.out.println("30.Satır: " + "1.method"); // 1.method

	}







	// devamı diğer sayfada

	private static void toplama(int sayi1, int sayi2) {
		System.out.println("36.Satırdaki method : " + (sayi1 + sayi2)); // 30

	}

	private static void toplama(int sayi1, double sayi3) {
		System.out.println("41.Satırdaki method : " + (sayi1 + sayi3)); // 65.3

	}

	private static void toplama(double sayi1, int sayi3) {
		System.out.println("46.Satırdaki method : " + (sayi1 + sayi3)); // 65.3
		System.out.println("48.Satır: " + "4.method"); // 4.method

	}

	private static void toplama(String isim, String soyisim) {
		System.out.println("52.Satırdaki method : " + isim + soyisim); // MehmetBilge
	}

}









