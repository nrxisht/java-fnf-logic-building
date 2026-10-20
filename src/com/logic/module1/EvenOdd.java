package com.logic.module1;

import java.util.Scanner;

public class EvenOdd {

    boolean checkEvenOdd(int number){
        return (number % 2 == 0);
    }

    public static void main(String[] args) {

        boolean flag;
        Scanner scan = new Scanner (System.in);



        EvenOdd check = new EvenOdd();
        System.out.println("Enter the number to check: ");
        System.out.println(check.checkEvenOdd(scan.nextInt()) ? "Even" :"Odd");

    }

}

/**
 * The main() method is static, so it cannot directly call an instance method.
 * Therefore, we create an object of the EvenOdd class using `new EvenOdd()`
 * and call checkEvenOdd() through the object reference.
 * Alternatively, checkEvenOdd() could be declared static, allowing it to be
 * called directly without creating an object.
 *
 *  There are two ways to call a method from the static main() method:
 *
 *  1. Instance method: Create an object using `new EvenOdd()` and call the
 *     method through the object reference, e.g., obj.checkEvenOdd(4).
 *
 *  2. Static method: Declare the method as `static` and call it directly
 *     using the class name, e.g., EvenOdd.checkEvenOdd(4), without creating
 *     an object.
 *
 *  Since main() is static, it cannot directly call an instance method
 *  ithout an object. Static methods belong to the class, while instance
 *  methods are invoked on objects.
 *
 */


/**
 * Explains the use of the ternary operator (? :) in Java.
 * The ternary operator evaluates a condition and returns one of two values.
 * It cannot select between void method calls, such as System.out.println(),
 * because void methods do not return values. Use the ternary operator to select a value.
 */