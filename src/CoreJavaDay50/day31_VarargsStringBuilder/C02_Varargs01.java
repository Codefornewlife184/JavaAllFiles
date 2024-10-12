package CoreJavaDay50.day31_VarargsStringBuilder;

public class C02_Varargs01 {

	public static void main(String[] args) {
		// Not ; Var-args ---> Arguman cesitliligi
		// Verilen iki sayiyi toplayan ve sonucu yazdiran bir method yaziniz..
		
		int sayi1=10;
		int sayi2=20;
		int sayi3=30;

		ikiSayiToplama(sayi1,sayi2); // 29. satır çalışır.
		
		ucSayiToplama(sayi1,sayi2,sayi3); // 25. satır çalışır.
		
		ikiSayiToplama(2,3);  // 29. satır ile direk çalışır ve iki sayinin toplami : 5 yazdırır.
		ucSayiToplama(2,3,5); // 25. satır ile direk çalışır ve uc sayinin toplami : 10 yazdırır.
		
		// Oyle bir method yazalim ki icine kac sayi girersek girelim toplasin... bUna varargs denir.
		// Java boyle ugrasmayalim diye bir varags olusturmus... işi kolaylaştırmış.
		
	}

	public static void ucSayiToplama(int sayi1, int sayi2, int sayi3) {
		System.out.println("uc sayinin toplami : " + (sayi1+sayi2+sayi3)); // uc sayinin toplami : 60
	}

	public static void ikiSayiToplama(int sayi1, int sayi2) {
		System.out.println("iki sayinin toplami : " + (sayi1+sayi2)); // iki sayinin toplami : 30
	}
}