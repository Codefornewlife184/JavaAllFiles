package CoreJavaDay50.day28_staticBlock_passByValue;

public class C03_PassByValue {

	public static void main(String[] args) {
		
		double fiyat=100;
		// fiyatta %10 indirim yapicam ve yeni fiyati dondurucem..
		
		int zamYuzdesi=15;
		zamYap(zamYuzdesi);

		System.out.println("method call ile yazdirilan indirimli fiyat "+indirimYap(fiyat));
		// method call ile yazdirilan indirimli fiyat 90.0

		System.out.println("method calistiktan sonra fiyat : " + fiyat);
		// method calistiktan sonra fiyat : 100.0
	}
	private static void zamYap(int zamYuzdesi) {
		// Javaya bir method olusturtdugumuzda Java bizim main method'da kullandigimiz
		// variable isminde clone/kopya bir variable olusturur
		// bunun amaci kod takibini kolaylastirmaktir
		// bu degiskenin ismini degistirsek de kodumuz problemsiz calisir
	}
	private static double indirimYap(double fiyat) {
		
		fiyat=fiyat*90/100;
		System.out.println("methodda ki indirimli fiyat : " + fiyat);
		// methodda ki indirimli fiyat : 90.0
		return fiyat;
	}
}