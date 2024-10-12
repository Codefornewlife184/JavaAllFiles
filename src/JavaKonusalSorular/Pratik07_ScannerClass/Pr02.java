package JavaKonusalSorular.Pratik07_ScannerClass;
import java.util.Scanner;
public class Pr02 {

    public static void main(String[] args) {
    	/* Kullanicinin ad soyad yas boy kilosunu  yazdiriniz */

        Scanner scan = new Scanner(System.in);
        String name, surname;
        
        int age, kilo; // boþ atadýk ki kullanýcý bu deðerleri girmiþ olsun.
        double boy; // // boþ atadýk ki kullanýcý bu deðerleri girmiþ olsun.

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

        System.out.print("****************************\n"); // kozmetik ile aþaðý satýra indirdim.
        System.out.println("Benim adim : " + name  +"\n"+ "Soyadim : " +surname +"\n"+ "Yasim : " + age +
                "\n"+"boyum : " + boy +"\n"+"kilom : " + kilo );
        // Hepsini alt alta yazdýrdýk \n sayesinde...
        scan.close();
    }
}
