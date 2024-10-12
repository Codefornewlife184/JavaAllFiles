package JavaKonusalSorular.Pratik17_Encapsulation.Pr05;

public class KisiMain {
    public static void main(String[] args) {
        AdemOglu insan1=new AdemOglu(); //parametesiz cons kullanıldı Kisi classından insan1 obj üretidi

        insan1.adi="haluk";
        insan1.soyadi="bilgin"; // insan1 obj tüm fieldlerine direk ulaşabildik.
        insan1.setYas(-47); // yas field private oldğ için bu veriyi setYas methodu ile giriş yaptık
        // Kullanıcı hatalı veri girmesini engellemek için veiable erişime kapatılmalı.

        System.out.println("Haluk yas = " + insan1.getYas()); // 47
    }
}
