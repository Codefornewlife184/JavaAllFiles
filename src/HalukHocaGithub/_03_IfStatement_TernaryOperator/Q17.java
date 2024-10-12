package HalukHocaGithub._03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q17 {

	public static void main(String[] args) {
		
		// Kullanicidan bir pozitif tamsayi girmesini isteyin,
		// o pozitif tamsayi 3 basamakli ise ekrana "3 Basamakli"yazdirin.
        // 3 basamakli degilse cift olup olmadigini kontrol edin. cift ise
		// "3 basamakli olmayan cift sayi" yazdirin.
        // Cift sayi degilse "3 basamakli olmayan tek sayi" yazdiriniz...
		
		
		
		Scanner scan=new Scanner(System.in);
		int sayi=scan.nextInt();
	
		
		String sonuc =(sayi>=100 && sayi<=999) ? "Uc basamakli Sayi" : (sayi%2==0)  ? "Uc basamakli olmayan cift sayi" : "Tek";
		System.out.println(sonuc);
		
		
		if ((sayi>=100 && sayi<=999)) {
			System.out.println("Uc basamakli Sayi");
		    if (sayi%2==0) {
			System.out.println("Uc basamakli olmayan cift sayi");
		   }
		}else System.out.println("Olmayan tek");
		scan.close();
	}

}
