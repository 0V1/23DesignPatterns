package patterns.behavioral.delegate;

public class EmployeeA implements Employee{

    @Override
    public void doing() {
        System.out.println("EmployeeA doing A");
    }
}
