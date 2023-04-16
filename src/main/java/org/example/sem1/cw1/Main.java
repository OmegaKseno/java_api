package org.example.sem1.cw1;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = in.nextInt();
        System.out.println(subtractProductAndSum( num));
        in.close();
    }

    /**
     *
     * @param n-параметр
     * @return - произведение минус сумма
     */
    public static int subtractProductAndSum(int n){

            int first = 1;
            int second = 0;

            while (n != 0) {
                first *= n % 10;
                second += n % 10;
                n /= 10;
            }
            return first-second;
        }


}