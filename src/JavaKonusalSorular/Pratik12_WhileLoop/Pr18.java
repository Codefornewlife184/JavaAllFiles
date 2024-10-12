package JavaKonusalSorular.Pratik12_WhileLoop;

import java.util.Scanner;

public class Pr18 {

    public static void main(String[] args) {
         /*
         Girilen bir sayıya kadar olan sayılardan sadece tek olanlarını
         ve en sonda toplamını ekrana yazdırınız.
         tric: girilen sayı dahil
        */

        Scanner scan = new Scanner(System.in);
        System.out.print("sayı giriniz =");
        int sayi=scan.nextInt(); //5

        //sayi--; bu şekilde sayının kendisi işleme girmez

        int toplam=0;
        while(sayi>0)
        {
            if (sayi%2==1)
                System.out.print(sayi+", ");
                toplam+=sayi;

            sayi--; // 5 4 3 2 1
        } System.out.println("\n"+toplam);
    }
}
