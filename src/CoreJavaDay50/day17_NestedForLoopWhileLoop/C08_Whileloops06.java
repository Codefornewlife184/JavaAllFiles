package CoreJavaDay50.day17_NestedForLoopWhileLoop;
import java.util.Scanner;
public class C08_Whileloops06 {

	public static void main(String[] args) {
		// yildizlarla eskenar ucgen olusturma
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen bir rakam giriniz");
		
		int rakam = scan.nextInt();

		gunterMethodu(rakam);

		scan.close();
	}

	public static void gunterMethodu(int rakam) {
		int m = 1;
		String sekil = "* ";
		String sekil2 = " ";

		for (int i = 1; i <= rakam; i++) {
			for (int j = 1; j <= rakam - i; j++) {
				System.out.print(sekil2);
			}
			for (int k = 1; k <= m; k++) {
				System.out.print(sekil);
			}
			m += 1;

			System.out.println("");
		}
	}
}