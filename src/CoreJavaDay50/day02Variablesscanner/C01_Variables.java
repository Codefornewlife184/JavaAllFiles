package CoreJavaDay50.day02Variablesscanner;

public class C01_Variables {
	public static void main(String[] args) {

		int sayi1 = 10;
		int sayi2 = 20;

		sayi1 -= 5; // 5
		sayi2 += 10; // 30
		System.out.println("12. satırdaki Sayı2 / Sayı1 : " + sayi2 / sayi1); // 30/5=6

		sayi1 *= 2; // sayi1 5 olmuştu. 5*2=10
		sayi2++; // 30 (Bir sonraki işlemde artı 1 eklenecek...)
		System.out.println("Sayı2 / Sayı1 : " + sayi2 / sayi1); // 30/10=3

		sayi1 /= 2; // sayi1 i 2 ye böl diyor.

		double sayi3 = sayi2 / 10; // sayi3 ü sayi2/10 ile yani 30/10 ile işlem yaparak 3 buluyor.
		// double tipinde olduüu için aşağıda yazdırdığımızda cevap 3.0 olarak gelecek.

		System.out.println("Double sayi3 : "+ sayi3); // 3.0
		System.out.println("Sayı1 ile Sayı2 nin çarpımı : " + sayi1 * sayi2); // 155
		System.out.println("Sayı1 ile Sayı3 ün çarpımı : " +sayi1 * sayi3); // 15.0

		sayi3 = (double) sayi2 / 10;

		System.out.println("Cast yapılan sayi3 : "+ sayi3);
		System.out.println("Sayi2 : "+sayi2); // 31
		System.out.println("Double ile Cast yapılan sayi2"+ (double) sayi2); // 31.0

		sayi2 += 0.2; // sayi2 ye 0.2 eklendi.
		System.out.println("Son sayi2 : "+sayi2); // 31 int tipinde olduğu için 31 e yuvarladı.
	}
}