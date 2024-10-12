package JavaKonusalSorular.Pratik19_Override.Pr12;

public class AracPark {

	    public static void main(String[] args) {

	    	Otobus obj =new Otobus("kirimizi",
					5000,
					"Mercedes-Benz OM 470",
					35);
	    	System.out.println("faruk turizm : " +obj);
	    	// Çıktı şu şekilde
			// faruk turizm : Otobus [yolcuSayisi=35,
			// model=Mercedes-Benz OM 470kirimizi5000,
			// toString()=
			// CoreJavaDay50.day40_Overriding.
			// Otobus@16b98e56]
	    }
	    
}