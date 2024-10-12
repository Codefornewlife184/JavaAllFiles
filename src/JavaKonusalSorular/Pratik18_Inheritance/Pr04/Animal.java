package JavaKonusalSorular.Pratik18_Inheritance.Pr04;

    /*
     1) Animal isiminde class creat edip 2 farklý methoda prnt komutu yazýnýz.
     Animal class'ýnda int type'nda  biri initialize(assaingmet) edilmiþ
     digeri initialize(assaingmet) edilmemiþ  iki farkli instance veriable creat ediniz.
     Animal class'ýnda int parametre'li ve parametre'siz iki cons creat ediniz.


     2)Mammal isiminde class creat edip 2 farklý methoda prnt komutu yazýnýz.
     methodlardan biri parentindeki metod ile ayný isimde olsun
     Mammal class'ýnda int type  initialize(assaingmet) edilmiþ biri parentindeki veriable ayný isimde
     digeri farklý isimde  iki farkli instance veriable creat ediniz.
     Mammal class'ýnda char parametre'li ve parametre'siz cons creat ediniz.
     parametre'li cons parentindeki parametre'li cons call etsin.
     parametre'siz cons kendi class'ýndaki parametre'li cons call etsin


    3)Cat isiminde class creat edip parentindeki ile ayný isimde  methoda prnt komutu yazýnýz.
    Cat class'ýnda int type  initialize(assaingmet) edilmiþ biri parentindeki veriable ayný isimde
    digeri farklý isimde  iki farkli instance veriable creat ediniz.
    Cat class'ýnda parametre'li ve parametre'siz cons creat ediniz.
    String parametre'li cons classýndaki parametre'siz cons call etsin
    ve parentindeki ayný isimdeki veriable print etsin

    4)Runner class'ý creat ederek  class ve cons ayný veya
    farklý obj ler creat ederk veriable ve metod call ile yazdýrnýz.

    parent --> child
    animal --> Mammal --> Cat
    */
public class Animal {
	
	public void mA() {
		System.out.println("Animal");
	}
	
	public void mM() {
		System.out.println("Mammal " + " Animal");
	}

		public int a;
		public int m = 3;
		
		public Animal() {
			
			System.out.println("Parametresiz Animal");
		}
		public Animal(int i ) {
			System.out.println("Parametreli Animal");
		}
}
