package Enum.E04;

public class E04_main {

    public static void main(String[] args) {
        Aylar ay = Aylar.SUBAT;
        ay.getGunMiktari();
        System.out.println("Secilen Ay Gun Sayisi :" + ay.days);
        System.out.println("Ay : " + ay);

    }
}