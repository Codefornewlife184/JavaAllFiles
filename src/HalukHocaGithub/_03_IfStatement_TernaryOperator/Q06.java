package HalukHocaGithub._03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        //// Kullanicidan aldiginiz koordinat noktasinin hangi bolgede oldugunu yazdiran bir kod yaziniz.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen  X ve Y   degerlerini giriniz");
        int x = scan.nextInt();
        int y = scan.nextInt();

        if (x > 0 && y > 0) {
            System.out.println("Girdiginiz nokta 1. bolgede");
        } else if (x < 0 && y > 0) {
            System.out.println("Girdiginiz nokta 2. bolgede");
        } else if (x < 0 && y < 0) {
            System.out.println("Girdiginiz nokta 3. bolgede");
        } else if (x > 0 && y < 0) {
            System.out.println("Girdiginiz nokta 4. bolgede");
        } else if (x == 0 && y!=0) {
            System.out.println("Girdiginiz nokta Y ekseni uzerindedir");
        } else if (y == 0 && x!=0) {
            System.out.println("Girdiginiz nokta X ekseni uzerindedir");
        }else {
            System.out.println("Orijin noktasini girdiniz");
        }
        
        scan.close();
    }
}