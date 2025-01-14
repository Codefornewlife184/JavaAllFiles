package JavaKonusalSorular.Pratik11_ForLoop;
import java.util.Scanner;
public class Pr13 {

	public static void main(String[] args) {
		/*  Sayinin Mukemmel sayi olup olmadigini kontrol eden Java kodunu yazin.
		 * Sayinin kendisi haric pozitif bolenlerinin toplami o sayiya esitse, herhangi
		 * bir sayi Mukemmel Sayi olarak bilinir.
		 * Input : 6
		 * Output: 6 Mukemmel Sayidir.
		 * Input : 7
		 * Output: 7 Mukemmel Sayidir degildir.              */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz");
		int sayi = scan.nextInt();
		
		int bolenler = 0 ;
		 for(int i = 1 ; i<sayi; i++) {
			 if(sayi%i==0) {
				 bolenler+=i;
			 }
		 }
		mukemmelSayi(sayi,bolenler);
		
	scan.close();	
	}

	private static void mukemmelSayi(int sayi, int bolenler) {
		if(sayi==bolenler) {
			System.out.println(sayi+" Mukemmel Sayidir.");
		}
		else System.out.println(sayi+" Mukemmel Sayidir degildir.");
	}
}
