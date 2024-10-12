package HalukHocaGithub._02_Scanner;

import java.util.Scanner;

public class Q10 {
     
	// Kullanicidan bir fahrenayt degeri isteyin
	// girilen degeri asagidaki formulle celcius olarak santigrada cevirin

    // formul;
    
    // c = (f-32)*5/9



    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("fahrenayt degeri giriniz : ");

        int f=scan.nextInt();
        
        double donustur = (f-32)*5/9;
        
        System.out.println("girdiginiz fahrenayt degerinin santigrad derecesi : " + donustur);
        
        scan.close();
    }
}
