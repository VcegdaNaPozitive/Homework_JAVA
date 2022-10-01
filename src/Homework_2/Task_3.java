package Homework_2;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = n % 10;
        if (n == 11 || n == 12 || n == 13 || n == 14) a = 3;
        else if (a == 1) a = 1;
        else if (a == 2 || a == 3 || a == 4) a = 2;
        else a = 3;
        switch (a) {
            case 1:
                System.out.println(n + " TORT");
                break;
            case 2:
                System.out.println(n + " TORTA");
                break;
            case 3:
                System.out.println(n + " TORTOV");
                break;
        }
    }
}
