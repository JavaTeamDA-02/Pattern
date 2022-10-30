package abstractFactory;

public class BlackFactory implements BaseFactory{

    public Circle createCircle() {
        return new BlackCircle();
    }

    public Triangle createTriangle() {
        return new BlackTriangle();
    }
}
