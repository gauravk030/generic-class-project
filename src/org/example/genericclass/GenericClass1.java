package org.example.genericclass;

class Test<E>{
	private E object;
	
	public Test() {}
	
	public Test(E object) {
		this.object = object;
	}
	
	public E getObject() {
		return object;
	}
}


public class GenericClass1 {

	public static void main(String[] args) {

		Test<Integer> test = new Test<>(7);
		System.out.println(test.getObject() instanceof Integer);
		
	}

}
