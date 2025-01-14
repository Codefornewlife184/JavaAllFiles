package JavaKonusalSorular.Pratik21_Abstract.Pr02;

public abstract class Banka {
    double Bakiye;

    public Banka(double Bakiye) {
        this.Bakiye = Bakiye;
    }

    public Banka() {
        System.out.println("Hesap hareketleri...");
    }

    abstract double paraYatir(double miktar);

    abstract double paraCek(double miktar);
}
