package practice;

import java.util.Scanner;

public class Main {

    boolean checkEvenOdd(int number){
        return (number % 2 == 0);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        Main check = new Main();

        System.out.println("Enter the number to check: ");
        System.out.println(check.checkEvenOdd(scan.nextInt()) ? "Even" :"Odd");
    }
}


