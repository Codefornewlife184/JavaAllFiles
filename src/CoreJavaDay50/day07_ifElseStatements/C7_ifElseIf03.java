package CoreJavaDay50.day07_ifElseStatements;
import java.util.Scanner;
public class C7_ifElseIf03 {

	public static void main(String[] args) {
		// Soru 7) Kullanicidan 100 uzerinden notunu isteyin. 
		// Notu harf sistemine cevirip yazdirin.
		// 50 den kucukse D,
		// 50-60 arasi C,
        // 60-80 arasi B,
		// 80 nin uzerinde ise A

		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen notunuzu giriniz");
		
		double not=scan.nextDouble();
		
		if (not<0||not>100) {
			System.out.println("lutfen gecerli not giriniz");
	
		}else if (not<50) {
			System.out.println("Notunuz D");
		}else if (not<=60) {
			System.out.println("Notunuz C");
		}else if (not<=80) {
			System.out.println("Notunuz B");
		}else {
			System.out.println("Notunuz A"); 
			// concol da 81.3 yazarsak hata veriyor.
			// 81,3 yazarsak cevabi verir...
		}
			
		scan.close();
	}
}
