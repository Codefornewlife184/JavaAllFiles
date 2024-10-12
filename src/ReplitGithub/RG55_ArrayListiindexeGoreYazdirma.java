package ReplitGithub;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class RG55_ArrayListiindexeGoreYazdirma {

    public static void main(String[] args) {

    /*55-----
    Bir ArrayList oluşturum ve önce ArrayListi yazdıralım
    sonra index numarasına göre tek tek yazdıralım.

    ArrayList: siyah,mavi, kirmizi,yesil,mor,turuncu

    Beklenen Çıktı:

    Orjinal array list: [siyah,mavi,kirmizi,yesil,mor,turuncu]
    siyah
    mavi
    kirmizi
    yesil
    mor
    turuncu
    */

        List<String> list = new ArrayList<>();

        list.add("siyah");
        list.add("mavi");
        list.add("kirmizi");
        list.add("yesil");
        list.add("mor");
        list.add("turuncu");

        System.out.println(list);

        for (String each : list) {
            System.out.println(each);

        }


    }
}
