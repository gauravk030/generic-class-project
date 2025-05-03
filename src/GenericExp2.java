class Test2<T,U>{
	private T object1;
	private U object2;
	
	public Test2() {}
	
	public Test2(T object1,U object2) {
		this.object1 = object1;
		this.object2 = object2;
	}

	public void print() {
		System.out.println("key " + object1);
		System.out.println("value " + object2);
	}
}

public class GenericExp2 {

	public static void main(String[] args) {
		Test2<Integer,String> test = new Test2<>(1,"one");
		test.print();
	}
}
