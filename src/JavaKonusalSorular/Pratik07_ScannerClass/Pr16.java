package JavaKonusalSorular.Pratik07_ScannerClass;

import java.util.Scanner;

public class Pr16 {

	public static void main(String[] args) {
	
		/* Kullanicidan dakika girmesini isteyin,
		 * Dakikalari birkac yil ve gun sayisina
		 * donusturmek icin bir Java programi yazin.

		INPUT:
		Dakika sayisi: 3456789
		OUTPUT :
		3456789 dakika yaklasik 6 yil 210 gundur
		*/

		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen dakika giriniz");
		long dakika=scan.nextLong();
		
		long yil=dakika/(60*24*365);
		long gun=(dakika%(60*24*365))/(60*24);
		
		System.out.println("Sonuc : "+dakika+ " dakika yaklasik " +yil+ " yil " +gun+ " gundur.");
		// Sonuc : 3456789 dakika yaklasik 6 yil 210 gundur.
		
		
		scan.close();
		
		
		
		
		
		
		
		
		
	}

}
