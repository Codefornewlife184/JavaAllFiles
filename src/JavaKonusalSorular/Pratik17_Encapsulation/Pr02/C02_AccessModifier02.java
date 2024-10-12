package JavaKonusalSorular.Pratik17_Encapsulation.Pr02;

public class C02_AccessModifier02 {

	public static void main(String[] args) {
		
		C01_AccessModifier01 obj1 =new C01_AccessModifier01(); // C01 classindan obj1 creat ettik
			
			System.out.println("defaultAge : " + obj1.defaultAge); // 15
			//private kendine has oldugundan burada kullanamam
			System.out.println("protectedAge : " + obj1.protectedAge); // 32
			System.out.println("publictAge : " + obj1.publicAge); // 61

			C03_AccessModifier03 name =new C03_AccessModifier03();
			// diğer class lardan gelecek bilgiler için nesne oluşturduk...

			System.out.println(name.protectedName); // Turan
			System.out.println(name.defaultName); // Mehmet
			System.out.println(name.publicName); // Danyal
		
	}
}
