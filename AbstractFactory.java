package abstractFactory;

public class AbstractFactory {

    public BaseFactory getFactoryBlack(){
        return new BlackFactory();
    }
    public BaseFactory getFactoryWhite(){
        return new WhiteFactory();
    }
}

