package CoreJavaDay50.day19_Arrays;
import java.util.Arrays;
public class C01_Arrays01 {
	public static void main(String[] args) {

		// Soru 1: Elemanlari "Ali" , "Veli", "Ayse" ve "Fatma" olan bir array olusturun ve bu array i yazdirin.
		// 1.yontem once olusturup, sonra istedigim indexlere deger atiyorum
		
		String isimler[] = new String[4];
		// 4 elemenlı bir string dizisi.. Her indise bir isim atıyoruz.
		isimler[0] = "Ali";
		isimler[1] = "Veli";
		isimler[2] = "Ayse";
		isimler[3] = "Fatma";
		System.out.println(Arrays.toString(isimler)); // [Ali, Veli, Ayse, Fatma]

		// 2.yontem, hem olusturup, hem de tum indexlere deger atiyorum
		String isimler2[] = { "Ali", "Veli", "Ayse", "Fatma" , "Hayriye"};

		System.out.println(Arrays.toString(isimler2));// [Ali, Veli, Ayse, Fatma, Hayriye]

		// isimler array'indeki veli yerine Hasan yazalim
		isimler[1] = "Hasan";

		System.out.println(isimler.length); // 4
		System.out.println(isimler[3]); // Fatma
		System.out.println(isimler[1]); // Hasan

		// tum elemanlari yazdirmak istersek for ile

		for (int i = 0; i < isimler2.length; i++) {
			System.out.print(isimler2[i] + " "); // döngü ile Ali Veli Ayse Fatma Hayriye yazdrdı
		}
		System.out.println(""); // aşağı atmak için kullandık...

		// 2.yol Arrays class'indan yardim aliriz
		System.out.println(Arrays.toString(isimler)); // [Ali, Hasan, Ayse, Fatma]
	} }