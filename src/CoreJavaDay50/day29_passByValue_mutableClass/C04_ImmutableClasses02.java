package CoreJavaDay50.day29_passByValue_mutableClass;

public class C04_ImmutableClasses02 {

	public static void main(String[] args) {
		
		String A= "Mehmet";
		String B= "Mehmet";
		String C= B +""; // C nin degeri sonucta yine sadece Ali olsa da Conctenation oldugundan
						 // Java risk almaz ve yeni bir obje olusturur
		String D= C;

		// equals method'u sadece icerige bakar. Icerik hepsinde Ali oldugundan 
		// equals iki satirda da true doner
		System.out.println(A.equals(C)); // true
		System.out.println(A.equals(B)); // true
		System.out.println(D.equals(C)); // true
		
		// == hem icerige hem de referansa bakar dolayisiyla A==C false verir. Çünkü yanına boşluk ekledik.
		System.out.println(A==C); // false
		System.out.println(A==B); // true
		System.out.println(D==C); // true
		
		String E= new String("Mehmet");
		// Aslinda String non-primitive oldugundan new kelimesini kullanmak gerekir
		// Ama String cok kullanildigi icin String'e ozel olarak new kelimesi kullanilmadan da 
		// yeni String olusturabiliriz String isim="Mehmet"; gibi
		System.out.println("new ile olusturdugum E degiskeni : "+E);
		String F=new String("Mehmet");
		
		System.out.println(E.equals(F)); // true
		System.out.println(E==F); // false

	}
}