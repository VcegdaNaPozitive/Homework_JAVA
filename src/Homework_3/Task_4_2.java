package Homework_3;

import java.util.Scanner;

public class Task_4_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int b = in.nextInt();
        int a = 0;
        while (a != n) {
            int c = b;
            b = in.nextInt();
            if (b > c)
                System.out.print(b + " ");
        }
    }
}
