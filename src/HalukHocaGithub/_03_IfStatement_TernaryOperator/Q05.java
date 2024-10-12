package HalukHocaGithub._03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q05 {

	public static void main(String[] args) {
		// Kullanicidan  yasini ve kilosunu alalim
		// 18 yasindan kucuk ise kan bagisi yapamaz
		// 18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
		// 18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.

		Scanner sc = new Scanner(System.in);

		System.out.print("Luften yasinizi giriniz : ");
		int yas = sc.nextInt();
		System.out.print("lutfen kilonuzu giriniz : ");
		int kilo = sc.nextInt();


		if ( yas>0 && yas < 18) {
			System.out.println("Yasi 18 den kcukk olanlar kan bagisi yapamaz");
		} else if (yas >= 18) {
			if (kilo > 0 && kilo < 50) {
				System.out.println("Kilonuz 50 den kucuk oldugu icin kan bagisi yapamazsiniz");
			} else if (kilo >= 50) {
				System.out.println("Kan bagisi yapabilirsiniz");
			} else {
				System.out.println("Yalniz bir deger girdiniz");
			}
		} else {
			System.out.println("Yalniz bir deger girdiniz");
		}

		sc.close();
	}

}