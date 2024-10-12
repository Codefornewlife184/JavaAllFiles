package JavaKonusalSorular.Pratik07_ScannerClass;
import java.util.Scanner;
public class Pr15 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan uc basamakli bir sayi girmesini
		 * ve bu sayinin basamaklarinin
		 * toplamini bulmasini isteyin.
		 * 
		 * Ornek Cikti
		 * 325
		 * Verilen tamsayinin rakamlari toplami 10'dur.
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen 3 basamakli bir sayi giriniz");
		int sayi=scan.nextInt();

		int birler=sayi%10;
		System.out.println("Birler basamagi : " + birler);
		sayi/=10;

		int onlar=sayi%10;
		System.out.println("Onlar basamagi : " + onlar);

		int yuzler=sayi/10;
		System.out.println("Yuzler basamagi : " + yuzler);

		System.out.println("3 basamakli sayinin rakamlar Toplami ; "
				+(birler+onlar+yuzler));

			scan.close();
}
}