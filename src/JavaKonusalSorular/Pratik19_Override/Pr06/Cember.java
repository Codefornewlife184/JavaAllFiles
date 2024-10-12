package JavaKonusalSorular.Pratik19_Override.Pr06;

public class Cember extends Sekil {
    private double yariCap;

    public Cember(double yaricap) {
        this.yariCap = yaricap;
    }

    @Override
    public double getCevre() {
        return 2 * Math.PI * this.yariCap;
    }

    @Override
    public String toString() {
        return "Cember{" +
                "yariCap=" + this.yariCap +
                " cevre =" + getCevre() +
                '}';
    }
}
