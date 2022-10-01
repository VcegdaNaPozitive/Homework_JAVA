package Homework_2;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int b = 10;
        while (n > 0) {
            int a = n % 10;
            if (a < b && a != 0) b = a;
            n /= 10;
        }
        System.out.println(b);
    }
}
