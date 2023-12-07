import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        Scanner console = new java.util.Scanner(System.in);
        System.out.println("Enter your name:");
        String name = console.nextLine();
        System.out.println("Your name is: " + name);

        System.out.print("Enter a grocery item: ");
        String grocery = console.nextLine();

        System.out.print("What does it cost?: ");
        String input = console.nextLine();
        double cost = Double.parseDouble(input);

        System.out.print("How many are available?: ");
        int inventory = Integer.parseInt(console.nextLine());

        System.out.print("Is it taxable? [true/false]: ");
        boolean isTaxable = Boolean.parseBoolean(console.nextLine());

        // report
        System.out.println();
        System.out.println("=========================================");
        System.out.println(grocery + ": $" + cost);
        System.out.println("Current inventory: " + inventory);
        System.out.println("Taxable: " + isTaxable);

        System.out.printf("%s %n", cost);
        System.out.printf("%f %n", cost);
        System.out.printf("%.2f %n", cost);
        System.out.printf("%05.1f %n", cost);
    }
}
