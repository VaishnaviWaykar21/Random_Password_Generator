//Task: Random Password Generator

package Level_1;

import java.util.Random;
import java.util.Scanner;

public class Task_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter the length of the password: ");
        int length = sc.nextInt();

     
        System.out.print("Include lowercase letters? (y/n): ");
        boolean includeLowercase = sc.next().equalsIgnoreCase("y");
        
        System.out.print("Include uppercase letters? (y/n): ");
        boolean includeUppercase = sc.next().equalsIgnoreCase("y");
        
        System.out.print("Include numbers? (y/n): ");
        boolean includeNumbers = sc.next().equalsIgnoreCase("y");
        
        System.out.print("Include special characters? (y/n): ");
        boolean includeSpecialChars = sc.next().equalsIgnoreCase("y");

        String lowercaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String uppercaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numbers = "0123456789";
        String specialCharacters = "!@#$%^&*()-_=+<>?/{}[]|";

        StringBuilder characterSet = new StringBuilder();
        
        if (includeLowercase) {
            characterSet.append(lowercaseLetters);
        }
        if (includeUppercase) {
            characterSet.append(uppercaseLetters);
        }
        if (includeNumbers) {
            characterSet.append(numbers);
        }
        if (includeSpecialChars) {
            characterSet.append(specialCharacters);
        }

        StringBuilder password = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(characterSet.length());
            password.append(characterSet.charAt(randomIndex));
        }

        System.out.println("Generated password: " + password);

        sc.close();

	}

}
