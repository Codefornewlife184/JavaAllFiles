package JavaKonusalSorular.Pratik08_IfStatements;

import java.util.Scanner;

public class Pr15 {

	public static void main(String[] args) {
		/*
		 * Soru ; Kullanicidan bir tamsayi isteyin ve sayinin tek veya cift oldugunu
		 * yazdirin
		 */

		Scanner scan = new Scanner(System.in);

		System.out.print("Lutfen bir tamsayi giriniz : ");
		int sayi = scan.nextInt();

		if (sayi % 2 == 0 && sayi % 2 != 0) {
			System.out.println("Cift Sayi");
		} else {
			System.out.println("Tek Sayi");

			scan.close();

	}

}
}