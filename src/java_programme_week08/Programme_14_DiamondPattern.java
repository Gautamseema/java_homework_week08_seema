package java_programme_week08;

import java.util.Scanner;

/**
 * write a java programme to display the pattern like a diamond.
 * while loop
 */

public class Programme_14_DiamondPattern {
    // main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows for the diamond pattern :");
        int rows = scanner.nextInt();
        scanner.close() ;
        Programme_14_DiamondPattern obj = new Programme_14_DiamondPattern();
        obj.diamondPattern(rows);

    }
    // Instance Method
    public void diamondPattern (int rows) {
        int i = 1;
        int space = rows -1;
        while (i <= rows) {
            int j = 1;
            while (j <= space ) {
                System.out.print(" ");
                j++;
            }
             j = 1;
            while (j <= 2 * i - 1) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            space--;
            i++;
        }
        i = rows - 1;
        space = 1;
        while (i >= 1) {
            int j = 1;
            while (j <= space) {
                System.out.print(" ");
                j++;
            }
             j = 1;
            while (j <= 2 * i - 1) {
                System.out.print("*");
                j++;
            }
            // move to next line
            System.out.println();
            space++;
            i--;
        }
    }
}