package JavaKonusalSorular.Pratik07_ScannerClass;
import java.util.Scanner;
public class Pr13 {

    public static void main(String[] args) {
    /*  Problem Tanimi ;
        Bir iscinin isi bitirme suresini ve toplam isci sayisini alarak, 
        isin bitme suresini hesaplayan kodu yaziniz.
        
        Ornegin, Bir isi bir isci 10 gunde yapabilmektedir.
        Buna gore 2 isci ayni isi kac gunde yapar?

      Ekran Ciktisi ;
      
         Bir isci isi kac gunde bitirmektedir? 12
         Toplam kac isci calisacak? 3
         Isin bitme suresi 4 gundur.
    */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir isi isci kac gunde bitirmektedir: ");
        int bir_isci_bitirme_suresi = scanner.nextInt(); // Klavyeden 12 değerini verdik.

        System.out.print("Toplam kac isci calisacak: ");
        int isci_sayisi = scanner.nextInt();  // Klavyeden 3 değerini verdik.

        int coklu_bitirme_suresi = bir_isci_bitirme_suresi / isci_sayisi; // Formül
        System.out.println("İsin bitme suresi: " + coklu_bitirme_suresi); // İsin bitme suresi: 4
        
        scanner.close();

    }
}
