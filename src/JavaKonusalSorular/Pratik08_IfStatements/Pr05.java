package JavaKonusalSorular.Pratik08_IfStatements;
import java.util.Scanner;
public class Pr05 {

	public static void main(String[] args) {
		/* Kullanicidan boyunu  CM  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz
		BMI = kilo(kg) /(boy*boy)(cm)
		BMI <=20 oldukca zayifsiniz
		20<BMI<=25 Normal sinirlardasiniz 
		25<BMI<=30 Sisman kategorisindesiniz
		30<BMI ==> Obez grubundasiniz.  */

        Scanner scan = new Scanner(System.in);

        System.out.println("Boyunuzu cm giriniz : ");
        double boy =scan.nextDouble()/100;

        System.out.println("Kilonuzu kg  giriniz : ");
        double kilo =scan.nextDouble();

        double bmi = kilo/(boy*boy);
        if(bmi<=20) {
            System.out.println("Vucut kitle endeksiniz :"+bmi+" "+"Oldukca Zayifsiniz");
        }else if(bmi<=25) {
            System.out.println("Vucut kitle endeksiniz :"+bmi+" "+"Normalsiniz");
        }else if(bmi<=30) {
            System.out.println("Vucut kitle endeksiniz :"+bmi+" "+"Sismansiniz");
        }else if(bmi>30) {
            System.out.println("Vucut kitle endeksiniz :"+bmi+" "+"Obezsiniz");
        }

        scan.close();

    }
}