package org.example.sem1.Ex3;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String num1 = in.nextLine();
        String num2 = in.nextLine();


        System.out.println(num1);
        System.out.println(num2);
        String result =" ";
        var memory = 0;
        String strMax = num1.length()>num2.length()?num1:num2;
        String strMin = num1.length()<num2.length()?num1:num2; ;


        for (int i = strMax.length()-1; i >= 0; i--) {

            int n1 = Character.getNumericValue(num1.charAt(i));
            int n2 = Character.getNumericValue(num2.charAt(i));
            System.out.println(n1);
            System.out.println(n2);
            if (n1+n2==1&&memory==1){
                result+="0";
                memory=1;
            }
            if (n1+n2==1&&memory==0) {
                result += "1";
            }
            if (n1+n2==2&&memory==1) {
                result +="1";
                memory=1;
            }
            if (n1+n2==2&&memory==0) {
                result +="0";
                memory=1;
            }
            if (n1+n2==0) {
                result += memory;

                memory=0;
            }
        }
        result+=memory;
        System.out.println(result);
    }
}
//num1.length()<num2.length()?num1.length():num2.length()