package JavaKonusalSorular.Pratik21_Abstract.Pr04;

public class main {
    public static void main(String[] args) {

        abstractDatabase samsung = new samsungDatabase();
        abstractDatabase huawei = new huaweiDatabase();

        samsung.add();
        samsung.delete();
        samsung.get();
        samsung.update();

        System.out.println("----------------------");

        huawei.add();
        huawei.delete();
        huawei.get();
        huawei.update();


    }
}
