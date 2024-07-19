import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demonstrating next()
        System.out.println("Enter a word: ");
        String word = scanner.next();
        System.out.println("You entered: " + word);

        // Consume the leftover newline
        scanner.nextLine();

        // Demonstrating nextLine()
        System.out.println("Enter a sentence: ");
        String sentence = scanner.nextLine();
        System.out.println("You entered: " + sentence);

        // Demonstrating nextFloat()
        System.out.println("Enter a float number: ");
        if (scanner.hasNextFloat()) {
            float number = scanner.nextFloat();
            System.out.println("You entered: " + number);
        } else {
            System.out.println("Invalid float input.");
        }

        scanner.close();
    }
}
