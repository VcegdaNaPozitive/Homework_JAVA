package Homework_5;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] a = new int[n][m];
        for (int i = 0, j = 0, k = 0; k < n * m; j++, k++) {
            if (k != 0 && k % m == 0) {
                i++;
                j = 0;
            }
            a[i][j] = i * j;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }
}



