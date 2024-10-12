package JavaKonusalSorular.Pratik07_ScannerClass;

import java.util.Scanner;

public class Pr05 {

	public static void main(String[] args) {
		
		/*
		 *  Kullanicidan alacaginiz 5 basamakli sayinin ilk 2 ve
		 *  son iki basamagindaki rakamlari toplamini bulunuz
		 *  
		 *   Ex :
		 *   input  : 12345
		 *   output : 12
		 */
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Lutfen 5 basamakli sayi giriniz : ");
		
		int sayi = sc.nextInt(); //12345
		
		// ilk 2 basamak icin sayinin basamak sayisindan 1 az olmak kaydiyla
		// yani 5 basamakli ise 1000 e bolerek 6 basamakli ise
		// 10000 e bolerek ilk 2 rakama ulasiriz.

		int ilkIki  = sayi/1000;
		System.out.println("ilkIki sayi : " + ilkIki); //12
		
		int sonIki = sayi%100;
		System.out.println("sonIki sayi : " + sonIki); //45
		
		int iklIkiTop = (ilkIki%10)+ (ilkIki/10);
		System.out.println("ilk iki rakam toplami : " + iklIkiTop); // 3
		
		int sonIkiTop = (sonIki %10) + (sonIki/10);
		System.out.println("son iki rakam toplami : " + sonIkiTop ); // 9
		
		
		System.out.println("Sayilarin toplami: " +(iklIkiTop + sonIkiTop)); // 12
		
		
		sc.close();

	}

}
