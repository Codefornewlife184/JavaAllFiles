package Enum.E02;

public class E02_Main {

    public static void main(String[] args) {

        //1. kisi
        User kullanici=new User();
        kullanici.name="Ali";
        kullanici.yetkisi= Role.ADMIN;
        kullanici.durum= Status.LOGIN;

        //2. kisi
        User kullanici1=new User();
        kullanici1.name="Bekir";
        kullanici1.yetkisi= Role.CUSTOMER;
        kullanici1.durum= Status.ACTIVE;

        if (kullanici.yetkisi== Role.CUSTOMER){
            System.out.println("Silme yetkisi yok");
        }
    }
}