package JavaKonusalSorular.Pratik07_ScannerClass;
import java.util.Scanner;
public class Pr03 {
	public static void main(String[] args) {

		/* Kullanicidan uc basamakli bir sayi alin
		 * ve sayinin rakamlarini birler,onlar ve yuzler basamagi olarak yazdirin

		 * Ornek : Inputs : 853 
		 * Output : Girdiginiz sayinin birler basamagi : 3
		 *          Girdiginiz sayinin onlar basamagi : 5 
		 *          Girdiginiz sayinin yuzler basamagi : 8        */
		
		Scanner scan= new Scanner (System.in);

		System.out.println("3 basamakli bir sayi giriniz" ); // klavyeden 313 girdik.
		int sayi =scan.nextInt();
		
		// 1) 1 ler basamagindaki sayiyi bulun
		int birler= sayi%10;
		System.out.println("girdiginiz sayinin birler basamagi " + birler); // girdiginiz sayinin birler basamagi 3
		sayi/=10;
		
		// 2) 10 lar basamagindaki sayiyi bulun
		int onlar= sayi%10;
		System.out.println("girdiginiz sayinin onlar basamagi " + onlar); // girdiginiz sayinin onlar basamagi 1
		
		// 3) 100 ler basamagindaki sayiyi bulun
		int yuzler=sayi/=10;
		System.out.println("girdiginiz sayinin yuzler basamagi " + yuzler); // girdiginiz sayinin yuzler basamagi 3
		
		scan.close();
	}
}
