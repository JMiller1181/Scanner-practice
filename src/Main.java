import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

    }
}
// Greeting class
class Greeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("Hi " + name);
    }
}
// HelloThere class
class HelloThere {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello there! How are you doing today?");
        String mood = scanner.nextLine();
        System.out.println("Wow- interesting! Tell me more about yourself!");
        String more = scanner.nextLine();
        System.out.println("Nice chatting with you, goodbye!");
    }
}
class Superhero {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Let's write a story about a superhero.");
        System.out.println("Who is the hero of our story?");
        String name = scanner.nextLine();
        System.out.println("What is their superpower?");
        String power = scanner.nextLine();
        System.out.println("Here is the story:");
        System.out.println("There once was a superhero named " + name +", who had the power of " + power + ".");
        System.out.println("As they grew older, " + name + " saw that the world needed them.");
        System.out.println(name + " used their ability to " + power + " to save the world.");
    }
}
//VariableInputs class
class VariableInputs {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string of text: ");
        String words = scanner.nextLine();
        System.out.println("Enter an integer: ");
        int num = Integer.valueOf(scanner.nextLine());
        System.out.println("Enter a double: ");
        double dec = Double.valueOf(scanner.nextLine());
        System.out.println("Enter a boolean value: ");
        boolean state = Boolean.valueOf(scanner.nextLine());
        System.out.println("Your string is " + words);
        System.out.println("Your integer is " + num);
        System.out.println("Your double is " + dec);
        System.out.println("Your boolean is " + state);
    }
}