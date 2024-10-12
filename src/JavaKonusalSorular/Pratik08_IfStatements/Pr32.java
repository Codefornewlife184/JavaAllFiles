package JavaKonusalSorular.Pratik08_IfStatements;

import java.util.Random;

public class Pr32 {

    public static void main(String[] args) {

        /* Rastgele sayi secelim... 0-100 arasında olsun...

        sayi 0*25 arasinda ise 0-25 araligindadir yazdirsin...
        sayi 25*50 arasinda ise 25-50  araligindadir yazdirsin...
        sayi 50-100 arasinda ise 50-100 araligindadir yazdirsin...

        */

        Random rastgele = new Random();

        int sayi = rastgele.nextInt(101); // bunu yaparak kendisi random 78 i seçti.

        System.out.println(sayi);

        if (sayi<=25){
            System.out.println("0-25 araligindadir");
        } else if (sayi>=25 && sayi<=50){
            System.out.println("50-25 araligindadir");
        }else if (sayi>=50){
            System.out.println("50-100 araligindadir");
        }


    }
}
