package JavaKonusalSorular.Pratik09_Ternary;

import java.util.Scanner;

public class Pr04 {

    public static void main(String[] args) {

        //Kullanicidan bir sayi aliniz
        //Sayi 0 dan buyuk esit ise 10 dan kucuk olup olmadigini kontrol ediniz.
        //10 dan kucuk ise ekrana "Rakam" yazdiriniz degilse "Pozitif Sayi" yazdiriniz.
        //Sayi o dan kucuk ise ekrana "Negatif Sayi" yazdiriniz.

		Scanner scan=new Scanner(System.in);
		int sayi=scan.nextInt();
		
		String sonuc =(sayi>=0) ? (sayi<10 ? "Rakam" : "Pozitif Sayi") : ("Negatif Sayi");
		System.out.println(sonuc);
		
		// if cozumu
		
		if (sayi>=0) {
			if (sayi<10) {
				System.out.println("Rakam");
			}else System.out.println("Pozitif Sayi");
		}else System.out.println("Negatif Sayi");
		
		scan.close();
	}

}