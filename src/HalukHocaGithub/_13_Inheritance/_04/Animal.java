package HalukHocaGithub._13_Inheritance._04;

    /*
     1) Animal isiminde class creat edip 2 farkl� methoda prnt komutu yaz�n�z.
     Animal class'�nda int type'nda  biri initialize(assaingmet) edilmi�
     digeri initialize(assaingmet) edilmemi�  iki farkli instance veriable creat ediniz.
     Animal class'�nda int parametre'li ve parametre'siz iki cons creat ediniz.


     2)Mammal isiminde class creat edip 2 farkl� methoda prnt komutu yaz�n�z.
     methodlardan biri parentindeki metod ile ayn� isimde olsun
     Mammal class'�nda int type  initialize(assaingmet) edilmi� biri parentindeki veriable ayn� isimde
     digeri farkl� isimde  iki farkli instance veriable creat ediniz.
     Mammal class'�nda char parametre'li ve parametre'siz cons creat ediniz.
     parametre'li cons parentindeki parametre'li cons call etsin.
     parametre'siz cons kendi class'�ndaki parametre'li cons call etsin


    3)Cat isiminde class creat edip parentindeki ile ayn� isimde  methoda prnt komutu yaz�n�z.
    Cat class'�nda int type  initialize(assaingmet) edilmi� biri parentindeki veriable ayn� isimde
    digeri farkl� isimde  iki farkli instance veriable creat ediniz.
    Cat class'�nda parametre'li ve parametre'siz cons creat ediniz.
    String parametre'li cons class�ndaki parametre'siz cons call etsin
    ve parentindeki ayn� isimdeki veriable print etsin

    4)Runner class'� creat ederek  class ve cons ayn� veya
    farkl� obj ler creat ederk veriable ve metod call ile yazd�rn�z.

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
