package AmazingNumbers.numbers;

import java.util.Scanner;

public class AmazingNumbers {
    static Scanner scanner = new Scanner(System.in);
    static int number;
    static boolean[] properties = new boolean[4];

    public static void main(String[] args) {
        readInput();
        if (number <= 0) {
            System.out.println("This number is not natural!");
        } else {
            ieEven();
            isBuzzNumber();
            isDuck();
            printProperties();
        }
    }

    // Reads the user input
    private static void readInput() {
        System.out.println("Enter a natural number");
        number = scanner.nextInt();
    }

    // Determines if a number is even or odd
    private static void ieEven() {
        if (number % 2 == 0) {
            properties[0] = true;
            properties[1] = false;
        } else {
            properties[0] = false;
            properties[1] = true;
        }
    }

    // Determines whether a number is "Buzz" or not
    private static void isBuzzNumber() {
        if (number % 7 != 0 && number % 10 != 7) {
            properties[2] = false;
        } else if (number % 7 == 0) {
            if (number % 10 == 7) {
                properties[2] = true;
            } else {
                properties[2] = true;
            }
        } else {
            properties[2] = true;
        }
    }

    // Determine if a number is a "Duck" number or not
    // A "Duck number is a is a positive number that contains zeroes
    private static void isDuck() {
        int temp = number;
        if (number < 10) {
            properties[3] = false;
        } else {
            while (true) {
                if (temp % 10 == 0) {
                    properties[3] = true;
                    break;
                } else {
                    temp = temp / 10;
                    if (temp < 10) {
                        properties[3] = false;
                        break;
                    }
                }
            }
        }
    }

    // Prints the number's properties
    private static void printProperties() {
        System.out.printf("Properties of %d\n", number);
        System.out.printf("\t\teven: %b\n", properties[0]);
        System.out.printf("\t\t odd: %b\n", properties[1]);
        System.out.printf("\t\tbuzz: %b\n", properties[2]);
        System.out.printf("\t\tduck: %b\n", properties[3]);
    }
}
