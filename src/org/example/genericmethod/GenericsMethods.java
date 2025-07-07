package org.example.genericmethod;

public class GenericsMethods<T> {

	T val; 
	
	public void set(T val) {
		this.val = val;
	}
	
	public T get() {
		return this.val;
	}
	
	public static <T> Boolean equals(GenericsMethods<T> g1,GenericsMethods<T> g2){
		return g1.get().equals(g2.get());
	}
	
	/* Java Generics Bounded Type Parameters :
	 * Suppose we want to restrict the type of objects that can be used in the parameterized type, 
	 * for example in a method that compares two objects and we want to make sure that the accepted 
	 * objects are Comparables. To declare a bounded type parameter, list the type parameter’s name, 
	 * followed by the extends keyword, followed by its upper bound, similar like below method.
	 */
	public static <T extends Comparable<T>> int compare(T t1,  T t2) {
		return t1.compareTo(t2);
	}
	
	public static void main(String[] args) {
		GenericsMethods<String> obj1 = new GenericsMethods<String>();
		obj1.set("Gaurav");
		
		GenericsMethods<String> obj2 = new GenericsMethods<String>();
		obj2.set("Gaurav");
		
		boolean isEquals = equals(obj1, obj2);
		
		System.out.println(isEquals);
		
		int val = compare("test", "test");
		System.out.println(val);
		
	}
}
