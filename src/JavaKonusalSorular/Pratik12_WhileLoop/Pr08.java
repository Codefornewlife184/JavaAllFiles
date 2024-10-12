package JavaKonusalSorular.Pratik12_WhileLoop;

import java.util.Scanner;

public class Pr08 {

    public static void main(String[] args) {

        // Kullanıcıdan alınan bir stringdeki indexi tek  olan karakterleri yazdiriniz.

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir metin giriniz : ");
        String str = scan.nextLine();

        int i = 0;
        do {
            if (i % 2 == 1) {
                System.out.print(str.charAt(i)+" ");
            }
            i++;
        } while (i < str.length());


    }
}
