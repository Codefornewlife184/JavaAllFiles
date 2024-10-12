package JavaKonusalSorular.Pratik20_Exceptions;

import java.util.Scanner;

public class Pr25_1 {

	public static void main(String[] args) throws Pr25_2 {

		Scanner scanner = new Scanner(System.in);
		System.out.print("email giriniz : ");

		String email = scanner.nextLine();

		if (email.contains("@gmail.com") || email.contains("@ebikgabik.com")) {
			System.out.println("basarili");

		} else {
			throw new Pr25_2("email adresi uygun degil ...");
		}

		scanner.close();
	}

}