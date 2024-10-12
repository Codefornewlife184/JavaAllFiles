package JavaKonusalSorular.Pratik32_Projects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Pr02_PasswordOlusturma {
    public static void main(String[] args) {
        
        /* bir sifre olusturunuz ozellikleri sirasi ile soyle olmalidir;
         1_uzunlugu => en az 10 karakter(chars) olmalidir 
         2_en az 1 sembol bulundurmali
         3_en az 1 numara bulundurmali
         4_en az buyuk harf olmalidir
         5_en az bir kucuk harf olmalidir
        */
 
        String sembol = "!@#$%%^&*()_+";
        String pasword="myPassword1@";
        String rakam="0123456789";
        int numOfSembol=0;
        int numOfRakam=0;
        int numOfBuyukHarf=0;
        int numOfKucukHarf=0;
        if(pasword.length()>=10) {
            for(int i=0;i<pasword.length();i++) {
                if(sembol.contains(pasword.substring(i,i+1))) {
                    numOfSembol++;
                }
                if(rakam.contains(pasword.substring(i,i+1))) {
                    numOfRakam++;
                }
                if(pasword.charAt(i)>='a'&& pasword.charAt(i)<='z') {
                    numOfKucukHarf++;
                }
                if(pasword.charAt(i)>='A'&&pasword.charAt(i)<='Z') {
                    numOfBuyukHarf++;
                }
        }
            
            if(numOfSembol>0 && numOfRakam>0 && numOfBuyukHarf>0 && numOfKucukHarf>0 ) {
                System.out.println("Tebrikler");
                System.out.println("Password unun basarılı bir sekilde olusturulmustur");
            }else {
                System.out.println("Sartlarınız malesef password olusturmaya yetmiyor");
            }
        }
        
        else {
            System.out.println("pasword lengthiniz yetersizdir!");
            System.out.println("Lutfen daha guclu hale getiriniz!");
        }
       
        }

    public static class ManavProjesi {

        /* Basrili Market alış-veriş programı.
        *
        * 1. Adım: Ürünler ve fiyatları içeren listeleri oluşturunuz.

        * 			No 	   Ürün 		  Fiyat
                   ====	 =======	 	=========
                    00	 Domates   	 	 2.10 TL
                    01	 Patates   	 	 3.20 TL
                    02	 Biber     	 	 1.50 TL
                    03	 Soğan      	 2.30 TL
                    04	 Havuç     	   	 3.10 TL
                    05	 Elma      	   	 1.20 TL
                    06	 Muz     	 	 1.90 TL
                    07	 Çilek 	 		 6.10 TL
                    08	 Kavun      	 4.30 TL
                    09	 Üzüm      	 	 2.70 TL
                    10	 Limon     	 	 0.50 TL

        * 2. Adım: Kullanıcının ürün nosuna göre listeden ürün seçmesini isteyiniz.
        * 3. Adım: Kaç kg satın almak istediğini sorunuz.
        * 4. Adım: Alınacak bu ürünü sepete ekleyiniz ve Sepeti yazdırınız.
        * 5. Başka bir ürün alıp almak istemediğini sorunuz.
        * 6. Eğer devam etmek istiyorsa yeniden ürün seçme kısmına yönlendiriniz.
        * 7. Eğer bitirmek istiyorsa ödeme kısmına geçiniz ve ödem sonrasında programı bitirinzi.
        */

        static List<Double> urunfiyatlari = Arrays.asList(2.10, 3.20, 1.50, 2.30, 3.10, 1.20, 1.90, 6.10, 4.30, 2.70, 0.50);
        static List<String> urunler = Arrays.asList("Domates", "Patates", "Biber", "Sogan", "Havuc", "Elma", "Muz",
                "Cilek", "Kavun", "Uzum", "Limon");

        static List<String> sepetUrunler = new ArrayList<>();
        static List<Double> sepetkg = new ArrayList<>();
        static List<Double> sepetFiyat = new ArrayList<>();

        static Scanner scan = new Scanner(System.in);
        static double toplamFiyat = 0;

        public static void main(String[] args) {

            System.out.println("\t~~~~~~~~Online Markete Hos Geldiniz~~~~~~~\n");

            boolean cvp = true;
            if (cvp) {
                do {
                    urunListele();


                    System.out.println("");
                    System.out.print("Lutfen istediginiz urunun numarasini giriniz : ");
                    int urunNo = scan.nextInt();
                    System.out.print("Lutfen istediginiz urunun miktarini kg cinsinden giriniz : ");
                    double kg = scan.nextDouble();

                    sepeteEkle(urunNo, kg);

                    sepetYazdir(toplamFiyat);
                    System.out.println("Alisverise devam etmek ister misiniz? true/false");
                    cvp = scan.nextBoolean();

                } while (cvp);
            }
            if (!cvp) {

                System.out.println("\n\t\t FATURA ");
                System.out.println();
                System.out.println("\n********************************");
                sepetYazdir(toplamFiyat);
                odeme(toplamFiyat);
            }

        }

        private static void sepeteEkle(int urunNo, double kg) {

            sepetUrunler.add(urunler.get(urunNo));
            sepetFiyat.add(urunfiyatlari.get(urunNo) * kg);
            sepetkg.add(kg);
            double sepetToplam = Math.round(urunfiyatlari.get(urunNo) * kg);
            toplamFiyat += sepetToplam;

        }

        private static void odeme(double toplamFiyat) {

            double odeme = 0;

            do {
                System.out.println("Lutfen odeme yapacaginiz para miktarini giriniz");
                odeme = scan.nextDouble();

                if (odeme >= toplamFiyat) {

                    System.out.println("Alinan para \t\t\t: " + odeme);
                    System.out.println("Para ustu   \t\t\t: " + Math.round(odeme - toplamFiyat));
                    System.out.println("********************************");
                    System.out.println("TOPLAM TUTAR \t\t\t:" + toplamFiyat);
                    System.out.println();
                } else
                    System.out.println("Eksik tutar !! \ntutariniz  en az " + toplamFiyat + "TL olmalidir!");

            } while (odeme < toplamFiyat);

            System.out.println("Bizi tercih ettiginiz icin tesekkurler....");
        }

        private static void sepetYazdir(double toplamFiyat) {

            System.out.println(" No " + "\tUrun\t" + "\tFiyat");
            System.out.println("====\t=======\t\t=========");
            for (int i = 0; i < sepetUrunler.size(); i++) {

                System.out.println(i + "\t" + sepetUrunler.get(i) + " \t\t:" + sepetFiyat.get(i) + " TL");

            }
            System.out.println("\tToplamfiyat\t:" + toplamFiyat);
        }

        private static void urunListele() {
            System.out.println("No " + "\tUrun\t   " + "Fiyat");
            System.out.println("==\t=======\t   ======");
            for (int i = 0; i < urunler.size(); i++) {
                System.out.println(i + "\t" + urunler.get(i) + "\t   " + urunfiyatlari.get(i) + " TL");
            }

        }
    }
}
