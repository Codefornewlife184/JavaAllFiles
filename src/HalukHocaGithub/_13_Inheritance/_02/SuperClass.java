package HalukHocaGithub._13_Inheritance._02;

class SuperClass{

    /*
    1) SuperClass isminde bir class oluşturun. içerisinde int num  = 20     değeri olsun.
    goster isminde bir method  "Bu method süper classın görüntülenme methodudur" print etsin.

    2) SubClass oluşturun ve Super_class'tan miras alın. SubClass içerisinde de   int num= 10 olsun.
    goster methodu  "Bu method Sub classsın görüntülenme methodudur. "  print etsin.

    my_method isminde method oluşturun : içerisinde  SubClass'daki goster methodunu ve SuperClasstaki goster methodunu call etsin.
    Aynı zamanda  SubClass'daki numarayı ve SuperClass'taki int num u print edin.

    Sonra olarak main methodta  my method u calıştırın.

    Konsol şöyle olmalı :

    Bu method Sub classın görüntülenme yöntemidir.
    Bu method süper classın görüntülenme yöntemidir.
    Sub classtaki eleman :10
    süperClasstaki eleman  :20
     */
    int num = 20;


    public static void goster() {

        System.out.println("Bu method süper classın görüntülenme methodudur.");
    }
}








