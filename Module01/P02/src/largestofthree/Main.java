package largestofthree;

import java.util.Scanner;

public class Main {

    int largestOfThree(int num1, int num2, int num3){

        //return (num1 > num2)? num1 : (num2 > num3) ? num2 : num1; --> Wrong; fails for 20,10,30

        return ((num1 > num2) && (num1 > num3)) ? num1 : ((num2 > num3) ? num2 : num3);

    }

    public static void main(String[] args){

        Main obj = new Main();
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter three numbers");
        System.out.println(obj.largestOfThree(scan.nextInt(), scan.nextInt(), scan.nextInt()));

    }
}

