package Homework_3;

import java.util.Scanner;

public class Task_3_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = -1;
        for (int i = 0; i < n; i++) {
            int b = in.nextInt();
            if (b > 0 && b < a || a < 0)
                a = b;
        }
        System.out.println(a);
    }
}
