package ReplitGithub;

import java.util.Scanner;

public class RG40_SayininIngilizceYazilisi {

    public static void main(String[] args) {

    /*40----
    Girilen sayının ingilizce yazılışını return eden bir method yazınız.

    Örnek

    numToEng(0)
    zero

    numToEng(18)
    eighteen

    numToEng(126)
    one hundred twenty six

    numToEng(909)
    nine hundred nine
    */
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen max 3 bas pozitif bir sayi giriniz : ");
        int num = scan.nextInt();

        sayininOkunusu(num);
    }

    private static void sayininOkunusu(int num) {
        if (num < 0 || num > 999) {
            System.out.println("Lutfen sartlara uyan bir sayi giriniz\nmax 3 bas ve pozitif bir sayi :");
        } else {//365==>36  365
            int birlerBas = num % 10;
            int a = num / 10;
            int onlarBas = a % 10;
            int yuzlerBas = num / 100;

            String[] birlerBas1 = {"zero", "one", "two", "three", "four", "five",
                    "six", "seven", "eight", "nine", "Ten", "Eleven",
                    "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen",
                    "Seventeen", "Eighteen", "Nineteen"};


            //ilk  eleman bos indexleri duzgun kullanmak icin
            String[] onlarBas1 = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
            String yuz = "hundred";
            if (num < 20) {// girilen sayi ayni zamanda index numarasidir
                System.out.println(birlerBas1[num]);
            } else if (num < 100) {//fifty three-53
                System.out.println(onlarBas1[onlarBas] + " " + birlerBas1[birlerBas]);
            } else {//3 bas icin

                if (birlerBas1[birlerBas] == "zero") {//360 ==>three hundred sixty
                    System.out.println(birlerBas1[yuzlerBas] + " " + yuz + " " + onlarBas1[onlarBas]);
                } else if (birlerBas1[birlerBas] != "zero") {//365 ==>three hundred sixty five
                    System.out.println(birlerBas1[yuzlerBas] + " " + yuz + " " + onlarBas1[onlarBas] + " " + birlerBas1[birlerBas]);
                }

            }
        }
        /*
                convert_to_words("9923".toCharArray());
        //System.out.println(Arrays.toString("9923".toCharArray()));
        convert_to_words("523".toCharArray());
        convert_to_words("89".toCharArray());
        convert_to_words("8".toCharArray());
       // System.out.println('9'-'0');

    }

    // A function that prints
    // given number in words
    static void convert_to_words(char[] num) {
        // Get number of digits
        // in given number
        int len = num.length;

        // Base cases
        if (len == 0) {
            System.out.println("empty string");
            return;
        }
        if (len > 4) {
            System.out.println("Length more than 4 is not supported");
            return;
        }

		/* The first string is not used, it is to make
			array indexing simple */
        String[] single_digits = new String[]{
                "zero", "one", "two", "three", "four",
                "five", "six", "seven", "eight", "nine"};

                /* The first string is not used, it is to make
                    array indexing simple */
        String[]two_digits = new String[]{
                "", "ten", "eleven", "twelve",
                "thirteen", "fourteen", "fifteen", "sixteen",
                "seventeen", "eighteen", "nineteen"};

        /* The first two string are not used, they are to
         * make array indexing simple*/
        String[] tens_multiple = new String[]{
                "", "", "twenty", "thirty", "forty",
                "fifty", "sixty", "seventy", "eighty", "ninety"};

        String[] tens_power
                = new String[]{"hundred", "thousand"};

        /* Used for debugging purpose only */
     //   System.out.print(String.valueOf(num) + ": ");

        /* For single digit number
        if (len == 1) {
            System.out.println(single_digits[num[0]-'0' ]);
            return;
        }*/

		/* Iterate while num
			is not '\0'
        int x = 0;
        while (x < num.length) {*/

            /* Code path for first 2 digits
            if (len >= 3) {
                if (num[x] - '0' != 0) {
                    System.out.print(
                            single_digits[num[x] - '0'] + " ");
                    System.out.print(tens_power[len - 3]
                            + " ");
                    // here len can be 3 or 4
                }
                --len;
           */ }

            /* Code path for last 2 digits
            else {
				/* Need to explicitly handle
				10-19. Sum of the two digits
				is used as index of "two_digits"
				array of strings
                if (num[x] - '0' == 1) {
                    int sum
                            = num[x] - '0' + num[x + 1] - '0';
                    System.out.println(two_digits[sum]);
                    return;
                }
               Need to explicitely handle 20
                else if (num[x] - '0' == 2
                        && num[x + 1] - '0' == 0) {
                    System.out.println("twenty");
                    return;
                } */

				/* Rest of the two digit
				numbers i.e., 21 to 99
                else {
                    int i = (num[x] - '0');
                    if (i > 0)
                        System.out.print(tens_multiple[i]
                                + " ");
                    else
                        System.out.print("");
                    ++x;
                    if (num[x] - '0' != 0)
                        System.out.println(
                                single_digits[num[x] - '0']);
                }
            }
            ++x;
        }*/
    }


