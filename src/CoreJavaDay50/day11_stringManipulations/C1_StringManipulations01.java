package CoreJavaDay50.day11_stringManipulations;
import java.util.Scanner;
public class C1_StringManipulations01 {

		public static void main(String[] args) {
			// Kullanicidan bir cumle ve bir kelime alin, 
			// cumlede kelimenin kullanilip kullanilmadigini yazdirin
			
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Lutfen bir cumle giriniz");
			String cumle=scan.nextLine().toLowerCase();
			
			System.out.println("Lutfen bir kelime girin");
			String kelime=scan.next().toLowerCase();

			//  cumlede kelimenin kullanilip kullanilmadigini yazdirin
			//  indexOf() kullanalim
			
			if (cumle.indexOf(kelime)!=-1) {
				System.out.println("indexOf()  :" + "Kelime cumlede kullanilmis");
			} else {
				System.out.println("kelime cumlede kullanilmamis");
			}
			
			// contains() kullanalim
			if (cumle.contains(kelime)) {
				System.out.println("contains() :" + "Kelime cumlede kullanilmis");
			}else {
				System.out.println("kelime cumlede kullanilmamis");
				
				scan.close();
			}
		}
	}
			
			
			
			
			
			