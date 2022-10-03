package Homework_3;

import java.util.Scanner;

public class Task_3_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0;
        int c = Integer.MAX_VALUE;
        while (a != n) {
            int b = in.nextInt();
            if (b < c && b > 0)
                c = b;
            a++;
        }
        System.out.println(c);
    }
}
