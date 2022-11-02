package abstractFactory;

public interface BaseFactory {
    public Circle createCircle();
    public Circle createCircle(int id, double radius);
    public Triangle createTriangle();
    public Triangle createTriangle(double a, double b, double c);
}
