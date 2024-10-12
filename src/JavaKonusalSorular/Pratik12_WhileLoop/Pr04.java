package JavaKonusalSorular.Pratik12_WhileLoop;
import java.util.Scanner;
public class Pr04 {

	public static void main(String[] args) {
		/*
		 Soru ; Kullanicidan pozitif bir tamsayi alin
		 ve bu sayinin rakamlari toplamini yazdirin
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen pozitif bir tamsayi girin");
		
		int sayi=scan.nextInt();

		int i=sayi;
		int rakamlarToplami=0;
		int rakam=0;
		
		while (i>0) {
			
			rakam=i%10;
			rakamlarToplami+=rakam;
			i/=10;
			
		}

		System.out.println("girdiginiz " + sayi + " sayisinin rakamlar toplami : " + rakamlarToplami);
		scan.close();
	}

}