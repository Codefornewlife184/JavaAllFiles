package JavaKonusalSorular.Pratik14_Arrays;
import java.util.Arrays;

public class Pr01 {
	public static void main(String[] args) {
	
		short arr1[] = new short[5];
		System.out.println(arr1); // [S@182decdb hata verip yazdirmadi.
		
		// arr1 bir array, data turu non-primitive
		// short array'in degil icine koyacagimiz degerlerin data turu
		// eger non-primitive bir datayi direk syso ile yazdirmaya calisrsaniz
		// java arr1'in referans bilgisini yazdirir...


		// Soru : Elemanlari "Ali" , "Veli", "Ayse" ve "Fatma" olan bir array olusturun
		// ve bu array i yazdirin.

		// 1.yontem ; once olusturup, sonra istedigim indexlere deger atiyorum
		String isimler[] = new String[4];

		isimler[0] = "Ali";
		isimler[1] = "Veli";
		isimler[2] = "Ayse";
		isimler[3] = "Fatma";

		System.out.println(Arrays.toString(isimler));
	
		// 2.yontem, hem olusturup, hem de tum indexlere deger atiyorum
		String isimler2[] = { "Ali", "Veli", "Ayse", "Fatma" , "Mehmet"};
		System.out.println(Arrays.toString(isimler2));
		// isimler array'indeki veli yerine Hasan yazalim

		isimler[1] = "Hasan";
		// isimler[5]="Hakan"; // java 5.index var mi yok mu bilmiyor.
		// syntax acisindan sorun olmadigi icin CTE vermiyor
		// ama run ettigimizde 5.index'i bulamadigi icin RTE verir...

		System.out.println(isimler.length); // 4
		System.out.println(isimler[3]); // Fatma
		System.out.println(isimler[1]); // Hasan

		// tum elemanlari yazdirma
		// 1.yol loop kullanma
		// sadece degerleri yazdirmis oluruz

		for (int i = 0; i < isimler2.length; i++) {
			System.out.print(isimler2[i] + " ");
		}
		System.out.println("");

		// 2.yol Arrays class'indan yardim aliriz
		System.out.println(Arrays.toString(isimler));

	}
}










