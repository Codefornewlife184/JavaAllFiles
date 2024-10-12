package CoreJavaDay50.day07_ifElseStatements;

import java.util.Scanner;

public class C2_ifElse01 {

	public static void main(String[] args) {
		// Soru 1) Kullanicidan dikdortgenin kenar uzunluklarini isteyin ve 
		// dikdortgenin kare olup olmadigini yazdirin

		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen Dikdortgenin kenarlarini giriniz \nIlk kenari yazinca ENTER'a basiniz");
		
		double kenar1=scan.nextDouble();

		System.out.println("Lutfen ikinci kenari yazinca ENTER'a basiniz");
		double kenar2=scan.nextDouble();
		
		if (kenar1==kenar2) {
			System.out.println("Girdiginiz dikdortgen ölçüleri kare oldu :)");
		} else {
			System.out.println("Girdiginiz dikdortgen ölçüleri kare degil :(");
		}
		
		scan.close();
		
		
		
	}

}
