package JavaKonusalSorular.Pratik08_IfStatements;

import java.util.Scanner;

public class Pr33 {

    public static void main(String[] args) {
        /*
         Kullanicidan alinan kimlik numarasinin
         dogru olup oladigini kontrol ediniz..

         Kural 1; 0 ile başlayamaz
         Kural 2; Son hane cift olmalidir...
         Kural 3; 11 hane olmalidir..

        */
        Scanner scan = new Scanner(System.in);

        System.out.print("Lütfen TC kimlik numaranizi giriniz : ");
        long tc = scan.nextLong();

        long ilkHane=tc/10000000000l; // ilk hane 0 ile baslayamaz
        boolean uzunlukDogruMu=(""+tc).length()==11; // 11 hane olmali
        int sonRakam=(int) tc%10; // sonu cift olmali

        if (ilkHane !=0 && uzunlukDogruMu==true && sonRakam%2==0) {
            System.out.println("Tebrikler dogru numara...");
        } else if (ilkHane==0) {
            System.out.println("ilk hane 0 olamaz");
        }else  if (uzunlukDogruMu==false ) {
            System.out.println("11 haneden olusmalidir...");
        }else if (sonRakam%2 != 0) {
            System.out.println("son rakam cift olmalidir");


    }
    }
}
