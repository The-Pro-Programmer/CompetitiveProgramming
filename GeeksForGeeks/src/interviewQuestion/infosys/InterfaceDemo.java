package interviewQuestion.infosys;

public class InterfaceDemo implements Test1, Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 t1 = new InterfaceDemo();
		t1.sum();
		Test2 t2 = new InterfaceDemo();
		t2.sum();
	}

	@Override
	public void sum() {
		System.out.println("InterfaceDemo");
		Test2.super.sum();
	}

}


interface Test1{
	default void sum() {
		System.out.println("Test 1");
	}
}

interface Test2{
	default void sum() {
		System.out.println("Test 2");
	}
}

