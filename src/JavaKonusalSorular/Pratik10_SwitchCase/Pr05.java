package JavaKonusalSorular.Pratik10_SwitchCase;
import java.util.Scanner;
public class Pr05 {

	public static void main(String[] args) {
		// Kullanicidan SDET kisaltmasindaki harflerden birini yazmasini isteyin.
        // Kullanici S girerse "Software"
        // D girerse "Developer"
        // E girerse "Engineer"
        // T girerse "In Testing" yazdirin
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen SDET kisaltmasindaki harflerden birini giriniz");
        
        char karakter = scan.next().toUpperCase().charAt(0);
        
        switch (karakter) {
        case 'S' :
            System.out.println("Software");
            break;
        case 'D' :
            System.out.println("Developer");
            break;
        case 'E' :
            System.out.println("Engineer");
            break;
        case 'T' :
            System.out.println("In Testing");
            break;
        default :
            System.out.println("Girdiginiz karakter hatalidir");
	}
        scan.close();
}
}
