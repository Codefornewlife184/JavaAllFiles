package HalukHocaGithub._03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q08 {
	/*
	 * SORU 1
	 * 
	 * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, 
	 * Kullaniciya musteri karti olup olmadigini sorun
	 * 
	 * Musteri karti varsa ve 10 urunden fazla alirsa %20, 
	 * yoksa %15 indirim yapin 
	 * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 
	 * 10 urunden az alirsa %10 indirim yapin
	 */
	
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen urun adedi giriniz");
		int adet = scan.nextInt();
		System.out.println("Liste fiyati girin");
		double fiyat = scan.nextDouble();
		System.out.println("kart varsa true yoksa false yazin");
		boolean kart = scan.nextBoolean();

		double toplamFiyat = adet * fiyat;

		if (kart == true) {
			if (adet > 10) {
				System.out.println("Yuzde 20 indirim : " + toplamFiyat * 80 / 100);
			} else
				System.out.println("Yuzde 15 indirim : " + toplamFiyat * 85 / 100);
		} else if (kart == false) {
			if (adet > 10) {
				System.out.println("Yuzde 15 indirim : " + toplamFiyat * 85 / 100);
			} else
				System.out.println("Yuzde 10 indirim : " + toplamFiyat * 90 / 100);

		}

		scan.close();
	}

}
