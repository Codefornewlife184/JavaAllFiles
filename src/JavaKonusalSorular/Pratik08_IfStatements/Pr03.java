package JavaKonusalSorular.Pratik08_IfStatements;

import java.util.Scanner;

public class Pr03 {

	public static void main(String[] args) {
		/*
		 * Soru ; Kullanicidan dikdortgenin kenar uzunluklarini isteyin
		 * ve dikdortgenin kare olup olmadigini yazdirin
		 */
		
		 Scanner scan=new Scanner(System.in);
			
		System.out.print("Lutfen ilk kenar uzunlugunu giriniz : ");
		int kenar1=scan.nextInt(); // Klavyeden 42 de�erini verdik.

		System.out.print("Lutfen ikinci kenar uzunlugunu giriniz : ");
		int kenar2=scan.nextInt(); // Klavyeden 75 de�erini verdik.
		
		if (kenar1==kenar2) {
			System.out.println("Bu bir karedir");
		}else
			System.out.println("Bu bir kare degildir");
		scan.close();
	}
		
		
		
		
		
		
		
		
		
		
		
		
	}


