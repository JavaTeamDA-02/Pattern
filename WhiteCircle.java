package abstractFactory;

import java.util.Random;

public class WhiteCircle implements Circle {
    private int id;
    private String color;
    private double area;
    private double radius;

    public WhiteCircle(){
        id = (int) (( Math.random() * (100-1) ) + 1);
        color = "White";
        radius = (int) (( Math.random() * (10-1) ) + 1);
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
