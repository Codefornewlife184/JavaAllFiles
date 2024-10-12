package HalukHocaGithub._03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Ter02 {

    public static void main(String[] args) {
        // Kullanicidan bir character girmesini isteyiniz
        // Character harf ise kucuk harf olup olmadigini kontrol ediniz
        // Kucuk harf ise ekrana "Kucuk Harf" yazdiriniz
        // Buyuk harf ise ekrana "Buyuk Harf" yazdiriniz
        // Harf degilse ekrana "Harf degil" yazdiriniz
        //97:a  122:z ascii degeri

        Scanner scan = new Scanner(System.in);
		char karakter = scan.next().charAt(0);
	
		System.out.println("***** Ternary cozumu *****");
		String sonuc =(karakter>='a' && karakter<='z') ? "Kucuk Harf" : (karakter>='A' && karakter<='Z') 
				? "Buyuk Harf" : ("Harf degil");
		System.out.println(sonuc);

       
        System.out.println("***** if cozumu *****");

        if ((karakter <='z' && karakter>='a')||(karakter <='Z' && karakter>='A')) {
            if (karakter <=122 && karakter >=97) {
                System.out.println("kucuk harf");

            }else System.out.println("Buyuk harf");

        }else System.out.println("Harf degil");
        
        scan.close();
    }
}