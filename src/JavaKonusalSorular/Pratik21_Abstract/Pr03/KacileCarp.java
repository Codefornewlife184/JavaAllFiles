package JavaKonusalSorular.Pratik21_Abstract.Pr03;

public class KacileCarp extends Urun {
    public KacileCarp(int kac) {
        super(kac);
    }

    public static void main(String[] args) {

        ikiIleCarpma icarp = new ikiIleCarpma();
        KacileCarp kcarp = new KacileCarp(4);

        System.out.println(icarp.carp(3));
        System.out.println(kcarp.carp(1));
    }
}
