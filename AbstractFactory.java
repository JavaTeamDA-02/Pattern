package abstractFactory;

public class AbstractFactory {
    BaseFactory factory;

    public AbstractFactory(BaseFactory factory) {
        this.factory = factory;
    }

    public Circle getCircle() {
        return factory.createCircle();
    }

    public Circle getCircleCustom(int id, double radius) {
        return factory.createCircle(id, radius);
    }

    public Triangle getTriangle() {
        return factory.createTriangle();
    }

    public Triangle getTriangleCustom(double a, double b, double c) {
        return factory.createTriangle(a, b, c);
    }
}


