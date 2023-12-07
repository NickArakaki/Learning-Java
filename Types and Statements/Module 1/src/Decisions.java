public class Decisions {
    public static void main(String[] args) {
        int milesPerHour = 67;
        int speedLimit = 55;
        boolean knowsOfficer = false;

        if (milesPerHour > speedLimit) {
            System.out.println("Officially, you're speeding");
        }

        if (milesPerHour > speedLimit && !knowsOfficer) {
            System.out.println("You're getting a speeding ticket.");
        }
    }
}
