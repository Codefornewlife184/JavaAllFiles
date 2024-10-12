package JavaKonusalSorular.Pratik07_ScannerClass;
import java.util.Scanner;
public class Pr12 {

	public static void main(String[] args) {
        /*
        M2 spor salonu icin kullanicidan isim soyisim, yas, kilo, boy,
        salona devam edecegi ay suresini bilgilerini alip 
        aylik $20 olarak toplam ucretini yazdiriniz. */
    	
        Scanner scanner = new Scanner(System.in);
        System.out.println("M2 Salonu'na hosgeldiniz!");

        System.out.print("Isim Soyisim: ");
        String isim = scanner.nextLine();

        System.out.print("Yasiniz: ");
        int yas = scanner.nextInt();

        System.out.print("Kilo: ");
        double kilo = scanner.nextDouble();

        System.out.print("Boy: ");
        double boy = scanner.nextDouble();

        System.out.print("Kac aylik kaydolacaksiniz: ");
        int aylik = scanner.nextInt();

        int aylik_ucret = 20;
        int toplam_tutar = aylik_ucret * aylik;

        System.out.print("Toplam Tutar: " + toplam_tutar + " Euro");
        
        scanner.close();
    } }
