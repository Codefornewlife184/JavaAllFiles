package JavaKonusalSorular.Pratik16_Constructors.Pr09;
import HalukHocaGithub._11_Constructor.MultilevelB;
import HalukHocaGithub._11_Constructor.MultilevelC;
public class MultilevelA {
	// Constructors konusu 3 class ta i�elenecek.
	public String eyeColor="black";
	String language="Turkish";
	String hairColor="brown";

	public void run() {
		System.out.println("they can run fast");
	}
	/* Write program to inherit class A that has method printF which is static and
	 * call or reuse that method into class B  */
	public static void printF() {
		System.out.println("This is static method");
	}
	public static void main(String[] args) {

		HalukHocaGithub._11_Constructor.MultilevelB parent=new MultilevelB();
		System.out.println(parent.eyeColor); // black
		System.out.println(parent.hairColor); // brown
		System.out.println(parent.language); // Turkish

		parent.run(); // run() metoduna gider ve 10. sat�r� yazd�r�r. // they can run fast
		parent.canCook(); // MultilevelB class�na gider ve canCook() metodunu �a�l��t�r�r.
		// parent they have a special recipe -- bunu yazd�r�r.

		HalukHocaGithub._11_Constructor.MultilevelA g=new HalukHocaGithub._11_Constructor.MultilevelA();
		g.run(); // 12. sat�rdaki metoda gider ve yazd�r�r.
		// they can run fast
		System.out.println(g.language); // Turkish
		//g.bilingual();
		HalukHocaGithub._11_Constructor.MultilevelC child=new MultilevelC();
		System.out.println(child.hairColor); // brown
		child.bilingual(); // MultilevelC deki classa gider ve metodu �al��t�r�r.
		// kids can speak two languages -- bunu yazd�r�r.
	} }
