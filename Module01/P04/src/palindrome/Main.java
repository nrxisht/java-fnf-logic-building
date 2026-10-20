package palindrome;

import java.util.Scanner;

public class Main {
    static boolean checkPalindrome(int number){

        int originalNumber = number;
        int reverse = 0;
        while(number > 0){
            reverse = reverse * 10 + (number % 10);
            number /= 10;
        }
        return reverse == originalNumber;
    }

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number to check for palindrome: ");
        System.out.println(checkPalindrome(scan.nextInt()));
    }
}
