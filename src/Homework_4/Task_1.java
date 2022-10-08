package Homework_4;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(sumOfSeven(a, b));
    }

    public static int sumOfSeven(int a, int b) {
        int c = 0;
        for (int i = a; i <= b; i++) {
            if (i > 9 && i < 99 && i % 7 == 0)
                c = c + i % 10 + i % 100 / 10;
        }
        return c;
    }
}
