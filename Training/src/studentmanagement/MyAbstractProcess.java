package studentmanagement;

public abstract class MyAbstractProcess {
	public void process() {
		stepBefore();
		action();
		stepAfter();
	}

	private void stepAfter() {
		// TODO Auto-generated method stub	
	}
	protected abstract void action();

	private void stepBefore() {
		// TODO Auto-generated method stub
	}

}
