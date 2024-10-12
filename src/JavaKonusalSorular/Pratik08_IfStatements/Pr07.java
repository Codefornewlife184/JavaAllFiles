package JavaKonusalSorular.Pratik08_IfStatements;

import java.util.Scanner;

public class Pr07 {

	public static void main(String[] args) {
		/*
		 * Soru ; Kullanicidan bir karakter girmesini isteyin ve girilen karakterin
		 * harf olup olmadigini yazdirin
		 * 
		 */

		Scanner scan = new Scanner(System.in);

		System.out.print("Lutfen bir karakter giriniz : ");

		char karakter = scan.next().charAt(0);

		if (karakter >= 'A' && karakter <= 'Z' || karakter >= 'a' && karakter <= 'z') {

			System.out.println("Girilen karakter harf");

		} else {

			System.out.println("Girilen karakter harf degil");
		}

		scan.close();
	}

}
