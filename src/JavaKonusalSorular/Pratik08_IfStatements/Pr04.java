package JavaKonusalSorular.Pratik08_IfStatements;
import java.util.Scanner;
public class Pr04 {

	public static void main(String[] args) {
	/*  Kullanicidan 3 tene pozitif  tam sayi alniz.
	    bu uc sayinin ucgen olusturma durumunu kontrol ediniz
	    eger ucgen olabiliyor ise, es kenar ucgen olma durumunu da  kontrol edniz

	     Ucgen olma sarti :herhangi iki kenar toplami diger kenardan buyuk,
	     * herhangi iki kenar farki diger kenardan buyuk olmali
		 a+b>c>a-b
		 a+c>b>a-c
	     b+c>a>b-c
		 a=b=c ise es kenar ucgen    */

		Scanner input = new Scanner(System.in);
		System.out.println("Lutfen 3 tam sayi giriniz");

		int a = input.nextInt();
		int b = input.nextInt();
		int c= input.nextInt();

		if(a+b>c && a-b<c && a+c>b && a-c<b && b+c>a && b-c<a) {
			if(a==b &&a==c) {
				System.out.println("Ucgen ve eskenar ucgendir");
			}else {
				System.out.println("Ucgen fakat eskenar degil");
			}
		}else {
			System.out.println("Ucgen degildir.");
		}

		input.close();
	} }