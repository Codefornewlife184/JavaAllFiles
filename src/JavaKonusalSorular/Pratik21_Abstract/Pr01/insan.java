package JavaKonusalSorular.Pratik21_Abstract.Pr01;
    /*
    1)  abstract  bir insan class creat ediniz. fields:  private String isim;
     private String soyisim;
     parametre'li constructor  creat ediniz
     abs calis method creat ediniz
     concrete bilgilendirme method creat ediniz-->fields print etsin
     concrete isimDegistir  method creat ediniz-->fields parametre alsin atama yapsin

    2) İnsan classina sub class olacak Calisan class creat ediniz  fields:private int calisanId;
       calisanId==0 ise calisan degil aksi durumda calısan oldugunu kontrol edip id si ile  yazdirinz
       3 farkli obj ile ozellikleriniz yazdiriniz  */

public abstract class insan {
    private String isim;
    private String soyisim;

    public insan(String isim, String soyisim) {
        this.isim = isim;
        this.soyisim = soyisim;
    }

    public abstract void calis();

    public void Bilgilendirme() {

        System.out.println("İsim:  " + this.isim + "    Soyisim : " + this.soyisim);
    }
    public void isimDegistir(String isim, String soyisim) {

        this.isim = isim;
        this.soyisim = soyisim;
    }
}
