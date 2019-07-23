package patterns.behavioral.delegate;

import java.util.HashMap;
import java.util.Map;

public class Leader {

    private Map<String, Employee> register = new HashMap<String, Employee>();

    public Leader() {
        register.put("A", new EmployeeA());
        register.put("B", new EmployeeB());
    }

    /**
     * command 即为register中的key
     *
     * @param command
     */
    public void doing(String command) {
        register.get(command).doing();
    }
}
