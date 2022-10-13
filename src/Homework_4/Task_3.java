package Homework_4;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }
        System.out.println(minToBegin(array));
    }

    public static int minToBegin(int[] a) {
        int index = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[index]) {
                index = i;
            }
        }
        for (int i = a.length - 1; i > index; i--) {
            a[i] = a[i - 1];
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        return -1;
    }
}
