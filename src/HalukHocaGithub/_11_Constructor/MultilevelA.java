package HalukHocaGithub._11_Constructor;

public class MultilevelA {

	public String eyeColor="black";
	public String language="Turkish";
	public String hairColor="brown";
	
	public void run() {
		System.out.println("they can run fast");
	}

	/*
	 * Write program to inherit class A that has method printF which is static and
	 * call or reuse that method into class B
	 */
		public static void printF() {
			System.out.println("This is static method");
			
		}
	public static void main(String[] args) {

		MultilevelB parent=new MultilevelB();
		System.out.println(parent.eyeColor); // black
		System.out.println(parent.hairColor); // brown
		System.out.println(parent.language); // Turkish

		parent.run(); // run() metoduna gider ve 10. satýrý yazdýrýr. // they can run fast
		parent.canCook();
		
		MultilevelA g=new MultilevelA();
		g.run();
		System.out.println(g.language);
		//g.bilingual();
		MultilevelC child=new MultilevelC();
		System.out.println(child.hairColor);
		child.bilingual();
		
		
		
		
		
		
		
	}

}
