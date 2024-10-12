package HalukHocaGithub._02_Scanner;

import java.util.Scanner;

public class Q06 {

    public static void main(String[] args) {

    /*  Problem Tanimi ;
        Mesafeyi ve hizi alip hesaplayan bir kod yaziniz.
        Ornegin : Istanbul ile Ankara arasi 400km olarak hesap edilmektedir.
        Bu yolu ortalama 120 km/saat hizla giden bir arac ne kadar surede hedefe varir?

        Ekran ciktisi ;
        Mesafeyi giriniz: 400
        Hizi giriniz: 100
        Sure 4 saattir.
     */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Gideceginiz yol mesafesi(km): ");
        double yol = scanner.nextDouble();

        System.out.print("Ortalama Hiziniz(km/sa): ");
        double ort_hiz = scanner.nextDouble();

        double varis_suresi = yol / ort_hiz;
        System.out.print("Varis suresi : " + varis_suresi + " saat");


        scanner.close();

    }
}
