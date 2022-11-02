package abstractFactory;

public class WhiteFactory implements BaseFactory{

    @Override
    public Circle createCircle() {
        return new WhiteCircle();
    }

    @Override
    public Circle createCircle(int id, double radius) {
        return new WhiteCircle(id, radius);
    }

    @Override
    public Triangle createTriangle() {
        return new WhiteTriangle();
    }
    public Triangle createTriangle(double a, double b, double c) {
        return new WhiteTriangle(a, b, c);
    }
}
