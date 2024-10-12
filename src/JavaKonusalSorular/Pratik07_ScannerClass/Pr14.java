package JavaKonusalSorular.Pratik07_ScannerClass;

import java.util.Scanner;

public class Pr14 {

	public static void main(String[] args) {
		/*
		 * Kullaniciya gunde ne kadar cay ictigini
		 * ve ne kadar seker kullandigini sorun.
		 * Yilda kac kg seker kullandigini hesaplayan ve yazdirin.
		 * 
		 * 
		 * 1 seker = 1.7 gr olarak hesaplanacak.
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Gunde ne kadar bardak cay icersiniz : ");
		double cay=scan.nextDouble(); // Klavyeden 8 deðerini verdik.
		
		System.out.print("Gunde kaç adet seker kullanirsiniz : ");
		double seker=scan.nextDouble();  // Klavyeden 16 deðerini verdik.
		
		System.out.println("Yilda "+ (cay*seker*1.7*365)/1000+ " kg seker kullaniyor.");
		// Yilda 79.424 kg seker kullaniyor.

		scan.close();
	}

}
