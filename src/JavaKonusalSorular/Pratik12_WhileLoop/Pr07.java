package JavaKonusalSorular.Pratik12_WhileLoop;
import java.util.Scanner;
public class Pr07 {

	public static void main(String[] args) {
		// Soru ; Kullanicidan bir sayi alin ve bu sayiyi tam bolen sayilari ve toplam kac tane
        // olduklarini ekranda yazdirin
        
        Scanner scan= new Scanner(System.in);
         System.out.println("Lutfen bir adet tam sayi giriniz: ");
         
         int sayi= scan.nextInt();
         int tamBolen=1;
         int sayac=0;
         
         while (tamBolen<=sayi) {
             if (sayi%tamBolen==0) {
             System.out.print(tamBolen + " ");
             sayac++;
             }
             tamBolen++;
         } 
         
         System.out.println("\nGirdiginiz sayiyi tam bolen " + sayac + " adet sayi var.");
         scan.close();
	}

}