package JavaKonusalSorular.Pratik07_ScannerClass;

import java.util.Scanner;

public class Pr04 {

	public static void main(String[] args) {
		
		
		// Kullanicidan 2 tam sayi alip bu 2 tamsayinin  dort islem sonucunu yazdiriniz.
		
		Scanner sc =new Scanner (System.in);
		
		System.out.println("Lutfen 1. sayiyi giriniz"); // Klavyeden 75 deðerini verdik.
		double num1 = sc.nextDouble();
		
		System.out.println("Lutfen 2. saysayiyi giriniz"); // Klavyeden 25 deðerini verdik.
		double num2 = sc.nextDouble();
		
		System.out.println("Toplam: " + (num1+num2)); // Toplam: 100.0
		System.out.println("Fark: " + (num1-num2)); // Fark: 50.0
		System.out.println("Carpim: " +(num1*num2)); // Carpim: 1875.0
		System.out.println("Bolum: " + (num1/num2)); // Bolum: 3.0
		
		sc.close(); // scanner class ýna sc ismini verdiðimiz için sc.close() ile kapadýk.

	}

}
