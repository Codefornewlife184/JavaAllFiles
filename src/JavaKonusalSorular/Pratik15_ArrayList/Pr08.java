package JavaKonusalSorular.Pratik15_ArrayList;
import java.util.ArrayList;
import java.util.List;
public class Pr08 {

    public static void main(String[] args) {
        /*
         * Input olarak verilen listteki isimlerden
         * icinde ‘a’ harfi bulunanlari silen bir program yaziniz

         * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
         * OUTPUT : [Veli,Omer]
         */

        List<String> list1 = new ArrayList<>();

        list1.add("Ali");
        list1.add("Veli");
        list1.add("Ayse");
        list1.add("Fatma");
        list1.add("Omer");

        /* List<String> list3 = new ArrayList<>(Arrays.asList("Ali","Veli","Ayse","Fatma","Omer"));
        Bu şekilde de yazabilirdik. Ama biz add metodu ile tekl tek ekledik.     */

        List<String> list2 = new ArrayList<>();

        for (String w : list1) {

            if (w.toLowerCase().contains("a")) {
                continue;
            }else list2.add(w);
        }
        System.out.println(list2);
    }


}
