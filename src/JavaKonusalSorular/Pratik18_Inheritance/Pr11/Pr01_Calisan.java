package JavaKonusalSorular.Pratik18_Inheritance.Pr11;

public class Pr01_Calisan {
	
	String isim;
	int maas;
	String departman;
	
	public Pr01_Calisan(String isim, int maas, String departman) {
		super();
		this.isim = isim;
		this.maas = maas;
		this.departman = departman;
	}
	
	public void bilgileriGoster() {
		System.out.println("Isim : " + isim);
		System.out.println("Maas : " + maas);
		System.out.println("Departman : " + departman);
	}
	
	

}
