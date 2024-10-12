package CoreJavaDay50.day05_wrapper_concatenation;

public class C3_Concatenation01 {

	public static void main(String[] args) {

		String str1 = "Java";
		String str2 = "Guzel";
		int sayi1 = 5;
		int sayi2 = 4;

		// Java Guzel 54 yazdirin
		System.out.println("Birincisi : "+str1 + " " + str2 + " " +sayi1+sayi2); // Birincisi : Java Guzel 54
		
		// Java 5 Guzel
		System.out.println("İkincisi : "+str1 + " " +sayi1+ " "+str2); // İkincisi : Java 5 Guzel

		// Java 94
		System.out.println("Üçüncüsü : "+str1 + " " + (sayi1+sayi2) + sayi2); // Üçüncüsü : Java 94

		// Java 19
		System.out.println("Dördüncüsü : "+str1 + " " + (sayi1-sayi2) + (sayi1+sayi2)); // Dördüncüsü : Java 19
		
		
		String intdanCevrilen= ""+sayi1; // bu yontem method kullanmadan int'i String'e cevirir
		System.out.println("Çevrilen : "+intdanCevrilen); // Çevrilen : 5
		// "" bu isaret stringtir ve toplar 5 cevabini verir..

	}

}
