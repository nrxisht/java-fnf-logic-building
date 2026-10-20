package divisors;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Integer> printDivisors(int number){

        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 1; i <= number; i++){
            if (number % i == 0){
                result.add(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number to print it's divisors: ");
        System.out.println("The divisors are: " + printDivisors(scan.nextInt()));
    }
}
