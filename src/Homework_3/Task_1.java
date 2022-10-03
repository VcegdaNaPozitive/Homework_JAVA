package Homework_3;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = in.nextInt();
        int p = 0;
        while (n > 0) {
            p = p * 10 + n % 10;
            n /= 10;
        }
        while (p > 0) {
            int a = p % 10;
            if (d == a) System.out.print("");
            else System.out.print(a);
            p /= 10;
        }
    }
}
