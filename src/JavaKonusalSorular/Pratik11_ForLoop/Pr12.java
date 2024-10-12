package JavaKonusalSorular.Pratik11_ForLoop;

import java.util.Scanner;

public class Pr12 {

	public static void main(String[] args) {
		/*
		 Soru ; Interview Question
		 Kullanicidan bir String isteyin ve Stringi tersten yazdirin. 
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen tersten yazdirmak icin bir String yaziniz ");
		
		String kelime=scan.nextLine();

		for (int i = 0; i < kelime.length(); i++) {
			System.out.print(kelime.substring(kelime.length()-1-i, kelime.length()-i));
		}


		// 2. yol ; su sekilde de yapabiliriz...
		System.out.println("");// ustteki cozumle karismasin diye asagiya eklemek icin ekledik..
		for (int i = kelime.length()-1; i >= 0; i--) {
			System.out.print(kelime.substring(i,i+1));
		}
		scan.close();
	}

}