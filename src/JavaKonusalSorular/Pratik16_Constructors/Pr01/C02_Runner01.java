package JavaKonusalSorular.Pratik16_Constructors.Pr01;
public class C02_Runner01 {
	public static void main(String[] args) {

		C01 car1=new C01();
       /* C01 car1 yazdigimizda C01 hem class ismi, hem de car1 objesinin non-primitive data turudur
		new C01();  esitligin sagi deger olusturma
		new : keyword dur ve yeni bir obje olusturacagimizi beyan eder. C01() ise constructor'dir   */
		
		car1.fiyat=10000;
		car1.ilanNo=1001;
		car1.marka="Toyota";
		car1.model="Corolla";
		car1.yil=2020;
		// variable'lar sadece deger atamasi yapar
		System.out.println("Car1 : "+car1.fiyat+", " + car1.ilanNo + ", "+ car1.marka+", "+
							car1.model+", "+ car1.yil); // 10000, 1001, Toyota, Corolla, 2020
		car1.maxHiz(200); // diğer C01 class ta metod üzerinden bunu yazdırdı. Araba 200 km hiz yapabilir
		car1.yakit("dizel"); // // diğer C01 class ta metod üzerinden bunu yazdırdı.  Araba yakit olarak dizel kullanir
		// Not : method'larin ne yapacagini method belirler. O yüzden diğer class a gitti.
		
		// bir araba daha olusturmak istersem. car2 adında bir C01 classından nesne oluşturuyorum.
		C01 car2= new C01();
		
		System.out.println("Car2 : "+car2.fiyat+", " + car2.ilanNo + ", "+ car2.marka+", "+
				car2.model+", "+ car2.yil); // Car2 : 0, 0, null, Yazilmadi, 1900
		car2.fiyat=15000;
		car2.ilanNo=1002;
		car2.marka="Opel";
		car2.model="Astra";
		car2.yil=2010;
		System.out.println("Son : "+car2.fiyat+", " + car2.ilanNo + ", "+ car2.marka+", "+
				car2.model+", "+ car2.yil); // Son : 15000, 1002, Opel, Astra, 2010
	} }