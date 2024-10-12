package JavaKonusalSorular.Pratik07_ScannerClass;

import java.util.Scanner;

public class Pr11 {
     
	// Kullanicidan bir Fahrenheit degeri isteyin
	// girilen degeri asagidaki formulle celcius olarak santigrada cevirin

    // formul;
    
    // c = (f-32)*5/9

    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("Fahrenheit degeri giriniz : ");

        int f=scan.nextInt();
        
        double donustur = (f-32)*5/9;
        
        System.out.println("Girdiginiz Fahrenheit degerinin santigrad derecesi : " + donustur);
        
        scan.close();
    }
}
