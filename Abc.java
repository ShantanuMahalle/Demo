// Import the Scanner class to read user input
import java.util.Scanner;

public class Abc {
  public static void main(String[] args) {
    // Create a new Scanner object to read user input
    Scanner scanner = new Scanner(System.in);

    // Prompt the user for their name
    System.out.print("What is your name? ");

    // Read the user's name
    String name = scanner.nextLine();

    // Print out a greeting message
    System.out.println("Hello, " + name + "!");

    // Close the Scanner object to prevent resource leaks
    scanner.close();
  }
}