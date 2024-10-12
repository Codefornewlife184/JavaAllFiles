package CoreJavaDay50.day04_increment_matematiksel_islemler;

public class C4_modulos {

	public static void main(String[] args) {
		// 5496 sayisinin rakamlar toplamini bulalim

		int sayi=5496;
		int rakamlarToplami=0;

		// Bir sayinin rakamlar toplamini bulmak icin her basamak degerinde 3 islem yapariz
		// Bu satirda sayi=5496 , rakamlar toplami = 0

		// ��z�m A�amalar�
		// 1- sayi%10 yaparak son basamagi elde ederiz.
		int rakam= sayi%10;

		// Sonra
		// 2- bu rakami 9.sat�rdaki rakamlarToplamina ekleriz. 0 idi ��kan soucu eklemi� olur bu i�lemle.
		rakamlarToplami += rakam ;

		// Sonra
		// 3- degerini aldigimiz son basamaktan kurtulmak icin sayiyi 10"a boleriz
		sayi /=10;
		// bu satira geldigimde sayi=549 , rakamlar toplami = 6
		// 5496/10=549 int oldu�u i�in tam say� ��kar�r.
		// RakamlarToplami da son basama�� al�r ve 6 ��kar�r.

		// Ayn� i�lemleri tekrar ederek basamaklar� tek tek d���rm�� olup
		// en son basamaklar� alarak rakamlar toplam�n� bulmu� olaca��z.
		rakam=sayi%10;
		rakamlarToplami+=rakam;
		sayi/=10;

		// bu satira geldigimde sayi=54 , rakamlar toplami = 15

		// Ayn� i�lemleri tekrar ederek basamaklar� tek tek d���rm�� olup
		// en son basamaklar� alarak rakamlar toplam�n� bulmu� olaca��z.
		rakam=sayi%10;
		rakamlarToplami += rakam;
		sayi /=10;

		// bu satira geldigimde sayi=5 , rakamlar toplami = 19

		// Ayn� i�lemleri tekrar ederek basamaklar� tek tek d���rm�� olup
		// en son basamaklar� alarak rakamlar toplam�n� bulmu� olaca��z.
		rakam= sayi%10 ;
		rakamlarToplami += rakam;
		sayi /= 10;

		// Kodumuzun sonunda rakamlar toplami 24,  sayi 0 oldu...

		System.out.println("Rakamlar toplami : " + rakamlarToplami ); // Rakamlar toplami : 24
		System.out.println("Sayinin son degeri : " + sayi ); // Sayinin son degeri : 0


	
		
	}

}