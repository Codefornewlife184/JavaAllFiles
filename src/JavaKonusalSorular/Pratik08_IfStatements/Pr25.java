package JavaKonusalSorular.Pratik08_IfStatements;

import java.util.Scanner;

public class Pr25 {

	public static void main(String[] args) {
		/*
		 * Kullanici tarafindan girilen bir sayinin 
		 * mutlak degerini yazdirmak icin bir program yazin.
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("sayi giriniz");
		int sayi = scan.nextInt();

		sayi *= -1;

		if (sayi < 0) {
		}
		System.out.println("mutlak değeri: " + sayi);

		scan.close();

	}

}