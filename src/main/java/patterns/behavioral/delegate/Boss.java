package patterns.behavioral.delegate;

public class Boss {

    public void command(String command,Leader leader){
        leader.doing(command);
    }
}
