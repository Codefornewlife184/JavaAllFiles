package JavaKonusalSorular.Pratik04_ArtirmaAzaltmaOperatorleri;
public class Pr02 {

    public static void main(String[] args) {

        int sayi1 = 10;
        int sayi2 = 20;

        sayi1 -= 5; // 5
        sayi2 += 10; // 30
        System.out.println("12. sat�rdaki Say�2 / Say�1 : " + sayi2 / sayi1); // 30/5=6

        sayi1 *= 2; // sayi1 5 olmu�tu. 5*2=10
        sayi2++; // 30 (Bir sonraki i�lemde art� 1 eklenecek...)
        System.out.println("Say�2 / Say�1 : " + sayi2 / sayi1); // 30/10=3

        sayi1 /= 2; // sayi1 i 2 ye b�l diyor.

        double sayi3 = sayi2 / 10; // sayi3 � sayi2/10 ile yani 30/10 ile i�lem yaparak 3 buluyor.
        // double tipinde oldu�u i�in a�a��da yazd�rd���m�zda cevap 3.0 olarak gelecek.

        System.out.println("Double sayi3 : "+ sayi3); // 3.0
        System.out.println("Say�1 ile Say�2 nin �arp�m� : " + sayi1 * sayi2); // 155
        System.out.println("Say�1 ile Say�3 �n �arp�m� : " +sayi1 * sayi3); // 15.0

        sayi3 = (double) sayi2 / 10;

        System.out.println("Cast yap�lan sayi3 : "+ sayi3);
        System.out.println("Sayi2 : "+sayi2); // 31
        System.out.println("Double ile Cast yap�lan sayi2"+ (double) sayi2); // 31.0

        sayi2 += 0.2; // sayi2 ye 0.2 eklendi.
        System.out.println("Son sayi2 : "+sayi2); // 31 int tipinde oldu�u i�in 31 e yuvarlad�.
    }
}