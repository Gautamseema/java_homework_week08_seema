package java_programme_week08;

import java.util.Scanner;

/**
 * Write programme named hasSharedDigit with two parameters of type int.
 * Each number should be with the range of 10(inclusive) -99(inclusive).
 * if one of the number is not within the range, the method should return false.
 * hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers.
 * hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99.
 * hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers.
 * The method hasSharedDigit should be defined as public static.
 */

public class Programme_13_SharedDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in );
        System.out.println("Enter the first number (between 10 and 99): ");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number (between 10 and 99): ");
        int num2 = scanner .nextInt() ;
        scanner .close() ;
        boolean result = hasSharedDigit(num1 , num2 ) ;
        if(result){
            System.out.println("Both number have a shared digit: ");
        }else{
            System.out.println("No shared digit or one of the number is out of range : ");
        }
    }
    // static method
    public static boolean hasSharedDigit(int num1, int num2) {
        if ((num1 < 10 || num1 > 99) || (num2 < 10 || num2 > 99)) {
            return false; // one of the number is out of range
        }
        int firstDigitNum1 = num1 / 10;
        int secondDigitNum1 = num1 % 10;
        int firstDigitNum2 = num2 / 10;
        int secondDigitNum2 = num2 % 10;
        return (firstDigitNum1 == firstDigitNum2 || firstDigitNum1 == secondDigitNum2 ||
                secondDigitNum1 == firstDigitNum2 || secondDigitNum1  == secondDigitNum2 );
    }
}
