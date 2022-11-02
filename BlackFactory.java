package abstractFactory;

public class BlackFactory implements BaseFactory{
    @Override
    public Circle createCircle() {
        return new BlackCircle();
    }
    @Override
    public Circle createCircle(int id, double radius) {
        return new BlackCircle(id, radius);
    }
    @Override
    public Triangle createTriangle() {
        return new BlackTriangle();
    }
    public Triangle createTriangle(double a, double b, double c) {
        return new BlackTriangle(a, b, c);
    }
}
