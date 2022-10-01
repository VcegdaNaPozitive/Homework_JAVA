package Homework_1;

import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double y = in.nextDouble();
        if ((y <= 2 - x * x) && ((x >= 0 && y >= 0) || (x <= 0 && y >= x)))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
