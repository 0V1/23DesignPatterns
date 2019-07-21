package patterns.creational.factory.factorymethod;


public class PersonBFactory implements PersonFactory{

    public Person createPerson(){

        return new PersonB();
    }

}
