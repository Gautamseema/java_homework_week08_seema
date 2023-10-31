package java_programme_week08;

import java.util.Scanner;

/**
 * Write a programme to input any number and check if it is prime or not.
 */

public class Programme_12_PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        scanner.close() ;
        Programme_12_PrimeNumber obj = new Programme_12_PrimeNumber();
        new Programme_12_PrimeNumber();
        boolean numberPrime = obj.numberPrime(number);
        if(numberPrime ){
            System.out.println(number + " is a prime number :");
        }else{
            System.out.println(number + " is not a prime number :");
        }

    }
    // Instance method
     boolean numberPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num <= 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }for (int i = 5; i * i <= num; i += 6){
            if(num % i == 0 || num % (i + 2) == 0){
                return false;
            }
        }
        return true;
    }
}
