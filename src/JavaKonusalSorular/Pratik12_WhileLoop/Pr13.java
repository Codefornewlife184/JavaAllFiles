package JavaKonusalSorular.Pratik12_WhileLoop;
import java.util.Scanner;
public class Pr13 {

    /* Kullanıcıdan alınan bir sayinin basamak degerlerinin toplamini
    while loop ile hesaplayan bbir method yazınız.
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz : ");
        int sayi = scan.nextInt();

        basamakToplaWhile(sayi);

    }

    public static int basamakToplaWhile(int sayi) {

        int toplam = 0;
        while (sayi !=0) {

            toplam += sayi % 10;
            sayi /= 10;

        }
		System.out.println("Girilen sayinin basamak toplami While cozumu = "+toplam);
        return toplam;

    }


}
