package CoreJavaDay50.day03_datacasting_increment;

public class C3_DataCasting01 {

	public static void main(String[] args) {

		byte sayi1 = 17;
		// Not ; esitligin soluna declaration yani variable denir.
		// = isaretine assignment denir.
		// esitligin sagina ise value yani deger denir.
		
		System.out.println("byte degisken ile : " + sayi1); // byte degisken ile : 17
		
		short sayi2 = sayi1;   
		// sayi2 diye bir variable olusturuldu ve deger olarak
		// sayi1'in degeri atandi
		System.out.println("short degisken ile : " + sayi2); // short degisken ile : 17

		int sayi3 = sayi2;
		System.out.println("int degisken ile : " + sayi3); // int degisken ile : 17

		float sayi4 = sayi3;
		System.out.println("float degisken ile : " + sayi4); // float degisken ile : 17.0
		// float ve double da ondalikli oldugu icin 17.0 olur..


		double sayi5 = sayi2;
		System.out.println("double degisken ile : " + sayi5); // double degisken ile : 17.0
		// float ve double da ondalikli oldugu icin 17.0 olur..

	}
}