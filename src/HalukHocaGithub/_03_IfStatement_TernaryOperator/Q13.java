package HalukHocaGithub._03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q13 {

    public static void main(String[] args) {

    /*  Problem Tanimi
        Kullanicidan uc adet sayi alarak bu sayilarin
        bir dik ucgenin kenar uzunluklari olup olmadigini hesaplatan bir kod yaziniz
        (Yardim: Bir ucgenin dik oldugunu anlamak icin a2+b2=c2 pisagor
        baglantisindan yararlanabilirsiniz)
        Ornek Ekran Ciktisi
        birinci kenari giriniz: 2
        ikinci kenari giriniz 15
        ucuncu kenari giriniz: 7
        Bu bir dik ucgen degildir.
        Bu bir dik ucgendir
     */

     Scanner scanner = new Scanner(System.in);
        
        System.out.println("Lutfen 3 sayi giriniz : ");
		
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		int c=scanner.nextInt();
			
			
		if (a*a==b*b+c*c || b*b==a*a+c*c || c*c==a*a+b*b) {
			System.out.println("dik ucgen");
		}else 
			System.out.println("degildir");
			
			
			scanner.close();
    }
}