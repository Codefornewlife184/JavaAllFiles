package HalukHocaGithub._03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q12 {

    public static void main(String[] args) {
        /*
        Kullanicidan vize ve final notlarini aliniz.
        Kullanicinin istedigi oranlarda vize ve final yuzdeleri not ile not ortalamasini hesaplayip
        not ortalamasini yazdirip
        50 ve buyuk ise
        "Tebrikler dersi basari ile gectiniz..."
        kucuk ise
        "Malesef dersten kaldiniz..." yazdiriniz..
         */

    	 Scanner scan = new Scanner(System.in);
         
         System.out.println("Vize notunu giriniz : ");
 		double vize=scan.nextDouble();	
 		
 		System.out.println("Final notunu giriniz : ");
 		double finol=scan.nextDouble();
 		
 		
 		System.out.println("Vize yuzdesi giriniz");
 		double vizeYuzde=scan.nextDouble();	
 		System.out.println("Final yuzdesi giriniz : ");
 		double finolYuzde=scan.nextDouble();
 		
 		double vizeHesaplama=(vize*vizeYuzde)/100;
 		double finolHesaplama=(finol*finolYuzde)/100;
 		
 		double not = (vizeHesaplama+finolHesaplama);
 		
 		System.out.println(not);
 		if (not>=50) {
 			System.out.println("Tebrikler dersi basari ile gectiniz");
 		}else if (not<50) {
 			System.out.println("Malesef dersten kaldiniz...");
 		}
 		
 		
 		scan.close();
 		
    }
}