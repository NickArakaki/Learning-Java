import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        String firstName = readRequiredString("Enter your first name: ");
        String lastName = readRequiredString("Enter your last name: ");
        String favoriteFood = readRequiredString("What's your favorite food?: ");

        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Favorite Food: " + favoriteFood);
    }

    public static String readRequiredString(String prompt) {
        Scanner console = new Scanner(System.in);
        String res;

        do {
            System.out.print(prompt);
            res = console.nextLine();
        } while (res.isEmpty());

        return res;
    }
}
