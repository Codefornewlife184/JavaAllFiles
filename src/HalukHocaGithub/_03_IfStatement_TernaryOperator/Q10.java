package HalukHocaGithub._03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {

        /*
        Kulanicidan aracin hizini aliniz...
        trafik cezasinin degerini hesaplayiniz...
        45 km hiz siniridir..
        Eger hiziniz 55-74 arasinda ise : ceza 100$ dir...
        Eger hiziniz 75-84 arasinda ise : ceza 150$ dir...
        Eger hiziniz 85-94 arasinda ise : ceza 320$ dir...
        Eger hiziniz 94 ten fazla ise : ceza 500$ dir...
        Eger hiziniz 55-74 arasinda ise : ceza 100$ dir...
            ve ayrica,
            Eger surucunun ehliyeti yoksa cezaya 200 $ eklenir.
            Orn: Hiziniz 77 iken cezaniz 150$'dir ama ehliyetiniz yoksa ceza 350 $ olur.
-----------------------------------------
            Orn;
            currentSpeed(Hiziniz) 87
            ve isDriverLicenceAvailable(Ehliyeti var mi?) = true;
            sonuc 320 olmalidir.
            currentSpeed(Hiziniz) 65
            ve isDriverLicenceAvailable(Ehliyeti var mi?) = false;
            sonuc 300 olmalidir.
     */

        Scanner scan = new Scanner(System.in);
        System.out.print("Ehliyetiniz var ise 1 , yoksa 0 yaziniz : ");

        int ehliyet = scan.nextInt();

        System.out.print("Hizinizi giriniz : ");

        int hiz = scan.nextInt();

        if (ehliyet == 1) {
            if (hiz < 0) {
                System.out.println("hatali veri girdiniz");
            } else if (hiz > 54 && hiz < 75) {
                System.out.println("Ceza 100 $'dir.");
            } else if (hiz >= 75 && hiz < 85) {
                System.out.println("Ceza 150 $'dir.");
            } else if (hiz >= 85 && hiz < 95) {
                System.out.println("Ceza 320 $'dir.");
            } else if (hiz >= 95) {
                System.out.println("Ceza 500 $'dir.");
            } else {
                System.out.println("Hiz Sinirinda seyahat ediyorsunuz hayirli yolculuklar.. ");
            }
        } else if (ehliyet == 0) {
            if (hiz > 54 && hiz < 75) {
                System.out.println("Ceza 300 $'dir.");
            } else if (hiz >= 75 && hiz < 85) {
                System.out.println("Ceza 350 $'dir.");
            } else if (hiz >= 85 && hiz < 95) {
                System.out.println("Ceza 520 $'dir.");
            } else if (hiz >= 95) {
                System.out.println("Ceza 700 $'dir.");
            } else {
                System.out.println("Sadece Ehliyetsiz kullanimdan dolayi cezaniz  200 $'dir. ");
            }
        } else {
            System.out.println("Lutfen Gecerli Bir deger Giriniz!");
        }

        scan.close();
    }
}