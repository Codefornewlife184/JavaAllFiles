package JavaKonusalSorular.Pratik12_WhileLoop;
import java.util.Scanner;
public class Pr09 {
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

	public static void tayfurMethodu(int rakam) {
		for (int i = 1; i <= rakam; i++) {
			for (int j = i; j <= rakam; j++) { // burasi ile yildizlarin onundeki bosluklu alani azaltarak olusturduk
				System.out.print(" "); // bitisi rakam ile sabit tuttuk baslangici yukselterek aradaki dongu sayisini
										// azaltik

			}
			for (int a = 1; a <= i; a++) { // her satira kac yildiz koyacagimizi i ile kontrol ettik
				System.out.print("*"); // i=1 iken bitis de bire esitledik bir yildiz yazdirdi
				System.out.print(" "); // yildizlar arasinda bosluk biraktik
			}
			System.out.println(" ");// ilk forun her dongusunde alt satira gecmesi icin yaptik
		}
	}

	public static void onurMethodu(int rakam) {
		String a = "";

		for (int i = 0; i < rakam; i++) {

			for (int j = 0; j < rakam - i; j++) {
				System.out.print(" ");

			}
			a += "* ";
			System.out.println(a);

		}
	}

}