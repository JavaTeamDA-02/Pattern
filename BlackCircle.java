package abstractFactory;

public class BlackCircle implements Circle {
    private int id;
    private String color;
    private double radius;

    public BlackCircle() {
        id = (int) ((Math.random() * (200 - 101)) + 101);
        color = "Black";
        radius = (int) ((Math.random() * (5 - 1)) + 1);
    }

    public BlackCircle(int id, double radius){
        this.id = id;
        color = "Black";
        this.radius = radius;
    }

    @Override
    public int getID() {
        return id;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
