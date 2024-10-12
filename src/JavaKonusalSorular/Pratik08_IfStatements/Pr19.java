package JavaKonusalSorular.Pratik08_IfStatements;

public class Pr19 {

    public static void main(String[] args) {

       /*   45 degerinde bir double olusturun.
            Eger double 5'e bolununce kalan 0 ise ve double 8'e bolununce  kalan 0 ise
            "able to divide by 5 and 8" yazdiriniz.
            Eger double 10'a bolununce kalan 5 ise ve double 9'a bolununce  kalan 0 ise
            "able to divide by 9 and divide by 10 reminder is 5" yazdiriniz.
        */

        double number = 45;

        if (number % 5 == 0 && number % 8 == 0) {
            System.out.println("able to divide by 5 and 8");
        } else if (number % 10 == 5 && number % 9 == 0) {
            System.out.println("able to divide by 9 and divide by 10 reminder is 5");
        }
    }
}