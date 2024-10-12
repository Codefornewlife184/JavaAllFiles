package JavaKonusalSorular.Pratik19_Override.Pr03;

public class Isci extends Personel {
	
	
	public String bolum="Kaynak Atolyesi";
    public int maas=5000;
    public String isim = "Mesut";
    
    public int maasHesapla() {
        return 30*8*15; // 30 gun sayisi, 8 gunluk mesai,15 saat ucreti
    }
    
    public void mesai() {
        System.out.println("isciler gunluk 8 saat calisir");
    }
	
    // overloading : aynı isimde ama farklı method signaturelarına sahip metodlar
	
    public int maasHesapla(int gunSayisi) {
    	
    	return gunSayisi*8*15;
    }
        public int maasHesapla(int gunlukCalismaSaati,int gunSayisi) {
        	
        	return gunSayisi*gunlukCalismaSaati*15; 	
        }
        
        public int maasHesapla(int gunlukCalismaSaati,int gunSayisi, int saatUcreti) {
        
        return gunlukCalismaSaati*gunSayisi*saatUcreti;
        }
}
