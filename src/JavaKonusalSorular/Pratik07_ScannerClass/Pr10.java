package JavaKonusalSorular.Pratik07_ScannerClass;

import java.util.Scanner;

public class Pr10 {

    public static void main(String[] args) {

    /*  Problem Tanimi ;
        Kullanicidan a,b ve c sayilarini okuyarak asagidaki islemi yapan kodu yaziniz
        a'nin karesinden b'nin karesini cikarip c nin 3 katina bolunuz...

        Ornek Ekran Ciktisi ;
        a sayisini giriniz: 5
        b sayisini giriniz: 3
        c sayisini giriniz: 1
        sonuc : 5.333333333333333   */

        Scanner scan = new Scanner(System.in);

        System.out.print("a: ");
        double a = scan.nextDouble(); // Klaveyeden 5 deðerini verdik.

        System.out.print("b: ");
        double b = scan.nextDouble(); // Klaveyeden 3 deðerini verdik.

        System.out.print("c: ");
        double c = scan.nextDouble(); // Klaveyeden 1 deðerini verdik.

        double toplam = ((a * a) - (b * b)) / (3 * c);
        System.out.println("Sonuc: " + toplam); // Sonuc: 5.333333333333333

        scan.close();
    }
}
