package JavaKonusalSorular.Pratik14_Arrays;

import java.util.Arrays;

public class Pr11 {

    public static void main(String[] args) {
        //bir int Array elemanlarinin işaretini(+-) degistiren  bir method yaziniz.
        // input : 1,2,-3,4,-5,-6
        //output :-1,-2,3,-4,5,6

        int[] arr = {1, 2, -3, 4, -5, -6};

        for (int w : arr) {
            w *= -1;
            System.out.print(w + ", ");

        }

        System.out.println("method for cozumu : "+Arrays.toString(sayininTersi(arr)));

    }

    public static int[] sayininTersi(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            arr[i] *= -1;

        }
        return arr;
    }
}
