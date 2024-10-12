package JavaKonusalSorular.Pratik19_Override.Pr04;

public class Cocuk extends Baba {

    boolean bisiklet;

    public Cocuk() {

    }

    public Cocuk(String isim) {
        super(isim);
    }

    @Override
    public String toString() {
        return "Cocuk{" +
                "bisiklet=" + bisiklet +
                ", boy=" + boy +
                ", isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", yas=" + yas +
                '}';
    }
}
