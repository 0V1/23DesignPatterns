package patterns.creational.factory.factorymethod;


public class PersonAFactory implements PersonFactory{

    public Person createPerson(){

        return new PersonA();
    }

}
