package sumofdigits;

import java.util.Scanner;

public class Main {

    static int sumOfDigits(int number){
        int sum = 0;
        int digit;
        while(number > 0){
            digit = number % 10;
            number = number / 10;
            sum = sum + digit;
        }
        return sum;
    }

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number: ");
        System.out.println("The sum of digits is: "+ sumOfDigits(scan.nextInt()) );
    }
}
