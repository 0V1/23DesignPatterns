package patterns.behavioral.visitor;

public class MyVisitor implements Visitor {

	public void visit(Subject sub) {
		System.out.println("------------>MyVisitor.visit()"+sub.getSubject());

	}

}
