package JavaKonusalSorular.Pratik16_Constructors.Pr06;

public class Squars {

	// Constructors konusu tek class ta i�elenecek.

	public static long square(int x) {

		long y = x * (long) x;

		return y;

	}

	public static void main(String[] args) {

		int value = 9; // x e 9 atanm�� oluyor.

		long result = square(value);
		System.out.println(result); // 81 yani y de�eri 9*9=81 oluyor ve return ediyor.
		System.out.println(value); // 9

	}
}
