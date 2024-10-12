package JavaKonusalSorular.Pratik04_ArtirmaAzaltmaOperatorleri;

public class Pr03 {

    public static void main(String[] args) {

        int sayi1 = 20;

        int sayi2 = ++sayi1;

        System.out.println("pre-increment sayi1 : " + sayi1); // pre-increment sayi1 : 21
        System.out.println("pre-increment sayi2 : " + sayi2); // pre-increment sayi2 : 21

        sayi2 = sayi1++;

        System.out.println("post-increment sayi1 : " + sayi1); // post-increment sayi1 : 22
        System.out.println("post-increment sayi2 : " + sayi2); // post-increment sayi2 : 21

        int sayi3 = 10;

        System.out.println("pre increment : " + ++sayi3); // pre increment : 11

        System.out.println("post increment : " + sayi3++); // post increment : 11

        System.out.println("post increment'tan sonra sayi3 : " + sayi3); // post increment'tan sonra sayi3 : 12

    }

}