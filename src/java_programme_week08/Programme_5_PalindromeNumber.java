package java_programme_week08;

import java.util.Scanner;

public class Programme_5_PalindromeNumber {
    public static boolean isPalindrome(int number){
        // Panlindrom number can be negative number also
        int originalNumber = Math.abs(number) ;
        int reverse = 0;
        int temp = originalNumber ;
        while(temp != 0) {
            int lastDigit = temp % 10;
            reverse = reverse * 10 + lastDigit ;
            temp /= 10;
        }
        return originalNumber == reverse ;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scanner.nextInt();
        isPalindrome(num);
        scanner.close() ;

        if(isPalindrome(num) ){
            System.out.println(num + "is a palindrome : ");
        }else {
            System.out.println(num + "is not a palindrome");
        }
    }
}
