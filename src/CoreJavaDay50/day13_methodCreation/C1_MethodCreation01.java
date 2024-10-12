package CoreJavaDay50.day13_methodCreation;

public class C1_MethodCreation01 {

	public static void main(String[] args) {
		// bir method'u olusturmak o method'u calistirmak icin yeterli degildir.
		// Eger bir method'u calistirmak isterseniz 
		// Method Call ( yani o method'u cagirmalisiniz)
		
		// method call yapmak icin method'un adi ve varsa parametreleri yazilmalidir.
		toplama(20,40); /* bu toplama medetodu ifadesini yazdığımızda metoda gider ve sonucu yazdırmadan
		 "method calisti" yazdırır. */
		
		// sadece method call yaptigimizda method calisir
		// eger method'un icinde bir sey yazdiriyorsak console'da o yaziyi goruruz
		
		// ancak method'umuz return type'a sahipse bize bir sonuc return edecektir
		// bu sonucu ya direk yazdiririz su sekilde ;
		
		System.out.println("İlk Toplam : " + toplama(20,40)); // İlk Toplam : 60
	
		
		// veya donen sonucu bir variabla'a atayabiliriz

		int sonuc= toplama(10,15); // bu toplama medetodu ifadesini yazdığımızda metoda gider ve "method calisti" yazdırır.
		System.out.println("Return : " +sonuc); // Return : 25
	}

	public static int toplama(int sayi1, int sayi2) {
		
		System.out.println("method calisti");
			
		return sayi1+sayi2;
	}
}