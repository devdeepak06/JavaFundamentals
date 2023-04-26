package oops;

import java.util.Scanner;

class Fraction {
    int numerator;
    int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        simplify();
    }

    private void simplify() {
        int gcd = 1;
        int smaller = Math.min(numerator, denominator);
        for (int i = 2; i <= smaller; i++) {
            if (numerator % i == 0 && denominator % i == 0) {
                gcd = i;
            }
        }
        numerator = numerator / gcd;
        denominator = denominator / gcd;
    }

    public void print() {
        System.out.println(numerator + "/" + denominator);
    }

    public void add(Fraction f2) {
        this.numerator = this.numerator * f2.denominator + this.denominator * f2.numerator;
        this.denominator = this.denominator * f2.denominator;
        simplify();
    }

    public void multiply(Fraction f2) {
        this.numerator = this.numerator * f2.numerator;
        this.denominator = this.denominator * f2.denominator;
        simplify();
    }

}

public class FractionClass {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int d = sc.nextInt();
            Fraction f1 = new Fraction(n, d);
            int t = sc.nextInt();
            while (t-- > 0) {
                int choice = sc.nextInt();
                int q = sc.nextInt();
                int w = sc.nextInt();
                Fraction f2 = new Fraction(q, w);
                switch (choice) {
                    case 1:
                        f1.add(f2);
                        f1.print();
                        break;
                    case 2:
                        f1.multiply(f2);
                        f1.print();
                        break;
                    default:
                        System.out.println("Invalid");
                }
            }
        }

    }

}
