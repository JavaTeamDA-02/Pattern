package abstractFactory;

import java.util.Random;

public class WhiteCircle implements Circle {
    private int id;
    private String color;
    private double radius;

    public WhiteCircle(){
        id = (int) (( Math.random() * (100-1) ) + 1);
        color = "White";
        radius = (int) (( Math.random() * (10-1) ) + 1);
    }

    public WhiteCircle(int id, double radius) {
        this.id = id;
        this.radius = radius;
        color = "White";
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
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI * radius;
    }
}
