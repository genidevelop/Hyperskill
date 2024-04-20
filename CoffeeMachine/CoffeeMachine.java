
import java.util.Scanner;

public class CoffeeMachine {
    static Scanner scanner = new Scanner(System.in);
    static int cups;
    static int water;
    static int milk;
    static int coffeeBeans;
    static int serving;

    public static void main(String[] args) {
        readInput();
        calculateServings();
    }

    // Read the User Input
    public static void readInput() {
        System.out.println("Write how many ml of water the coffee machine has:");
        water = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        milk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        coffeeBeans = scanner.nextInt();
        System.out.println("Write how many cups of coffee you will need:");
        cups = scanner.nextInt();
    }

    // Calculates how many cups could the coffee machine serve
    public static void calculateServings() {
        serving = Math.min(Math.min(water / 200, milk / 50), coffeeBeans / 15);
        if (serving == cups) {
            System.out.println("Yes, I can make that amount of coffee");
        } else if (serving > cups) {
            System.out.println("Yes, I can make that amount of coffee (and even " + (serving - cups) + " more than that)");
        } else {
            System.out.println("No, I can make only " + serving + " cup(s) of coffee");
        }
    }
}
