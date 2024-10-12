package JavaKonusalSorular.Pratik09_Ternary;

import java.util.Scanner;

public class Pr02 {

	public static void main(String[] args) {

		// Kullanicidan iki sayi alin ve buyuk olmayan sayiyi yazdirin

		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen iki sayi giriniz");
		
		double sayi1=scan.nextDouble();
		double sayi2=scan.nextDouble();
		
		System.out.println(sayi1>sayi2 ? sayi2 : sayi1); 
		// kucuk olani yazdirmak icin
	
	scan.close();
	}

}
