package OOP.RougeLikeGame;

public class Hero {
    private final String name;
    private final char symbol = '@';
    private int x;
    private int y;

    // Constructor
    public Hero(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    // getters
    public String getName() {
        return name;
    }

    public char getSymbol() {
        return symbol;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // movement
    public void moveLeft() {
        x--;
    }

    public void moveRight() {
        x++;
    }

    public void moveUp() {
        y--;
    }

    public void moveDown() {
        y++;
    }

    public static void main(String[] args) {

    }
}
