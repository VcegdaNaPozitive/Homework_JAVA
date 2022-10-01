package Homework_2;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 1, b = 1, i = 0;
        while (i < n - 2) {
            int c = a + b;
            a = b;
            b = c;
            i += 1;
        }
        System.out.println(b);
    }
}
