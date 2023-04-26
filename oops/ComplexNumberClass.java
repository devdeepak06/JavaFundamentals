package oops;

import java.util.Scanner;

class ComplexNumbers {

    // Write your code here
    int real;
    int imaginary;

    ComplexNumbers(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    void plus(ComplexNumbers c2) {
        this.real = this.real + c2.real;
        this.imaginary = this.imaginary + c2.imaginary;
    }

    void multiply(ComplexNumbers c2) {
        int real = this.real * c2.real - this.imaginary * c2.imaginary;
        int imaginary = this.real * c2.imaginary + this.imaginary * c2.real;
        this.real = real;
        this.imaginary = imaginary;
    }

    void subtract(ComplexNumbers c2) {
        this.real = this.real - c2.real;
        this.imaginary = this.imaginary - c2.imaginary;
    }

    void print() {
        System.out.println(this.real + " + i" + this.imaginary);
    }

}

public class ComplexNumberClass {

    public static void main(String args[]) {

        // Write your code here
        Scanner s = new Scanner(System.in);
        int real = s.nextInt();
        int imaginary = s.nextInt();
        ComplexNumbers c1 = new ComplexNumbers(real, imaginary);
        real = s.nextInt();
        imaginary = s.nextInt();
        ComplexNumbers c2 = new ComplexNumbers(real, imaginary);
        int choice = s.nextInt();
        s.close();
        if (choice == 1) {
            // Add
            c1.plus(c2);
            c1.print();
        } else if (choice == 2) {
            // Multiply
            c1.multiply(c2);
            c1.print();
        } else {
            return;
        }
    }
}