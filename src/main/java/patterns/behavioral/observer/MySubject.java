package patterns.behavioral.observer;

public class MySubject extends AbstractSubject{

	public void operation() {
		System.out.println("------------>MySubject.operation()");
		notifys();
	}


}
