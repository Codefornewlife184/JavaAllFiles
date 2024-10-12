package CoreJavaDay50.day33_Encapsulation;

public class C01_AccessModifier01 {

	    int defaultAge=15;
		private int privateAge=41;
		protected int protectedAge=32;
		public int publicAge=61;
	}


    // Not 3 class ile yol alacağız... Diğer 2 class ile birlikte bakmamız gerekiyor.

    /* Not: Kısa bilgilendirme yapalım...
	     Erisim alanlari :
         1- Class in ici
         2- Paketin ici
         3- Projenin ici (yani diger paketler)

        *** Public : Projenin her tarafindan erisilebilir, yani diger paketlerden bile.
        (Class, field, properties, metodlarda, constructor)
        *** default: Yani hic bir sey yazilmazsa, yani
        diger adi friendly : sadece paketin icindekiler erisebilir.
        (Class, field,properties metodlarda, constructor)
        *** private: Sadece icinde bulundugu sinif tan erisilebilir.
        (field,properties, metodlarda)


	 	1) "private" class member'lar sadece icinde bulunduklari class'larda kullanilabilirler.
	        Baska class'lardan "private" class memler'lari
	        (field,properties, metodlarda, constructor)kullanmak mumkun degildir.

	 	2) Baska package'lerden object olusturursaniz object olusturulan class'i import etmeniz gerekir.


	 	3) Baska package'lerden default class memberlara ulasamazsiniz. Ayni package'de iseniz

	 	   ulasabilirsiniz. "default" ile "package private" es anlamlidir.

	 	4) "public" class member'lara herkes her yerden ulasabilir(farkli java projesi disinda).

	 	5) "protected" class member'lara ayni package icindeyseniz ulasabilirsiniz.
	 	Farkli package'de iseniz iki durum var :
	 	a)Child class iseniz ulasabilirsiniz.
	 	b)Child class degil iseniz ulasamazsiniz.

	 	6) Class'larda da access modifier kullanilir. Ama sadece "public" ve "default" kullanilir.
	 	Class olustururken "private" veya "protected" access modifier kullanilmaz.

	 	/*Access Modifier (Erisim Belirleyiciler)

		Java da bir method u, variable i ya da class i olusturulurken
		kimlerin erisebilecegini belirtme olanagimiz vardir.
		Bu eylemi gerceklestirecek olan anahtar kelimelere
		Access Modifiers (Erisim Belirleyiciler) adini veririz.

		---> 4 Farkli access modifier vardir
		***1)Private ; Sadece olusturuldugu Class da kullanilabilir
		***2)Default : Sadece olusturuldugu Class in ait oldugu Package icinde kullanilabilir
		Eger herhangi bir Access Modifier yazmazsak,
		Java Access Modifier i default olarak kabul eder.
	    ***3)Protected ; Olusturuldugu Class in ait oldugu Package icinde ve baska package
        icindeki Child Class larda kullanilabilir
		***4)Public ; Heryerden erisim saglanir sinirlandirma icermez.

		NOT :
		Class lar icin sadece public veya default kullanilabilir. Class lar private veya
		protected olamazlar.
		*/