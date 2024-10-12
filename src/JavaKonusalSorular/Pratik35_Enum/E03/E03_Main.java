package JavaKonusalSorular.Pratik35_Enum.E03;

import java.util.ArrayList;

public class E03_Main {

    public static void main(String[] args) {

    /*
    1- Bir Kitap class'i create ediniz, fields : name ve kategori(Enum)
    2- KitapKategori adında bir enum oluşturunuz:
       Klasik, Roman, Fantezi, Tarih, Ekonomi
    3- 2 kitap tanımlayınız bir ArrayList e atınız.
    4- Bir kategoriye gore listeletiniz.
    */

        // 3. adim 1. kitap tanimlanmasi
        Kitap ktp1 = new Kitap();
        ktp1.name = "Leyla ile Mecnun";
        ktp1.kategori= KitapKategori.ROMAN;
        // ktp1.KitapKategori="Roman";

        // 3. adim 2. kitap tanimlanmasi
        Kitap ktp2 = new Kitap();
        ktp2.name = "Er Meydani";
        ktp2.kategori= KitapKategori.ROMAN;
        //  ktp2.KitapKategori="roman";

        // 3. adim ArrayList e atadık...
        ArrayList<Kitap> kutuphane = new ArrayList<>();
        kutuphane.add(ktp1);
        kutuphane.add(ktp2);

        /* Enum siz yaparsak...

        for (Kitap k: kutuphane) {
          if (k.KitapKategori.equals("roman")) {
            System.out.println(k.name);
            }
        }
        */

        for (Kitap k: kutuphane) {
            if (k.kategori == KitapKategori.ROMAN) {
                System.out.println("Kutuphane Romanlari :"+k.name);
            }
        }

    }
}