package JavaKonusalSorular.Pratik13_DoWhileLoop;

import java.util.Scanner;

public class Pr19 {
    public static void main(String[] args) {

        // TODO STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız.

     String pin_sys = "Hu.180884";

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen Pin kodunuzu giriniz: ");
        String pin = scan.nextLine();


        int kalanHak = 3;

        do {

            if (pin_sys.equals(pin)){
                System.out.println("Başarı ile giriş yaptınız...");
                break;
            }
            else {
                System.out.println("Yanlış pin kodu girdiniz...");
                kalanHak--;
                System.out.println("Kalan hakkınız: " + kalanHak);
            }

    }while (kalanHak > 0);
        if (kalanHak == 0)
        System.out.println("Giriş hakkınız bitti...");

    }


}
