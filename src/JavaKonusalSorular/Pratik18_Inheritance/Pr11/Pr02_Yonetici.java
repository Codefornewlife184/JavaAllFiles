package JavaKonusalSorular.Pratik18_Inheritance.Pr11;

public class Pr02_Yonetici extends Pr01_Calisan {

	public Pr02_Yonetici(String isim, int maas, String departman) {

		super(isim, maas, departman);
	}

	public void zam(int zamMiktari) {
		System.out.println("Yapilacak zam miktari : " + zamMiktari);
	}



}
