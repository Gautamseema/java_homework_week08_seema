package java_programme_week08;

import java.util.Scanner;

public class Programme_10_ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = scanner.nextInt();

       if(isArmstrong(number)){
           System.out.println(number + "is Armstrong number:");
       }else {
           System.out.println(number + "is not Armstrong number");
       }
        scanner.close() ;


    }
    static boolean isArmstrong(int num) {
        int originalNumber, reminder, result = 0;
        originalNumber = num;
        int n = String.valueOf(num).length() ;

        while(originalNumber != 0){
            reminder = originalNumber % 10;
            result += Math.pow(reminder, n);
            originalNumber /= 10;
        }
            return result == num;
    }
}

