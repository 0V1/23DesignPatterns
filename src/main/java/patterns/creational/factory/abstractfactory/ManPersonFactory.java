package patterns.creational.factory.abstractfactory;

public class ManPersonFactory implements PersonFactory{

    @Override
    public Head createHead(){
        return new BigHead();
    }

    @Override
    public Hand createHand(){
     return new BigHand();
    }

}
