
   import java.util.Scanner;

public class Menstrual{

    public static void main(String[] args) {
        myMenu();
    }

    public static void myMenu() {
        Scanner input = new Scanner(System.in);

        System.out.print("What is your name: ");
        String name = input.next();

        System.out.print("What is your date of birth: ");
        int birthDate = input.nextInt();
        input.nextLine(); // Consume the newline character

        System.out.print("How old are you: ");
        int age = input.nextInt();
        input.nextLine(); // Consume the newline character

        System.out.print("Is your menstrual cycle regular? Yes or No: ");
        String firstOption = input.next();
        input.nextLine(); // Consume the newline character

        if (firstOption.equalsIgnoreCase("Yes")) {
            System.out.println("Great! Your menstrual cycle is regular.");
        } else if (firstOption.equalsIgnoreCase("No")) {
            System.out.println("It's recommended to consult with a healthcare professional.");
        } else {
            System.out.println("INVALID INPUT!!");
        }

        System.out.print("Does your period start unexpectedly? Yes or No: ");
        String secondOption = input.next();
        input.nextLine(); // Consume the newline character

        if (secondOption.equalsIgnoreCase("Yes")) {
            System.out.println("We can recommend a medication for you.");
        } else if (secondOption.equalsIgnoreCase("No")) {
            System.out.println("That's good to hear!");
        } else {
            System.out.println("INVALID INPUT!!");
        }

        // Close the scanner
        input.close();
    }
}

