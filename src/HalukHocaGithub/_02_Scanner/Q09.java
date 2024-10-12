package HalukHocaGithub._02_Scanner;

import java.util.Scanner;

public class Q09 {

    public static void main(String[] args) {

    /*  Problem Tanimi ;
        Kullanicidan a,b ve c sayilarini okuyarak asagidaki islemi yapan kodu yaziniz
        a'nin karesinden b'nin karesini cikarip c nin 3 katina bolunuz...

        Ornek Ekran Ciktisi ;
        a sayisini giriniz: 5
        b sayisini giriniz: 3
        c sayisini giriniz: 1
        sonuc : 5.333333333333333
        */

        Scanner scan = new Scanner(System.in);

        System.out.print("a: ");
        double a = scan.nextDouble();

        System.out.print("b: ");
        double b = scan.nextDouble();

        System.out.print("c: ");
        double c = scan.nextDouble();

        double toplam = ((a * a) - (b * b)) / (3 * c);
        System.out.println("Sonuc: " + toplam);
        
        scan.close();
    }
}
