package ReplitGithub;

import java.util.Arrays;

public class RG51_ArrayElemanlariniTekTekYazma {

    public static void main(String[] args) {

    /*51-----
    Bir ArrayList oluşturun ve array elemanlarını tek tek yazdırın.

    Array elemanları:  siyah,sari,mavi,turuncu

    Beklenen Çıktı:
    siyah
    sari
    mavi
    turuncu
    */

        String[] strArray = new String[]{"siyah", "sari", "mavi", "turuncu"};
        System.out.print(Arrays.toString(strArray));

        System.out.println();

        for (String element : strArray) {
            System.out.println(element);

        }
    }
}
