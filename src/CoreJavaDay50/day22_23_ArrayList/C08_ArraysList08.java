package CoreJavaDay50.day22_23_ArrayList;

import java.util.Arrays;
import java.util.List;

public class C08_ArraysList08 {

	public static void main(String[] args) {
		String arr[] = { "3", "5", "7" };

		List<String> arrList = Arrays.asList(arr);

		System.out.println("List olarak1 " + arrList); // List olarak1 [3, 5, 7]

		arr[1] = "Mehmet";
		// array'in bir elemanini degistirdigimde
		// otomatik olarak list'i de degistiriyor

		System.out.println("List olarak2 " + arrList); // List olarak2 [3, Mehmet, 7]

		arrList.set(0, "Ayse");
		// biz listeden degistirdik ama
		// java array'i de degistiriyor
		

		System.out.println("List :" + arrList); // List :[Ayse, Mehmet, 7]
		System.out.println("Array : " + Arrays.toString(arr)); // Array : [Ayse, Mehmet, 7]

	}

}