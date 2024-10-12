package HalukHocaGithub._02_Scanner;

import java.util.Scanner;

public class Q12 {

    public static void main(String[] args) {

    /*  Problem Tanimi ;
     * 
        Bir iscinin isi bitirme suresini ve toplam isci sayisini alarak, 
        isin bitme suresini hesaplayan kodu yaziniz.
        
        Ornegin, Bir isi bir isci 10 gunde yapabilmektedir.
        Buna gore 2 isci ayni isi kac gunde yapar?

      Ekran Ciktisi ;
      
         Bir isci isi kac gunde bitirmektedir? 10
         Toplam kac isci calisacak? 2
         Isin bitme suresi 5 gundur.
    */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir isi isci kac gunde bitirmektedir: ");
        int bir_isci_bitirme_suresi = scanner.nextInt();

        System.out.print("Toplam kac isci calisacak: ");
        int isci_sayisi = scanner.nextInt();

        int coklu_bitirme_suresi = bir_isci_bitirme_suresi / isci_sayisi;
        System.out.println("isin bitme suresi: " + coklu_bitirme_suresi);
        
        scanner.close();
        


    }
}
