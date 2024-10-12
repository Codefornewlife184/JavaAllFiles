package HalukHocaGithub._02_Scanner;

import java.util.Scanner;

public class Q01 {

    public static void main(String[] args) {
    	/*
    	 * kullanicinin ad soyad yas boy kilosunu  yazdiriniz
    	 */

        Scanner scan = new Scanner(System.in);

        String name, surname;

        
        int age, kilo;
        double boy;

        System.out.print("Adinizi girin: ");
        name = scan.nextLine();

        System.out.print("Soyadinizi girin: ");
        surname = scan.nextLine();

        System.out.print("Yasinizi girin: ");
        age = scan.nextInt();

        System.out.print("Boyunuzu girin: ");
        boy = scan.nextDouble();
        

        System.out.print("Kilonuzu giriniz: ");
        kilo = scan.nextInt();

        System.out.println("Benim adim : " + name  +"\n"+ "Soyadim : " +surname +"\n"+ "Yasim : " + age +
                "\n"+"boyum : " + boy +"\n"+"kilom : " + kilo );
scan.close();
    }
}
