package JavaKonusalSorular.Pratik08_IfStatements;

import java.util.Scanner;

public class Pr16 {

	public static void main(String[] args) {
		/*
		 * Soru ; Kullanicidan maas icin bir teklif isteyin
		 * ve asagidaki degerlere gore cevap azdirin. 
		 * Teklif 80.000 in uzerinde ise "Kabul ediyorum" ,
		 * 60 80.000 arasinda ise "Konusabiliriz",
		 * 60.000 nin altinda ise "Maalesef Kabul edemem"
		 * yazdirin
		 */
		
		Scanner scan = new Scanner(System.in);

		System.out.print("Lutfen maas icin teklif giriniz : ");
		double maas=scan.nextDouble();
		
		if (maas>=80000) {
			System.out.println("Kabul ediyorum");
		}else if (maas>=60000) {
			System.out.println("Konusabiliriz");
		}else
			System.out.println("Malesef Kabul edemem");
		
		scan.close();

	}

}
