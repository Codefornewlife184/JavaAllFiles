package JavaKonusalSorular.Pratik16_Constructors.Pr09;

public class MultilevelB extends MultilevelA {
	
	public void canCook() {
		System.out.println("parent they have a special recipe");
	}
	
	//printF which is static and
	 // call or reuse that method into class B

	public static void main(String[]args) {
		printF(); // MultilevelA daki metoda gider ve çalýþtýrýr.
		// This is static method -- bunu yazdýrýr...
	}
}
