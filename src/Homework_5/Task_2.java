package Homework_5;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] A = new int[2 * n + 1][2 * n + 1];
        int s = 2 * n;
        int c = (s + 1) * (s + 1) - 1;
        A[n][n] = 0;
        for (int k = 0; k <= n; k++) {
            for (int i = k; i < s - k; i++)
                A[i][s - k] = c--;
            for (int i = k; i < s - k; i++)
                A[s - k][s - i] = c--;
            for (int i = k; i < s - k; i++)
                A[s - i][k] = c--;
            for (int i = k; i < s - k; i++)
                A[k][i] = c--;
        }
        for (int i = 0; i < 2 * n + 1; i++) {
            for (int j = 0; j < 2 * n + 1; j++) {
                System.out.print(A[i][j] + "  ");
            }
            System.out.println();
        }

    }
}

