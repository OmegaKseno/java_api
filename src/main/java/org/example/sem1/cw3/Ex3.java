package org.example.sem1.cw3;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
          String a = "Hello Wowld";

        System.out.println( replaseString("Hello World."));
    }
    public static String replaseString (String str){
        int length = str.length();
        String sub1 = str.substring(0,length/2);
        String sub2 = str.substring(length/2,length);
        return sub2+sub1;
    }
}
