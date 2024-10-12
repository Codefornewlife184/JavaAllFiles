package JavaKonusalSorular.Pratik11_ForLoop;

import java.util.Scanner;

public class Pr07 {

	public static void main(String[] args) {
		/*
		 * Soru ; Kullanicidan 100 den kucuk bir tamsayi isteyin. 1 den baslayarak
		 * girilen sayiya kadar 3 un kati olan sayilari yazdirin.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen 100'den kucuk pozitif bir tam sayi girin ");

		int sayi = scan.nextInt();

		for (int i = 1; i <= sayi; i++) {

			if (i % 3 == 0) {
				System.out.print(i + " ");
			}
		}
		scan.close();
	}

}