package Homework_6;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int newLength = n / 8 + 1;
        int k = 0;
        byte[] b = new byte[newLength];
        extern:
        for (int i = 0; i < newLength; i++) {
            for (int j = 7; j >= 0; j--) {
                boolean input = in.nextBoolean();
                k++;
                if (input) {
                    int mask = 1 << j;
                    b[i] |= mask;
                }
                if (k == n) break extern;
            }
        }
        k = 0;
        extern:
        for (int i = 0; i < newLength; i++) {
            for (int j = 7; j >= 0; j--) {
                int mask = 1 << j;
                int result = (b[i] & mask);
                System.out.print(result != 0);
                System.out.print(" ");
                k++;
                if (k == n) break extern;
            }
        }
    }
}
