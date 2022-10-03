package Homework_3;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = 0;
        while (n != 0) {
            p = p * 10 + n % 10;
            n /= 10;
        }
        System.out.println(p);
    }
}
