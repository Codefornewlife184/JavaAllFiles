package JavaKonusalSorular.Pratik16_Constructors.Pr01;

public class C03_Runner02 {

	public static void main(String[] args) {
		// ilk deger atamasi yapmadan bos bir car olusturmak istiyorsak
		// default constructor yeterli olur
		
		C01 car1=new C01();
		
		// Ama bu durumda car1'e ait tum degerleri tek tek atamam gerekir
		
		car1.ilanNo=1003;
		car1.marka="Nissan";
		car1.model="Primera";
		car1.yil=2005;
		car1.fiyat=12000;
		
		System.out.println("Car1 :"+car1.fiyat+", " + car1.ilanNo + ", "+ car1.marka+", "+
				car1.model+", "+ car1.yil); // Car1 :12000, 1003, Nissan, Primera, 2005

		// Eger objeyi olustururken deger de atamak istiyorsak
		// parametreli constructor olusturmamiz gerekir
		
		C01 car2=new C01(1004,"Honda","Civic",2010,20000);
		System.out.println("Car2 :"+car2.fiyat+", " + car2.ilanNo + ", "+ car2.marka+", "+
				car2.model+", "+ car2.yil); // Car2 :20000, 1004, Honda, Civic, 2010
		
		C01 car3=new C01(1005,"Mercedes",50000);
		
		System.out.println("Car3 :"+car3.fiyat+", " + car3.ilanNo + ", "+ car3.marka+", "+
				car3.model+", "+ car3.yil); // Car3 :50000, 1005, Mercedes, Yazilmadi,

	}
}