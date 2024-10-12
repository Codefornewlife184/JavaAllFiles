package JavaKonusalSorular.Pratik08_IfStatements;

import java.util.Scanner;

public class Pr02 {

	public static void main(String[] args) {
		/* Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
		 * dort islemden biri ile isleme koyup sonucun yazdiriniz... */
		
		Scanner scan = new Scanner(System.in);
		System.out.print("1-Toplama \n2-Cikarma \n3-Carpma \n4-Bolme \nLutfen isleminizi seciniz: ");
		int islem = scan.nextInt();
		System.out.println("Lutfen iki sayi giriniz");
		
		double sayi1=scan.nextDouble(); // Klavyeden 42 deðerini verdik.
		double sayi2=scan.nextDouble(); // Klavyeden 75 deðerini verdik.
		
		if (islem==1) {
			System.out.println("Toplama : " + sayi1+ "+" +sayi2+ "=" + (sayi1+sayi2));
		}else if (islem==2) {
			System.out.println("Cikarma : "  + sayi1+ "-" +sayi2+ "=" +  (sayi1-sayi2));
		}else if (islem==3) {
			System.out.println("carpma : "  + sayi1+ "*" +sayi2+ "=" +  (sayi1*sayi2));
		}else if (islem==4) {
			System.out.println("Bolme : "  + sayi1+ "/" +sayi2+ "=" + (sayi1/sayi2));
		}else
			System.out.println("Hatali Secim");
		
		scan.close();

	}

}