package patterns.behavioral.templatemethod;

public class Plus extends AbstractCalculator {

    @Override
    public int calculator(int num1, int num2) {
        return num1 + num2;
    }

}
