package JavaKonusalSorular.Pratik07_ScannerClass;

import java.util.Scanner;

public class Pr01 {

	public static void main(String[] args) {

		// Kullanicidan iki tamsayi alip bu sayilarin toplam,fark ve carpimlarini yazdirin

		// Çözüm Aşamaları : Kullanicidan deger almak icin 3 adim atmaliyiz...

		// 1- Scanner objesi olusturalim

		Scanner scan = new Scanner(System.in);

		// 2- Kullanicadan ne istedigimizi yazdiralim...

		System.out.println("Lutfen iki tamsayi giriniz");

		// 3- Next methodunu kullanarak girilen degerleri alip, olusturacagimiz variable'lara atayalim

		int sayi1 = scan.nextInt(); // Klavyeden 42 değerini verdik.
		int sayi2 = scan.nextInt(); // Klavyeden 28 değerini verdik.

		System.out.println("Girdiginiz sayilarin toplamı : " + (sayi1+sayi2)); // Girdiginiz sayilarin toplami : 70
		System.out.println("Girdiginiz sayilarin çıkarması : " + (sayi1-sayi2)); // Girdiginiz sayilarin çıkarması : 14
		System.out.println("Girdiginiz sayilarin çarpımı : " + (sayi1*sayi2)); // Girdiginiz sayilarin çarpımı : 1176

		scan.close(); // scan sınıfını class sonunda close metodu ile kapatıyoruz.
	}

}
