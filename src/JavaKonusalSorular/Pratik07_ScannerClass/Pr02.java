package JavaKonusalSorular.Pratik07_ScannerClass;
import java.util.Scanner;
public class Pr02 {

    public static void main(String[] args) {
    	/* Kullanicinin ad soyad yas boy kilosunu  yazdiriniz */

        Scanner scan = new Scanner(System.in);
        String name, surname;
        
        int age, kilo; // bo� atad�k ki kullan�c� bu de�erleri girmi� olsun.
        double boy; // // bo� atad�k ki kullan�c� bu de�erleri girmi� olsun.

        System.out.print("Adinizi girin: "); // Adinizi girin: Mehmet
        name = scan.nextLine();

        System.out.print("Soyadinizi girin: "); // Soyadinizi girin: Bilge
        surname = scan.nextLine();

        System.out.print("Yasinizi girin: "); // Yasinizi girin: 35
        age = scan.nextInt();

        System.out.print("Boyunuzu girin: "); // Boyunuzu girin: 1,85
        boy = scan.nextDouble();

        System.out.print("Kilonuzu giriniz: "); // Kilonuzu giriniz: 75
        kilo = scan.nextInt();

        System.out.print("****************************\n"); // kozmetik ile a�a�� sat�ra indirdim.
        System.out.println("Benim adim : " + name  +"\n"+ "Soyadim : " +surname +"\n"+ "Yasim : " + age +
                "\n"+"boyum : " + boy +"\n"+"kilom : " + kilo );
        // Hepsini alt alta yazd�rd�k \n sayesinde...
        scan.close();
    }
}
