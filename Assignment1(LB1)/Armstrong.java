import java.util.*;

import java.util.Scanner;



public class Armstrong {
    public static boolean isArmstrong(int num, int originalNum) {
              if (num < 10) {
            return num == originalNum;
        }

  
        int lastDigit = num % 10;
        int remainingDigits = num / 10;
        return isArmstrong(remainingDigits, originalNum) && (int)Math.pow(lastDigit, String.valueOf(originalNum).length()) == lastDigit;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        if (isArmstrong(number, number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}