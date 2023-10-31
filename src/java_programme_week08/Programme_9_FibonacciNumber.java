package java_programme_week08;

import java.util.Scanner;

/**
 * write a java programme to Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */

public class Programme_9_FibonacciNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in );
        System.out.print("Enter the number of Fibonacci sequence :");
        int n = scanner.nextInt();
        Programme_9_FibonacciNumber obj = new Programme_9_FibonacciNumber();
        new Programme_9_FibonacciNumber();
        obj.printFibonacci(n);
        scanner.close() ;

    }

    public void printFibonacci(int n){
        int a = 1, b = 1;
        System.out.print("Fibonacci sequence :");
        for(int i = 1; i <= n; i++){
            System.out.print(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
        }
    }
}
