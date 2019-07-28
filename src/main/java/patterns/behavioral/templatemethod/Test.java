package patterns.behavioral.templatemethod;

public class Test {

    public static void main(String[] args) {

        AbstractCalculator abstractCalculator = new Plus();
        int res = abstractCalculator.calculator("2+8", "\\+");

        System.out.println(res);
    }
}
