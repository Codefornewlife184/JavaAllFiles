package JavaKonusalSorular.Pratik10_SwitchCase;
import java.util.Scanner;
public class Pr08 {
    public static void main(String[] args) {
       // Girilen bir ay numarasına göre , ayın kaç gün olduğunu sayı ile yazdırınız

        Scanner oku = new Scanner(System.in);
        System.out.print("Ay No =");
        int ayNo = oku.nextInt();

        switch (ayNo) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Girdiğiniz ay 31 gün");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Girdiğiniz ay 30 gün");
                break;
            case 2:
                System.out.print("yıl = ");
                int yil = oku.nextInt();
                if (yil % 4 == 0)
                    System.out.println("Girdiğiniz ay 29 gün");
                else
                    System.out.println("Girdiğiniz ay 28 gün");
                break;
            default:
                System.out.println("Hatalı giriş yaptınız!!!");
        }
    }
}

