package JavaKonusalSorular.Pratik18_Inheritance.Pr09;

public class Pr03_Runner {

	public static void main(String[] args) {
		
		myMethod();

	}

	public static void myMethod() {
		
		Pr02_Sub obj1 = new Pr02_Sub();
		obj1.goster();
		System.out.println("sub degisken degeri : " + obj1.num);
		
		Pr01_Super obj2 =new Pr01_Super();
		obj2.goster();
		System.out.println("super degisken degeri : " + obj2.num);
		
	}

}
