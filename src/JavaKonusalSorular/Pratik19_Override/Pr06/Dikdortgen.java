package JavaKonusalSorular.Pratik19_Override.Pr06;

public class Dikdortgen extends Sekil {

    private double genislik;
    private double uzunluk;

    public Dikdortgen(double genislik, double uzunluk) {
        this.genislik = genislik;
        this.uzunluk = uzunluk;
    }

    @Override
    public double getAlan() {
        return this.genislik * this.uzunluk;
    }

    @Override
    public double getCevre() {
        return (this.genislik + this.uzunluk) * 2;
    }

    @Override
    public String toString() {
        return "Dikdortgen{" +
                "Alan =" + getAlan() +
                ", Cevre =" + getCevre() +
                '}';
    }

}
