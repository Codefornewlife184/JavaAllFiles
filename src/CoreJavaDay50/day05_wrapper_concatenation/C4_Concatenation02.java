package CoreJavaDay50.day05_wrapper_concatenation;

public class C4_Concatenation02 {

	public static void main(String[] args) {

		int sayi = 7;
		char ilkHarf = 'a';
		String str = "Java";

		System.out.println("Birincisi : "+sayi + str + ilkHarf); // 7Javaaa
		// ascii burada devreye girmez string ile toplama yapinca concata cevirir.

		System.out.println("İkincisi : "+sayi + ilkHarf + str);
		//  char bir degisken matematiksel islemde kullanilirsa ascii devreye girer

		// 7a yazdirin

		System.out.println("Üçüncüsü : "+"" + sayi + ilkHarf); // 7a
	}

}