package HalukHocaGithub._03_IfStatement_TernaryOperator;
import java.util.Scanner;

public class Q16 {
/*
    Kullanicidan 3 Numara isteyiniz ve bu numaralarin en buyuk ve 
    en kucuk olanlarini konsola yazdiriniz
    int num1 
    int num2 
    int num3
*/
    
    public static void main(String[] args) {
        
    	Scanner scan = new Scanner (System.in);
        System.out.println("Lutfen 3 sayi giriniz!");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        
        if(num1 >= num2  && num1 >= num3) {
            System.out.println(num1+" en buyuk sayidir");
                if(num2 >= num3) {
                System.out.println(num3+" en kucuk sayidir");
                }else {
                System.out.println(num2+" en kucuk sayidir");
                }
        }else if(num2 >= num1 && num2 >= num3) {
            System.out.println(num2 +" en buyuk sayidir");
                if(num1 >= num3) {
                System.out.println(num3+" en kucuk sayidir");
                }else {
                System.out.println(num1 +" en kucuk sayidir");
                }  
        }
        
        
        /*
         * Scanner scan = new Scanner(System.in);
			
			System.out.println("3 sayi giriniz");
			
			int sayi1=scan.nextInt();
			int sayi2=scan.nextInt();
			int sayi3=scan.nextInt();
			
			
			if (sayi1>sayi2 && sayi1>sayi3 && sayi2>sayi3) {
				System.out.println("en buyuk : " + sayi1 + " en kucuk : " + sayi3);
			}else if (sayi2>sayi1 && sayi2>sayi3 && sayi3>sayi1) {
				System.out.println("en buyuk : " + sayi2 + " en kucuk : " + sayi3);
			}else if (sayi3>sayi1 && sayi3>sayi2 && sayi1>sayi2) {
					System.out.println("en buyuk : " + sayi3 + " en kucuk : " + sayi2);
			}
		 */
         
        scan.close();
        
    }
}