package divisors;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DivisorsOptimized {

    static ArrayList<Integer> returnDivisors(int number){

        ArrayList<Integer> results = new ArrayList<>();
        for(int i = 1; i * i <= number; i++ ){

            if(number % i == 0){
                results.add(i);

                if (i != number/i){
                    results.add(number/i);
                }
            }
        }
        Collections.sort(results);

        return results;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number to print the divisors for: ");
        System.out.println("Divisors are: \n" + returnDivisors(scan.nextInt()));

        scan.close();
    }
}

