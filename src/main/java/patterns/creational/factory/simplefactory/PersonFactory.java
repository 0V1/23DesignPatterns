package patterns.creational.factory.simplefactory;

public class PersonFactory {

    public static Person createPerson(String str){
        if("A".equals(str)){
            return new PersonA();
        }else if("B".equals(str)){
            return new PersonB();
        }
        return null;
    }




}
