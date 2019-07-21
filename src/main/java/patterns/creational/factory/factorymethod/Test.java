package patterns.creational.factory.factorymethod;


public class Test {

    public static void main(String[] args) {
        String say;
        PersonFactory personFactory;
        personFactory = new PersonAFactory();
        say = personFactory.createPerson().say("A");
        System.out.println(say);

        personFactory = new PersonBFactory();
        say = personFactory.createPerson().say("B");
        System.out.println(say);

    }
}
