package JavaKonusalSorular.Pratik19_Override.Pr03;

public class Formen extends Isci {
	
	public String sorumluOldBolum ="bakim";
	public String isim= "Emrullah";

	public static void main(String[] args) {

		// Inhertance da data turu olarak class ismi kullanimi
		
		// bir class da obje üretirken data türü olarak class ın kendisini veya parent larını  kullanabiiliriz
		// olusturdugumuz obje ile variable kullanmamız gerekirs hangi degeri alacagını anlamak için
		// önce data türü olan class a gideriz orada aradığımız variable varsa kullanırız,
		// yoksa parent larına bakarız yukarı dogru gidereken ilk buldugumuz degeri kullanırız.
		
		Formen fr1= new Formen ();
		// fr1 objesini kullanarak hangi class ların variable ları görebilirim
		fr1.sorumluOldBolum= "Marangozhane";
		fr1.maas= 100000;
		System.out.println(fr1.isim + " " + fr1.sorumluOldBolum+" "+ fr1.maas); //Emrullah Marangozhane 100000
		
		Isci fr2 = new Formen();
		//Data türü olarak Isci secildigi için
		fr2.bolum= "Kaynak atolyesi";
		//fr2.isim= "Yakup";
		//System.out.println(fr2.isim + " " + fr2.bolum+" "+ fr2.maas); //Yakup Kaynak atolyesi 5000
		// bu atamayı kaldırıp class da isim atadıktan sonra
		System.out.println(fr2.isim + " " + fr2.bolum+" "+ fr2.maas);  //Mesut Kaynak atolyesi 5000
		
		Personel fr3=new Formen();
		System.out.println(fr3.isim); //Emre

	}

}
