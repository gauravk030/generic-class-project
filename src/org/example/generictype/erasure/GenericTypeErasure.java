package org.example.generictype.erasure;

/**
 * Generics in Java was added to provide type-checking at compile time and it has no use at run time, so java compiler 
 * uses type erasure feature to remove all the generics type checking code in byte code and insert type-casting if necessary. 
 * Type erasure ensures that no new classes are created for parameterized types; consequently, generics incur no runtime overhead.
 */

class Test<T extends Comparable<T>> {

    private T data;
    private Test<T> next;

    public Test(T d, Test<T> n) {
        this.data = d;
        this.next = n;
    }

    public T getData() { return this.data; }
}

/*The Java compiler replaces the bounded type parameter T with the first bound interface, Comparable, as below code:*/

//public class Test {
//
//    private Comparable data;
//    private Test next;
//
//    public Node(Comparable d, Test n) {
//        this.data = d;
//        this.next = n;
//    }
//
//    public Comparable getData() { return data; }
//}

public class GenericTypeErasure {

	public static void main(String[] args) {
		
	}
}
