package composite;

public class Circle extends Dot {

    private int radius;

    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    public void draw() {
        System.out.println("Drawing circle at " + getX() + ", " + getY() + " with radius " + radius);
    }

    public String toString() {
        return "Circle at " + getX() + ", " + getY() + " with radius " + radius;
    }
}