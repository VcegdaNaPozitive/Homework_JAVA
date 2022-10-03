package Homework_3;

import java.util.Scanner;

public class Task_4_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            if (array[i] < array[i + 1]) {
                System.out.print(array[i + 1] + " ");
            }
        }
    }
}
