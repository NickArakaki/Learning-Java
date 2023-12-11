package OOP.examples;

public class ClassesandObjects {
    public static void main(String[] args) {
        Color success = new Color("green");
        Color failure = new Color("blue");
        Color warning = new Color("yellow");

        System.out.println("Success color is: " + success.name);
        System.out.println("Failure color is: " + failure.name);
        System.out.println("Warning color is: " + warning.name);

        failure.name = "red";
        System.out.println("Failure color is: " + failure.name);
    }

}

class Color {
    public String name;

    public Color(String name) {
        this.name = name;
    }
}
