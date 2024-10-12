package CoreJavaDay50.day22_23_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C03_ArrayList03 {

	public static void main(String[] args) {
		List <String> isimler = new ArrayList<>();
		
		isimler.add("Ali");
		isimler.add("Ayse");
		isimler.add("Hasan");
		
		isimler.set(1, "Fatma"); // 1. indsteki ayşe yi fatma ile değiştirme metodu.
		System.out.println(isimler); // [Ali, Fatma, Hasan]
		
		isimler.set(2, "Mehmet");
														
		// delil olarak eski elementi getirir

		System.out.println(isimler); // [Ali, Fatma, Mehmet]
		
		
	}

}