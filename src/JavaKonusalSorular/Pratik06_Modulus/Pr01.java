package JavaKonusalSorular.Pratik06_Modulus;

public class Pr01 {

	public static void main(String[] args) {
	// 5496 sayisinin rakamlar toplamini bulalim

	int sayi=5496;
	int rakamlarToplami=0;

	// Bir sayinin rakamlar toplamini bulmak icin her basamak degerinde 3 islem yapariz
	// Bu satirda sayi=5496 , rakamlar toplami = 0

	// Çözüm Aşamaları
	// 1- sayi%10 yaparak son basamagi elde ederiz.
	int rakam= sayi%10;

	// Sonra
	// 2- bu rakami 9.satırdaki rakamlarToplamina ekleriz. 0 idi çıkan soucu eklemiş olur bu işlemle.
	rakamlarToplami += rakam ;

	// Sonra
	// 3- degerini aldigimiz son basamaktan kurtulmak icin sayiyi 10"a boleriz
	sayi /=10;
	// bu satira geldigimde sayi=549 , rakamlar toplami = 6
	// 5496/10=549 int olduğu için tam sayı çıkarır.
	// RakamlarToplami da son basamağı alır ve 6 çıkarır.

	// Aynı işlemleri tekrar ederek basamakları tek tek düşürmüş olup
	// en son basamakları alarak rakamlar toplamını bulmuş olacağız.
	rakam=sayi%10;
	rakamlarToplami+=rakam;
	sayi/=10;

	// bu satira geldigimde sayi=54 , rakamlar toplami = 15

	// Aynı işlemleri tekrar ederek basamakları tek tek düşürmüş olup
	// en son basamakları alarak rakamlar toplamını bulmuş olacağız.
	rakam=sayi%10;
	rakamlarToplami += rakam;
	sayi /=10;

	// bu satira geldigimde sayi=5 , rakamlar toplami = 19

	// Aynı işlemleri tekrar ederek basamakları tek tek düşürmüş olup
	// en son basamakları alarak rakamlar toplamını bulmuş olacağız.
	rakam= sayi%10 ;
	rakamlarToplami += rakam;
	sayi /= 10;

	// Kodumuzun sonunda rakamlar toplami 24,  sayi 0 oldu...

		System.out.println("Rakamlar toplami : " + rakamlarToplami ); // Rakamlar toplami : 24
		System.out.println("Sayinin son degeri : " + sayi ); // Sayinin son degeri : 0

}

}









