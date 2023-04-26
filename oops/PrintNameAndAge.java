/*
Problem Statement:
    Write a program to find the area of a rectangle.
    */
/*
    Time Complexity: O(1)
    Space Complexity: O(1)
 */
package oops;

import java.util.Scanner;
// import java.io.*;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void printDetails() {
        System.out.println("The name of the person is " + name + " and the age is " + age);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}

public class PrintNameAndAge {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            String name = s.next();
            int age = s.nextInt();
            Person p = new Person(name, age);
            p.printDetails();
        }

        // Person p1 = new Person("Afzal", 67);
        // p1.printDetails();
        // Person p2 = new Person("Ali", 30);
        // p2.printDetails();

    }

}
