package Enum.E01;

import Enum.E01.E01_Enum_Aylar;

public class E01_Main {
    public static void main(String[] args) {

        E01_Enum_Aylar ay=E01_Enum_Aylar.KASIM;
        // Enum class olmadigi icin new keyword u kullanilmaz...

        System.out.println("ay = " + ay);
        System.out.println("ay.name() = " + ay.name());
        System.out.println("ay sırasi = " + ay.ordinal());
        // Enum yapisindaki ay obj index sirasini verdi :10

            switch (ay) {
                case OCAK:
                    System.out.println("İyi ki dogdun güzel insan");
                    break;
                case SUBAT:
                    System.out.println("İyi ki dogdun güzel insan");
                    break;
                case MART:
                    System.out.println("İyi ki dogdun güzel insan");
                    break;
                case NISAN:
                    System.out.println("İyi ki dogdun güzel insan");
                    break;
                case MAYIS:
                    System.out.println("İyi ki dogdun güzel insan");
                    break;
                case HAZIRAN:
                    System.out.println("İyi ki dogdun güzel insan");
                    break;
                case TEMMUZ:
                    System.out.println("İyi ki dogdun güzel insan");
                    break;
                case AGUSTOS:
                    System.out.println("İyi ki dogdun güzel insan");
                    break;
                case EYLUL:
                    System.out.println("İyi ki dogdun güzel insan");
                    break;
                case EKIM:
                    System.out.println("İyi ki dogdun güzel insan");
                    break;
                case KASIM:
                    System.out.println("İyi ki dogdun Hayatim");
                    break;
                case ARALIK:
                    System.out.println("İyi ki dogdun güzel insan");
                    break;
                default:
                    System.out.println("Girdiginiz ay ismi hatalidir");
            }
    }
}