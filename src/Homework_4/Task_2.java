package Homework_4;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }
        System.out.println(avgOf4Digit(array));
    }

    public static double avgOf4Digit(int[] array) {
        double a = 0;
        int b = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 999 && array[i] < 10000) {
                a = a + array[i];
                b++;
            }
        }
        if (a == 0)
            return -1;
        return a / b;
    }
}
