package JavaKonusalSorular.Pratik20_Exceptions;

import java.util.Scanner;

public class Pr18 {

	public static void main(String[] args) {

		/*
		 * Kullanicidan carpma yapmak icin bir String isteyin. Kullanicinin girdigi
		 * String sadece sayilardan olusuyorsa sayiyi 2 ile carpip sonucu yazdirin.
		 * Kullanici sayilardan olusmayan bir String girerse Girdiginiz String sayiya
		 * cevrilemez yazdirin.
		 */
		
		
		Scanner scan =new Scanner(System.in);
		
		System.out.println("lutfen 2 ile carpmak icin String giriniz");
		String str=scan.nextLine();
		
		try {
		System.out.println(2*Integer.parseInt(str));
		}catch (NumberFormatException e) {
			System.out.println("Girdiginiz string sayiya cevrilemez...");
		}

		scan.close();
	}

}
