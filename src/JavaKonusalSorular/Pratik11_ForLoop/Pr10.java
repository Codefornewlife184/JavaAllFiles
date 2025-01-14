package JavaKonusalSorular.Pratik11_ForLoop;
public class Pr10 {

	public static void main(String[] args) {
		/* Konsolda Alfabeyi Yazdran programi yaziniz.
		 * OUTPUT :
		 * a b c .. .. .. .. y z
		 */

		// For dongusu ile
		char i;
		for (i = 'a'; i <= 'z'; i++)
			System.out.print(i + " ");

		System.out.println("");

		// While dongusu ile
		char j = 'a';
		while (j <= 'z') {
			System.out.print(j + " ");
			j++;
		}

		System.out.println("");

		// DoWhile dongusu ile
		char k = 'a';

		do {
			System.out.print(k + " ");
			k++;
		} while (k <= 'z');

	}
}
