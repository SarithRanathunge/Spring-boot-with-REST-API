import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        // Create a Scanner to read input
        Scanner scanner = new Scanner(System.in);

        // Print greeting
        System.out.println("Hello, World!");
        System.out.println("Welcome to Java!");

        // Ask for name
        System.out.print("What is your name? ");
        String name = scanner.nextLine();

        // Say hello to the user
        System.out.println("Nice to meet you, " + name + "!");

        scanner.close()
    }

