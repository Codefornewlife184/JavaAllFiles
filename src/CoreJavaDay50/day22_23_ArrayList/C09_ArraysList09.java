package CoreJavaDay50.day22_23_ArrayList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class C09_ArraysList09 {

	public static void main(String[] args) {

		//Elemanlari A, C, E, ve F olan bir String ArrayList olusturup ekrana yazdiriniz.

				List <String> list1=new ArrayList<>();

				list1.add("A");
				list1.add("C");
				list1.add("E");
				list1.add("F");
				System.out.println(list1); // [A, C, E, F]

				//2) indexsiz add() methodunu kullanarak, B yi ekleyiniz.

				list1.add("B");
				System.out.println(list1); // [A, C, E, F, B]

			//index li add() methodunu kullanarak, L yi 1 numarali index e ekleyiniz.

				list1.add(1,"L");
				System.out.println(list1); // [A, L, C, E, F, B]

			//3) set() methodu kullanarak, E yi D yapiniz.

			    list1.set(3,"D");
			    System.out.println(list1); // [A, L, C, D, F, B]

			//4) remove() methodu kullanarak, F yi siliniz.

			    list1.remove("F");

			    System.out.println(list1); // [A, L, C, D, B]

		    //5) sort() methodu kullanarak, elemanlari alfabetik siraya diziniz.

			   Collections.sort(list1);
			   System.out.println(list1); // [A, B, C, D, L]

			//6) contains() methodu kullanarak, L nin list de var oldugunu ve M nin list de var olmadigini dogrulayiniz.

			  boolean sonuc= list1.contains("L");

			  boolean sonuc1=list1.contains("M");

			 System.out.println(sonuc ? "Listede L elemani var" : "Listede L elemani yok");
			 System.out.println(sonuc1 ? "Listede M elemani var" : "Listede M elemani yok");

			 //7) size() methodu kullanarak, list in kac eleman oldugunu ekrana yazdiriniz.
			 System.out.println(list1.size()); // 5

			 //8) clear() methodu kullanarak, list deki tum elemanlari siliniz.

			 list1.clear();
			 System.out.println(list1); // []

			 //9) isEmpty() methodu kullanarak, list deki tum elemanlarin silindigini dogrulayiniz
			 System.out.println(list1.isEmpty()); // true

			
			}



	}


