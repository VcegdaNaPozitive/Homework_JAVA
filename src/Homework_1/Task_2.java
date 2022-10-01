package Homework_1;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int n = in.nextInt();
        int c = n * (a * 100 + b);
        System.out.println(c / 100 + " " + c % 100);
    }
}
