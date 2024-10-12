package JavaKonusalSorular.Pratik03_AritmetikOparatorler;

import java.util.Scanner;

public class Pr04 {

    public static void main(String[] args) {
        /*
         * Kullanicidan dikdortgenin kenar uzunluklarini alin ve dikdortgenin alanini ve
         * Cevresini konsola yazdiran bir program yazin.
         *
         * Ornek cikti:
         *
         * Alan: 32
         *
         * Cevre: 24
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen Dikdortgenin kenar uzunluklarini giriniz :");
        int kenar1 = scan.nextInt(); // Buna klavyeden 8 deðeri veriyoruz.
        int kenar2 = scan.nextInt(); // Buna klavyeden 4 deðeri veriyoruz.

        System.out.println("Alan : " + kenar1 * kenar2); // Alan : 32
        System.out.println("Cevre : " + (kenar1 + kenar2) * 2); // Cevre : 24

        scan.close(); // Scanner class ý açýldýðý zaman hangi adla açtý isek o adla kapatmalyýz.
        // Bunu scan adý ile açtýðýmýz için scan.close() metodu ile yapmýþ oluyoruz.

    }

}