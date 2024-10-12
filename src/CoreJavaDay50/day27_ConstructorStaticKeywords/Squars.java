package CoreJavaDay50.day27_ConstructorStaticKeywords;

public class Squars {

	public static long square(int x) {

		long y = x * (long) x;

		return y;

	}

	public static void main(String[] args) {

		int value = 9; // x e 9 atanmýþ oluyor.

		long result = square(value);
		System.out.println(result); // 81 yani y deðeri 9*9=81 oluyor ve return ediyor.
		System.out.println(value); // 9

	}
}
