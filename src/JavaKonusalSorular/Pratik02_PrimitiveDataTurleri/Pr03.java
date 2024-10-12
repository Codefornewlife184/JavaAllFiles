package JavaKonusalSorular.Pratik02_PrimitiveDataTurleri;

public class Pr03 {

    static byte sayi1;
    static short sayi2;
    static int sayi3;
    static long sayi4;
    static float sayi5;
    static double sayi6;
    static boolean dogruMu;
    static char karakter;

    public static void main(String[] args) {


      /*
        Primitive data turlerinin default degerlerini yazdiriniz...

        */

        // default degerleri yazdirabilmenin yegane yolu static olarak main üstünde
        // class seviyesinde yazdirmaktir...

        System.out.println(sayi1); // 0
        System.out.println(sayi2); // 0
        System.out.println(sayi3); // 0
        System.out.println(sayi4); // 0
        System.out.println(sayi5); // 0.0
        System.out.println(sayi6); // 0.0
        System.out.println(dogruMu); // false
        System.out.println(karakter); // ""
}
}