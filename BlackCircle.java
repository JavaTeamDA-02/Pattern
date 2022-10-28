package abstractFactory;

public class BlackCircle implements Circle {
    private int id;
    private String color;
    private double area;
    private double radius;

    public BlackCircle(){
        id = (int) (( Math.random() * (200-101) ) + 101);
        color = "Black";
        radius = (int) (( Math.random() * (5-1) ) + 1);
        area = Math.PI * radius;
    }

    @Override
    public int getID(){
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
        return area;
    }
}
