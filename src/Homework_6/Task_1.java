package Homework_6;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        byte[] array = new byte[n / 8 + 1];
        for (int i = 0; i < n; i++) {
            if (in.nextBoolean()) {
                array[i / 8] = (byte);
            }
        }
        for (int i = 0; i < n; i++) {

        }
    }
}
