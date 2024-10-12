package JavaKonusalSorular.Pratik19_Override.Pr04;

public class Dede extends BuyukDede {

    int boy;
    boolean baston;
    int torun;

    public Dede() {

    }

    public Dede(String isim) {
        super(isim);
    }

    @Override
    public String toString() {
        return "Dede{" +
                "boy=" + boy +
                ", baston=" + baston +
                ", torun=" + torun +
                ", isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", yas=" + yas +
                ", meslek='" + meslek + '\'' +
                '}';
    }
}
