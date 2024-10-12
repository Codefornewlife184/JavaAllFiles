package CoreJavaDay50.day05_wrapper_concatenation;
public class C2_Concatenation {

	public static void main(String[] args) {

		String str1 = "Hello";
		String str2 = "World";
		int sayi1 = 3;
		int sayi2 = 4;

		// Hello yazdirin
		System.out.println("Hello : "+str1); // Hello : Hello
		
		// Hello1 yazdirin
		System.out.println("Hello1 : "+str1 + (sayi2 - sayi1)); // Hello1 : Hello1

		// Hello 5 World yazdirin
		System.out.println("Hello 5 World : "+str1 + " " + ++sayi2 + " " + str2); // Hello 5 World : Hello 5 World
		// sayi2 4 oldugu icin 1 artirdik.

		// Hello34 yazdirin
		System.out.println("Hello34 : "+str1 + " " + sayi1 + --sayi2); // Hello34 : Hello 34
		// --sayi2 deme nedenimiz yukarida artirdigi icin 1 dondurmus olduk ki 34 bulabilelim

		// 7World yazdirin
		System.out.println("7World : "+(sayi1 + sayi2) + str2); // 7World : 7World

		// 34 yazdirin
		System.out.println("34 : "+sayi1 + "" + sayi2); // 34 : 34
		// " " isaretleri arasina bosluk birakmazsan yanyana yazar.. yoksa 3 4 seklinde yazar..
		// data turu string dir.

		// int i String e cevirmek icin method a ihtiyac yok ama istersek kullanabiliriz.
		
		String intCevrilen= ""+sayi1; // bu yontem method kullanmadan int'i String'e cevirir
		System.out.println("Çevrilen : "+intCevrilen); // Çevrilen : 3
		// 34. satırdaki "" bu isaret stringtir ve toplar 3 cevabini verir..
	} }

