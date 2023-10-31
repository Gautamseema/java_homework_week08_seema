package java_programme_week08;

import java.util.Scanner;

/**
 * Write a program in Java to display the pattern like a triangle with a number.
 *  For eg: Input number of rows : 10
 *  Expected Output:
 *  1
 *  12
 *  123
 *  1234
 *  12345
 *  123456
 *  1234567
 *  12345678
 *  123456789
 *  12345678910
 */


public class Programme_6_NumberTriangle {
    public static void main(String[] args) {
        //int n = 1;
        int number_rows;
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number of rows:");
        number_rows = scanner.nextInt();
        scanner.close();
        for (int i = 1; i <= number_rows; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print(j + "");
            }
            System.out.println();
        }
    }
}