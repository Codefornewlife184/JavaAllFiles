package JavaKonusalSorular.Pratik20_Exceptions;
import java.util.Scanner;
public class Pr20 {

	public static void main(String[] args) {
		// Soru: Kullanicidan yasini girmesini isteyin. Kodunuzu kullanici sifirdan
		// kucuk bir sayi girerse Exception verecek sekilde yazin.

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen yasinizi griniz");

		int yas = scan.nextInt();

		try {
			if (yas >= 0) {
				System.out.println("Girdiginiz yas : " + yas);
			} else {
				throw new IllegalArgumentException();
			}
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}

		// sart saglanmazsa kod bloke oluyor. kod bloke olmasin istiyorum

		// bunu engellmenin yolu try catch olusturmak...

		System.out.println("devam ediyor...");
		scan.close();

	}

}
