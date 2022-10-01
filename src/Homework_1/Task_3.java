package Homework_1;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int h = ((n / 60) / 60) % 24;
        int m = n / 60 % 60;
        int s = n % 60;
        System.out.print(h + ":");
        if (m < 10)
            System.out.print("0");
        System.out.print(m + ":");
        if (s < 10)
            System.out.print("0");
        System.out.print(s);
    }
}
