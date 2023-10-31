package java_programme_week08;

import java.util.Scanner;

public class Programme_8_RightAngleTriangle {

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
                    //print @
                    System.out.print("@ ");

                }
                System.out.println();
            }
        }
    }

