package CoreJavaDay50.day07_ifElseStatements;
import java.util.Scanner;

public class C1_IfStatements {

	public static void main(String[] args) {
		/*
		 Soru 3) Kullanicidan gun ismini alin ve 
		 haftaici veya hafta sonu oldugunu yazdirin 
 		 Ornek:  	gun=Pazar output = Hafta sonu
		 gun=Sali output = Hafta ici
		 *** String icin equals methodunu kullanin
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen gun ismini giriniz ...");
		
		String gunIsmi=scan.next().toLowerCase();
		
		if (gunIsmi.equals("pazartesi") 
		    || gunIsmi.equals("sali")
		    || gunIsmi.equals("carsamba") 
			|| gunIsmi.equals("persembe") 
			|| gunIsmi.equals("cuma")){
			
			System.out.println("Girdiginiz gun haftaici");
		}
		
		if (gunIsmi.equals("cumartesi") || gunIsmi.equals("pazar")) {
			
			System.out.println("Girdiginiz gun hafta sonu");
		}
		scan.close();
}
}
