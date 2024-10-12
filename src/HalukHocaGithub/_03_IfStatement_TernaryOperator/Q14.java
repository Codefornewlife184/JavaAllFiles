package HalukHocaGithub._03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q14 {

	public static void main(String[] args) {
		
		/*Kullanici tarafindan girilen bir sayinin
		 *mutlak degerini yazdirmak icin bir program yazin.
		 */
			
			Scanner scan = new Scanner(System.in);
			
			System.out.println("3 sayi giriniz");
			
			int sayi1=scan.nextInt();
			int sayi2=scan.nextInt();
			int sayi3=scan.nextInt();
			
			
			if (sayi1>sayi2 && sayi1>sayi3 && sayi2>sayi3) {
				System.out.println("en buyuk : " + sayi1 + " en kucuk : " + sayi3);
			}else if (sayi2>sayi1 && sayi2>sayi3 && sayi3>sayi1) {
				System.out.println("en buyuk : " + sayi2 + " en kucuk : " + sayi3);
			}else if (sayi3>sayi1 && sayi3>sayi2 && sayi1>sayi2) {
					System.out.println("en buyuk : " + sayi3 + " en kucuk : " + sayi2);
			}
			scan.close();
	}

}
