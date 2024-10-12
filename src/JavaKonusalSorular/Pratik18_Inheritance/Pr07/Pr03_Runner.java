package JavaKonusalSorular.Pratik18_Inheritance.Pr07;
import java.util.Scanner;
public class Pr03_Runner {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		Pr02_Yonetici y = new Pr02_Yonetici();
		System.out.println("Lutfen calisanin adini giriniz : ");
		y.isim = scan.nextLine();
		System.out.println("Lutfen calisanin departmanini giriniz : ");
		y.departman = scan.nextLine();
		System.out.println("Lutfen calisanin maasini giriniz : ");
		y.maas = scan.nextInt();
		
		System.out.println(y);
		
		System.out.println("Bu calisanin maasina zam yapmak istiyor musunuz? Evet icin 'E' hayir icin 'H'");
		char zam= scan.next().toUpperCase().charAt(0);
		
		
		
		if (zam=='E') {
			System.out.println("Lutfen ne kadar zaman yapmak istediginizi giriniz");
		    y.zam(scan.nextInt());

		}else {
			System.out.println("Sirketimize hos geldiniz");
		
		}
		scan.close();
	}
}
