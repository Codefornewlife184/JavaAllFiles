package JavaKonusalSorular.Pratik05_MantiksalveiliskiselOpetaorler;

public class Pr02 {

    public static void main(String[] args) {

        /*
        25 ve 30 sayilarinin birbirine esit olma
        kucuk ya da buyuk olma gibi durumlarini
        iliskisel operator yardimiyla console a yazdiriniz...

        25=30=false
        25>30=false
        25<30=true

        */

        int sayi1=25;
        int sayi2=30;

        boolean esitMi=sayi1==sayi2;
        System.out.println("Eşit mi : "+sayi1 + "=" + sayi2 + "=" + esitMi); // Eşit mi : 25=30=false

        boolean buyukMu=sayi1>sayi2;
        System.out.println("Büyük mü : "+sayi1 + ">" + sayi2 + "=" + buyukMu); // Büyük mü : 25>30=false

        boolean kucukMu=sayi1<sayi2;
        System.out.println("Küçük mü : "+sayi1 + "<" + sayi2 + "=" + kucukMu); // Küçük mü : 25<30=true

    }
}
