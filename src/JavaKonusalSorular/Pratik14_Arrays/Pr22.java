package JavaKonusalSorular.Pratik14_Arrays;

import java.util.Arrays;

public class Pr22 {

	public static void main(String[] args) {
		/*
		 * Congratulations kelimesini Array yontemlirini kullanarak asagidaki outputu
		 * alin.
		 * input : Congratulations
		 * output: [C, o, n, g, r, a, t, u, l, a, t, i, o, n, s]
		 * sniitilitirgniC --> o ,a ve u harfini i ye donusturun.

		 */
		String str = "Congratulations";
		String[] arr = str.split("");
		System.out.println(Arrays.toString(arr)); // [C, o, n, g, r, a, t, u, l, a, t, i, o, n, s]
		// Stringin diziye cevrilmis orjinal hali
		System.out.println();
		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i].equals("o") || arr[i].equals("a") || arr[i].equals("u"))
				arr[i] = "i";
			String yeni = arr[i].replaceAll(",", "");
			// parantez i�inde yazan regex ve replacement diye ifadeleri
			// intelliJ parogram� anla��ls�n diye otomatik olarak kendisi yaz�yor.
			System.out.print(yeni);
		}
		System.out.println();
		
		
		
	}

}
