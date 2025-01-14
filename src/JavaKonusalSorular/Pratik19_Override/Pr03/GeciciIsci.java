package JavaKonusalSorular.Pratik19_Override.Pr03;

public class GeciciIsci extends Isci {
	
	public String calistigiBolum="Yemekhane";

	public static void main(String[] args) {
		
		// Overriding (GEÇERSİZ KILMA)
		// bir child class da parent class dan miras alınan methodu degistirmeye overriding denir
		
		GeciciIsci gi1= new GeciciIsci();
		System.out.println(gi1.maasHesapla());  // 30*8*10=2400
		gi1.mesai();  // isciler gunluk 8 saat calisir (super den yazdırdı parent claas a giderek)
		
	}
	
	// overriding yapmak icin parent class daki method signature ile 
	//child class da bir method olusturulur.
	//signature aynı oldugundan sadece body degisir
	// boylece parent class daki method child class icin gecersiz kalır
	public int maasHesapla() {
		
		return 30*8*10;
	}
	
	@Override  // annotation
	public void mesai() {   // isci classında degistirince CTE veriyor
		// super.mesai();
		System.out.println("Gecici isciler haftada 25 saat calisir");
		//Gecici isciler haftada 25 saat calisir
		
	}



	//annotation: aciklama, dipnot
	// java 29. satirda kodu inceleyenler icin bir aciklama getiriyor 
	
	//anotation olmasi ve olmamsi arasindaki fark ;
	// annotation sadece bir acıklama degil, override yaptigimiz methodu surekli kontrol eder
	//ve parent class daki overridden method signature i degistirilirse CTE verir
	
	// eger override edilen parent class daki method (OVERRIDDEN) un da calismasini istiyorsak
	// overriding methoda super.overriddenMethodIsmi yazariz
	// eger overriding method da super. yazilmazsa 
	// overridden method calismaz.
	
	// Access Modifier 
    // Child Parent'i sinirlandiramaz 
    // Yani overriding method'un access modifier'i overridden method'un access modifier'indan
    // daha dar olamaz
    
    // Return Type
    // overridden method'un return type'i primitive veya void ise 
    // overriding method'un return type'i da ayni olmali
    // eger return type primitive degilse 
    // (overriding method'un return type'i) IS-A (overridden method'un return type'i) olmalidir.
	
	
}
