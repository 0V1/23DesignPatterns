package patterns.behavioral.delegate;

public class EmployeeB implements Employee{
    
    @Override
    public void doing() {
        System.out.println("EmployeeB doing B");
    }
}
