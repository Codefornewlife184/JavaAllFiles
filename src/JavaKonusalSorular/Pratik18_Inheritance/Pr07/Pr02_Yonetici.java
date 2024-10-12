package JavaKonusalSorular.Pratik18_Inheritance.Pr07;

public class Pr02_Yonetici extends Pr01_Calisan {

	public Pr02_Yonetici(String isim, int maas, String departman) {
		super(isim, maas, departman);
	}

	public Pr02_Yonetici() {

	}
	
	@Override
	public String toString() {
		return "isim=" + isim + "\nmaas= $" + maas + "\ndepartman=" + departman;
	}

	public void zam(int zamOrani) {

		System.out.println("Zam sonrasi calisan maasi : $" + (maas+zamOrani));

	}

}
