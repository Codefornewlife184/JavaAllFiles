package JavaKonusalSorular.Pratik16_Constructors.Pr02;

public class Rope {

	// Constructors konusu tek class ta işlenecek..

	public static void swing() {

		System.out.println("swing ");
	}

	public void climb() {

		System.out.println("climb ");
	}

	public static void play() {
		swing(); // swing metoduna gidip sys yi yazdırdı.
		// climb(); // static olmadığından CTE arızası vereceği için yorum satırı olarak bıraktık.
	}

	@SuppressWarnings("static-access")
	public static void main(String[] args) {

		Rope rope = new Rope();
		rope.play(); // play metoduna gidip yine swing yazdırdı.
		Rope rope2 = null;
		rope2.play(); // play metoduna gidip yine swing yazdırdı.
	}
}

