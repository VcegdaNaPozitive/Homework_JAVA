package Homework_1;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = a % 10 + a % 100 / 10 + a % 1000 / 100;
        int c = (a / 2 + 1) * 2;
        System.out.println(b + " " + c);
    }
}