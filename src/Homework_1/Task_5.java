package Homework_1;

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if (((a % 5 == 0) && (99 < a && a < 1000)) && ((b % 5 == 0) && (99 < b && b < 1000)) || ((b % 5 == 0) && (99 < b && b < 1000)) && ((c % 5 == 0) && (99 < c && c < 1000)) || ((a % 5 == 0) && (99 < a && a < 1000)) && ((c % 5 == 0) && (99 < c && c < 1000)))
            System.out.println("true");
        else
            System.out.println("false");
    }
}
