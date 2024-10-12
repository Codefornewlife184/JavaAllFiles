package JavaKonusalSorular.Pratik22_Interfcae.Pr04;

public class ToyotaPrius extends Vehicle implements IElectric, IGas {

    public ToyotaPrius(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String changeBattery() {
        return "batarya ömrüne dikkat ediniz...";
    }

    @Override
    public String changeOil() {
        return "euro diesel kullanınız...";
    }

    @Override
    public String drive() {
        return "hız limitlerine uyunuz...";
    }

}




