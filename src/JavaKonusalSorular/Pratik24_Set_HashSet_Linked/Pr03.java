package JavaKonusalSorular.Pratik24_Set_HashSet_Linked;

import java.util.LinkedList;

public class Pr03 {

	public static void main(String[] args) {


		LinkedList<String> ll1 = new LinkedList();

		ll1.add("A");
		ll1.add("B");
		ll1.add("C");
		System.out.println(ll1); // [A, B, C]
		
		ll1.remove();
		System.out.println(ll1); // [B, C]
		
		ll1.remove(1); // indexteki elemani siler...
		System.out.println(ll1); // [B]

		ll1.remove("B");
		System.out.println(ll1); // []

	}

}
