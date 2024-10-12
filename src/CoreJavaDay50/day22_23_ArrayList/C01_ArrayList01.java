package CoreJavaDay50.day22_23_ArrayList;
import java.util.ArrayList;
import java.util.List;

public class C01_ArrayList01 {

	public static void main(String[] args) {

		List<String> isimler = new ArrayList<>();

		// add() listenin sonuna ekleme yapar
		isimler.add("Ali");
		System.out.println(isimler); // [Ali]
		isimler.add("Veli");
		isimler.add("Ayse");
		isimler.add("Fatma");
		isimler.add("Ali");

		System.out.println(isimler); // [Ali, Veli, Ayse, Fatma, Ali]

		// ozel bir index'e eklemek isterseniz, o zaman index'li add method'unu kullanmaliyiz

		isimler.add(3, "Nihan");
		System.out.println(isimler); // [Ali, Veli, Ayse, Nihan, Fatma, Ali]
		isimler.add(0, "Mehmet");
		System.out.println(isimler); // [Mehmet, Ali, Veli, Ayse, Nihan, Fatma, Ali]

		List<String> yeniList = new ArrayList<>();

		yeniList.add("Firat");
		System.out.println(yeniList); // [Firat]

		// yeniList'in sonuna isimler listesini eklemek istersek
		yeniList.addAll(isimler);
		System.out.println(yeniList); // [Firat, Mehmet, Ali, Veli, Ayse, Nihan, Fatma, Ali]

	}

}