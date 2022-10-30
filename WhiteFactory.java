package abstractFactory;

public class WhiteFactory implements BaseFactory{

    public Circle createCircle() {
        return new WhiteCircle();
    }

    public Triangle createTriangle() {
        return new WhiteTriangle();
    }
}
