package org.example.sem1.cw2;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(countDiff(n,scanner));
        scanner.close();
    }

    /**
     *
     * @param num - колличество чисел
     * @param scanner - функция ввода
     * @return- результат почсчета
     */
    public static int countDiff (int num,Scanner scanner){
        int count = 0;
        int a = scanner.nextInt();
        for (int i = 1; i < num; i++) {
            int b = scanner.nextInt();
                if(a>0&&b<0){
                    count++;
                }
                a=b;
            }
        return count;
        }

}
