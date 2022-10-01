package Homework_1;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        if ((-3 <= x && x <= 5) || (9 <= x && x <= 15))
            System.out.println("true");
        else
            System.out.println("false");
    }
}
