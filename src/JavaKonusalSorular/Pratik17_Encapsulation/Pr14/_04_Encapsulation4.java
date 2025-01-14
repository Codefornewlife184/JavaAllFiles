package JavaKonusalSorular.Pratik17_Encapsulation.Pr14;

import java.util.Scanner;

public class _04_Encapsulation4 {

    /* TODO
    Burada iki adet class vardır. Biri Main diğeri ise rentApartments
    rentApartments'ın içinde;
    Bu variable'ları private olarak oluşturun;
    String name
    int roomCount
    boolean balconyOrNo

   Bütün variable'lar için getter ve setter oluşturunuz.
    4 farklı Apartment(apartman dairesi) vardır. 0, 1, 2, 3 rooms(odalı)
    -----------------------------------------------------------------
    Bir method oluşturun;
    Eğer room sayısı 0 ise,
    rent(kira) 1400
    Eğer oda sayısı 1 ise,
    rent  1700
    Eğer oda sayısı 2 ise,
    rent 2200
    Eğer oda sayısı 3 ise,
    rent 2700
    rent'i return'leyin.
    ----------------------------------------------------------------
    Bir method oluşturun.
    Eğer balconyOrNo  true ise,
    rent'e 200 dollar ekleyin.

    Main class'ın içinde;
    userName rent is amountOfRent
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("adınızı giriniz : ");
        String name = scan.nextLine();
        System.out.print("Talep ettiginiz oda sayisiniz giriniz : ");
        int odaSayisi = scan.nextInt();
        System.out.println("balkon tercihinizi giriniz True/false : ");
        boolean balconyOrNo = scan.nextBoolean();

        //  BU SATIRIN YUKARISINI DEĞİŞTİRMEYİNİZ ve
        //  rentApartments class'ında setter'ı ayarlarken bu variable'ları kullanınız.

        rentApartments kiraci1 = new rentApartments(); // Kira miktarı
        kiraci1.setName(name);
        kiraci1.setRoomCount(odaSayisi);
        kiraci1.setBalconyOrNo(balconyOrNo);


        int toplamUcret = kiraci1.balkonSor(balconyOrNo) + kiraci1.KiraHsapla(odaSayisi);
        System.out.println(kiraci1.getName() + " kiraniz " + toplamUcret);


    }
}

