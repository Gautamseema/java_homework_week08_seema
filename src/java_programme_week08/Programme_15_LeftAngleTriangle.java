package java_programme_week08;

import java.util.Scanner;

public class Programme_15_LeftAngleTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        System.out.print("Enter the number of rows for the left-angled triangle:");
        int rows = scanner.nextInt();
        scanner.close() ;
       for (int i = 1; i <= rows; i++) {
           for ( int j = rows; j > i; j--){
               System.out.print(" ");
           }
           for (int k = 1; k <= i; k++)
           {
               System.out.print("*");
           }
       }
       System.out.println();
        for (int i = 1; i <= rows; i++) {
            for (int j = rows; j > i; j--){
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    }

