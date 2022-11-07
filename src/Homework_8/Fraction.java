package Homework_8;

public class Fraction {
    int numerator;
    int denominator;

    Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        System.out.println(this.numerator + "/" + this.denominator);
    }

    Fraction(double number) {
        System.out.println(number);
    }

    double sum(int numerator, int denominator) {
         int ch = this.numerator * denominator + numerator * this.denominator;
         int zn = this.denominator * denominator;
         return (double) ch / zn;
    }

    double mult(int numerator, int denominator) {
        int ch = this.numerator * numerator;
        int zn = this.denominator * denominator;
        return  (double) ch / zn;
    }
}
