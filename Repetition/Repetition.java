public class Repetition {
    public static void main(String[] args) {
        int count = 10;
        System.out.println("Countdown:");

        /*while (count > 0) {
            System.out.println(count);
            count--;
        }
*/

        do {
            System.out.println(count);
            count--;
        } while (count > 0);

        System.out.println("Blast off!");


        String message = "Loading...";
        for (int i = 0; i < message.length(); ++i) {
            System.out.println(message.charAt(i));
        }

    }
}