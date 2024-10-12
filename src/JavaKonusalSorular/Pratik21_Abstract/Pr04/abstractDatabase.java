package JavaKonusalSorular.Pratik21_Abstract.Pr04;

public abstract class abstractDatabase {

    public void add() {
        System.out.println("Eklendi...");
    }

    public void delete() {
        System.out.println("Silindi...");
    }

    abstract void get();
    //Her database de kesinlikle olacak olan özellikleri abstract ile yazıyoruz

    abstract void update();

}
