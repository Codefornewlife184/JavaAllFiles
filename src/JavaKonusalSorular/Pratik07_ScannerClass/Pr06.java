package JavaKonusalSorular.Pratik07_ScannerClass;

import java.util.Scanner;

public class Pr06 {

    public static void main(String[] args) {

    /*  Problem Tanımı
        Bir dikdortgenin iki dik kenarini alarak hipotenusunu hesaplayan kod yaziniz.

        Ornek Ekran Ciktisi ;
        birinci kenar: 12
        ikinci kenar: 5
        hipotenus: 13.0
    */


        Scanner scanner = new Scanner(System.in);

        System.out.print("Dikdortgenin a kenar uzunlugunu giriniz: ");
        int a = scanner.nextInt();

        System.out.print("Dikdortgenin b kenar uzunlugunu giriniz: ");
        int b = scanner.nextInt();

        double h = (((a * a) + (b * b)));
        System.out.println("Hipotenus: " + Math.sqrt(h));
        
        scanner.close();


    }
}
