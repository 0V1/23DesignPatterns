package patterns.creational.factory.abstractfactory;

public class Test {

    public static void main(String[] args) {
        PersonFactory person;
        Head head;
        Hand hand;

        person = new ManPersonFactory();
        head = person.createHead();
        hand = person.createHand();
        System.out.println(head.say() + " | " + hand.doIt());

        person = new WomanPersonFactory();
        head = person.createHead();
        hand = person.createHand();
        System.out.println(head.say() + " | " + hand.doIt());
    }
}
