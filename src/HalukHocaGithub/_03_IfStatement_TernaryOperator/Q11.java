package HalukHocaGithub._03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q11 {

    @SuppressWarnings("resource")
	public static void main(String[] args) {

    /*  Problem Tanimi
    Kullanicidan bir tarihi gun ay ve yil seklinde alip bu tarihi ay gun yil
    ve yil ay ve gun siralarina cevirerek yazan bir kod yaziniz...

    ipucu: her else komutundan sonra return; komutu kullaniniz...
        Ornek Ekran Ciktisi
        Lutfen gunu giriniz: 10
        Lutfen ayi giriniz: 02
        Lutfen yili giriniz: 2009
        Gun ay yil: 10.02.2009
        Ay gun yil: 02.10.2009
        Yil ay gun: 2009.02.10
        */

        Scanner scanner = new Scanner(System.in);

        int gun;
        int ay;
        int yil;

        System.out.println("Tarihi gun,ay,yil olarak istenen sekliyle giriniz... ");

        System.out.print("Gun: ");
        gun = scanner.nextInt();

        if (gun > 0 && gun <= 31) {
            System.out.println(gun);

        } else {
            System.out.println("Yanlis giris yaptiniz.Program sonlaniyor...");
            return;
        }


        System.out.print("Ay: ");
        ay = scanner.nextInt();

        if (ay > 0 && ay <= 12) {
            System.out.println(ay);

        } else {
            System.out.println("Yanlis giris yaptiniz.Program sonlaniyor...");
           // return;
        }

        System.out.print("Yil: ");
        yil = scanner.nextInt();

        if (yil > 0) {
            System.out.println(yil);

        } else {
            System.out.println("Yanlis giris yaptiniz.Program sonlaniyor...");
           // return;
        }

        System.out.println("Ay/Gun/Yil : " + ay + "/" + gun + "/" + yil);
        System.out.println("Yil/Ay/Gun : " + yil + "/" + ay + "/" + gun);

        scanner.close();
    }
}