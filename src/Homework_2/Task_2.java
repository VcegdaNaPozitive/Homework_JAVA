package Homework_2;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = 11, v = 2, e = 0;
        for (int i = 1; i < n + 1; i++) {
            if (i % 2 == 1)
                k *= 3;
            else {
                k -= 10 * v;
                e += 10 * v;
            }
            v += (e / 70);
            e %= 70;
        }
        System.out.println(k + " " + v);
    }
}