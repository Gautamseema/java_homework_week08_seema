package java_programme_week08;

import java.util.Scanner;

/**
 * Write the java programme that takes the user to provide a single character from the alphabet.
 * Print Vowel of Consonant, Depending on the user input if the user input is not a letter(between a and z or A and Z),
 * Or is a string of length > 1, print an error message.
 * For eg:
 * Input an alphabet: p
 * Expected Output:
 * Input letter is Consonant
 */

public class Programme_3_FindVowelOrConsonant {
    //main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a single character :");
        String input = scanner.next();
        scanner.close() ;

        if(input.length() != 1){
            System.out.println("Error: please enter a single character.");
        }else {
            char ch = input .charAt(0);
            if((ch >= 'a' && ch <= 'z') || (ch >='A' && ch <= 'Z')) {
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
            System.out.println(ch + " is a vowel :");
        } else {
            System.out.println(ch + " is a consonant:");
        }
            }else {
                System.out.println("Error: please enter a letter (a-z or A-Z");
            }
        }
    }
}
