package patterns.creational.factory.abstractfactory;

public class WomanPersonFactory implements PersonFactory{

    @Override
    public Head createHead(){
        return new SmallHead();
    }

    @Override
    public Hand createHand(){
        return new SmallHand();
    }

}
