package patterns.creational.factory.abstractfactory;

public class SmallHand implements Hand {
    @Override
    public String doIt() {
        return "this is small hand do it";
    }
}
