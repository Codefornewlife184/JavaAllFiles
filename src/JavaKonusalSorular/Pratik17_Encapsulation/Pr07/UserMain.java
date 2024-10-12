package JavaKonusalSorular.Pratik17_Encapsulation.Pr07;

import java.util.Scanner;

public class UserMain {
    public static void main(String[] args) {

        int kullanici = 0;
        Scanner oku = new Scanner(System.in);

        String username = "";
        String password = "";

        do {

            System.out.print((kullanici + 1) + ".User Name= ");
            username = oku.nextLine();

            System.out.print("Password= ");
            password = oku.nextLine();
            try {
                User yeniUser = new User(username, password);
                kullanici++;

            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        } while (kullanici < 2);

    }



}
