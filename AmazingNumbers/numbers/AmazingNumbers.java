package AmazingNumbers.numbers;

import java.util.Scanner;

public class AmazingNumbers {
    static Scanner scanner = new Scanner(System.in);
    static int number;

    public static void main(String[] args) {
        readInput();
        if (number <= 0) {
            System.out.println("This number is not natural!");
        } else {
            ieEven();
            isBuzzNumber();
        }
    }

    // Reads the user input
    private static void readInput() {
        System.out.println("Enter a natural number");
        number = scanner.nextInt();
    }

    private static void ieEven() {
        System.out.println(number % 2 == 0 ? "This number is Even." : "This number is Odd.");
    }

    // Determines whether a number is "Buzz" or not
    private static void isBuzzNumber() {
        if (number % 7 != 0 && number % 10 != 7) {
            System.out.println("It is not a Buzz number.");
            System.out.println("Explanation");
            System.out.printf("%d is neither divisible by 7 nor does it end with 7.", number);
        } else if (number % 7 == 0) {
            if (number % 10 == 7) {
                System.out.println("It is a Buzz number.");
                System.out.println("Explanation");
                System.out.printf("%d is divisible by 7 and ends with 7.", number);
            } else {
                System.out.println("It is a Buzz number.");
                System.out.println("Explanation");
                System.out.printf("%d is divisible by 7.", number);
            }
        } else {
            System.out.println("It is a Buzz number.");
            System.out.println("Explanation");
            System.out.printf("%d ends with 7.", number);
        }
    }
}
