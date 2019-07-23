package patterns.behavioral.delegate;

public class DalegateTest {

    public static void main(String[] args) {
        new Boss().command("A",new Leader());

        new Boss().command("B",new Leader());
    }
}
