package CoreJavaDay50.day44_AbstractClases03;

    /*  1) Abstract Banka class ceat ediniz. fields: double Bakiye;
        parametreli constructor creat ediniz
        parametresiz constructor --> print:Hesap hareketleri...
        parametreli paraYatir ve parametreli paraCek abs method creat ediniz
    2) Banka class'in sub class'i BenimHesabim class creat ediniz
        parametreli bakiye print eden constructor creat ediniz
    3) HesapHareketlerim class'nda obj ile islemler yapip yazdiriniz  */

    // 1. adimda banka class'i creat ettim..
	public abstract class Banka {
		
		// 2. adim da fields olusturuldu...
		double bakiye;

		// 3. adim da parametreli constructr creat ettik..
		public Banka(double bakiye) {
			
		this.bakiye = bakiye;
		}

		// 4. adimda parametresiz constructr creat ettik..
		public Banka() {
		// 5. adim "hesap hareketleri" diye yazdir...
			System.out.println("hesap hareketleri");
		}
		
		// 7. adimda ise parametreli paraYatir ve parametresiz paraCek adinda abstract method creat ediniz... 
		abstract double paraYatir(double miktar);
		abstract double paraCek(double miktar);
	}