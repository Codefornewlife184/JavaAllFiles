package JavaKonusalSorular.Pratik02_PrimitiveDataTurleri;
public class Pr02 {
    public static void main(String[] args) {
        /* Primitive data type
           byte, short, int,long, double, float
           veri tiplerinin max ve min degerlerini yazdiralim.   */

        // 1. yol ;
        byte byteMax = Byte.MAX_VALUE;
        System.out.println("Byte Max: " + byteMax ); // 127
        byte byteMin = Byte.MIN_VALUE;
        System.out.println("Byte Min: " + byteMin); // -128

        short shortMax = Short.MAX_VALUE;
        System.out.println("Short Max: " + shortMax ); // 32767
        short shortMin = Short.MIN_VALUE;
        System.out.println("Short Min: " + shortMin); // -32768

        int intMax = Integer.MAX_VALUE;
        System.out.println("int Max: "  + intMax); // 2147483647
        int intMin = Integer.MIN_VALUE;
        System.out.println("int Min: " + intMin); // -2147483648

        long longMax = Long.MAX_VALUE;
        System.out.println("Long Max: " + longMax ); // 9223372036854775807
        long longMin = Long.MIN_VALUE;
        System.out.println("Long Min: " + longMin); // -9223372036854775808

        float floatMax = Float.MAX_VALUE;
        System.out.println("Float Max: "  + floatMax); // 3.4028235E38
        float floatMin = Float.MIN_VALUE;
        System.out.println("Float Min: " + floatMin); // 1.4E-45

        double doubleMax = Double.MAX_VALUE;
        System.out.println("Double Max: "  + doubleMax); // 1.7976931348623157E308
        double doubleMin = Double.MIN_VALUE;
        System.out.println("Double Min: " + doubleMin); // -4.9E-324

        System.out.println("****************************************");

        // 2. yol ;

        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);

        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);

        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);

        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);

    }
}









