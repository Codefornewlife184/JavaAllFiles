package HalukHocaGithub._03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Ter03 {

    public static void main(String[] args) {
        // Kullanicidan bir pozitif tamsayi girmesini isteyin,
        // o pozitif tamsayi 3 basamakli ise ekrana "3 Basamakli" yazdirin.
        // 3 basamakli degilse cift olup olmadigini kontrol edin.
        // Cift ise "3 basamakli olmayan cift sayi" yazdirin.
        // Cift sayi degilse "3 basamakli olmayan tek sayi" yazdiriniz...

        Scanner scan = new Scanner(System.in);

        System.out.print("Sayi giriniz : ");
        int num = scan.nextInt();
        System.out.println("*****  TERNARY COZUMU  *****");

        String result = (num > 99 && num < 1000) ? ("3 basamakli") : (num % 2 == 0 ?
                "3 basamakli olmayan cift sayi" : "3 basamakli olmayan tek sayi");
        System.out.println(result);

        System.out.println("*****  if  cozumu  *****");
        if (num <1000 && num>99) {
            System.out.println("3 basamakli");

        }else if (num % 2 == 0 ) {
            System.out.println("3 basamakli olmayan cift sayi");

        }else System.out.println("3 basamakli olmayan tek sayi");

        scan.close();
    }
}