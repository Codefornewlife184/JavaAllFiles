package JavaKonusalSorular.Pratik04_ArtirmaAzaltmaOperatorleri;
public class Pr02 {

    public static void main(String[] args) {

        int sayi1 = 10;
        int sayi2 = 20;

        sayi1 -= 5; // 5
        sayi2 += 10; // 30
        System.out.println("12. satýrdaki Sayý2 / Sayý1 : " + sayi2 / sayi1); // 30/5=6

        sayi1 *= 2; // sayi1 5 olmuþtu. 5*2=10
        sayi2++; // 30 (Bir sonraki iþlemde artý 1 eklenecek...)
        System.out.println("Sayý2 / Sayý1 : " + sayi2 / sayi1); // 30/10=3

        sayi1 /= 2; // sayi1 i 2 ye böl diyor.

        double sayi3 = sayi2 / 10; // sayi3 ü sayi2/10 ile yani 30/10 ile iþlem yaparak 3 buluyor.
        // double tipinde olduüu için aþaðýda yazdýrdýðýmýzda cevap 3.0 olarak gelecek.

        System.out.println("Double sayi3 : "+ sayi3); // 3.0
        System.out.println("Sayý1 ile Sayý2 nin çarpýmý : " + sayi1 * sayi2); // 155
        System.out.println("Sayý1 ile Sayý3 ün çarpýmý : " +sayi1 * sayi3); // 15.0

        sayi3 = (double) sayi2 / 10;

        System.out.println("Cast yapýlan sayi3 : "+ sayi3);
        System.out.println("Sayi2 : "+sayi2); // 31
        System.out.println("Double ile Cast yapýlan sayi2"+ (double) sayi2); // 31.0

        sayi2 += 0.2; // sayi2 ye 0.2 eklendi.
        System.out.println("Son sayi2 : "+sayi2); // 31 int tipinde olduðu için 31 e yuvarladý.
    }
}