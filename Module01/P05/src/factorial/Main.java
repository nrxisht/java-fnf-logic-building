package factorial;

import java.util.Scanner;

public class Main {

    static long getFactorial(int number){

        if(number <= 1)
            return 1;

        return number * getFactorial(number-1);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number to find the Factorial: ");
        System.out.println(getFactorial(scan.nextInt()));
    }
}
