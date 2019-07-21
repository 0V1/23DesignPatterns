package patterns.creational.factory.simplefactory;

public class Test {

    public static void main(String[] args) {
        Person person;
        String say;
        person = PersonFactory.createPerson("A");
        say = person.say("A");
        System.out.println(say);


        person = PersonFactory.createPerson("B");
        say = person.say("B");
        System.out.println(say);

        person = PersonFactory.createPerson("C");
        System.out.println(person == null);
    }
}
