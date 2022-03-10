package interfaces;

public class MyInterfaceImpl implements MyInterface, MyOtherInterface {
	public void sayHello() {
		System.out.println(MyInterface.hello);
	}
	
	
	public void sayGoodBye() {
		System.out.println("GOod Bye");
	}
	
	
	
}
