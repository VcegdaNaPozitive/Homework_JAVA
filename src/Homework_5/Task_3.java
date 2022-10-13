package Homework_5;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] a = new int[n][n];
        int x = 0;
        int y = n - 1;
        int k = 1;
        while (k <= n * n) {
            for (int i = 0; i < n; i++) {
                if (a[x][i] == 0)
                    a[x][i] = k++;
            }
            for (int i = 0; i < n; i++) {
                if (a[i][y] == 0)
                    a[i][y] = k++;
            }
            for (int i = n - 1; i >= 0; i--) {
                if (a[y][i] == 0)
                    a[y][i] = k++;
            }
            for (int i = n - 1; i >= 0; i--) {
                if (a[i][x] == 0)
                    a[i][x] = k++;
            }
            x++;
            y--;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
