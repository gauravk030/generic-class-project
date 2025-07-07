package org.example.mistake;

import java.util.ArrayList;
import java.util.List;

/***************************************Common mistake***************************************/
/**
 * Common mistake
 * 1. Using Raw Types
 * 2. Mixing Generics with Legacy Code
 * 3. Incorrect Use of Wildcards
 * 4. Overusing Wildcards: While wildcards improve flexibility, using them unnecessarily can make the code harder to understand.
 */


/***************************************Advantages***************************************/
/**
 * Advantages
 * 
 * Q. Why Use Generics in Java? 
 * 1. Type Safety: Prevents ClassCastException at runtime.
 * 2. Code Reusability: Enables writing a single class or method that works with different types.
 * 3. Improved Readability: Avoids excessive casting and makes code cleaner.
 */

/***************************************About Generic***************************************/
/**
 * Q. Why Are Generics Safe in Java?
 * Generics enforce type checking at compile time, reducing the likelihood of runtime errors. They eliminate the need 
 * for explicit casting and make code more readable and maintainable.
 * 
 * Q. Can I Create an Array of Generics in Java?
 * No, Java does not allow generic array creation due to type erasure. This would lead to ClassCastException error. 
 * Instead, you can use a List<T>:
 * List<T> list = new ArrayList<>(); // compile time error
 */

/***************************************Rules***************************************/
/**
 * 1. Cannot create instances of a generic type. Ex:  T obj = new T(); // Illegal
 * 2. No static members of generic type. Ex: // static T instance; // Illegal
 * 3. Cannot use primitives as type parameters Ex: // List<int> list = new ArrayList<>(); // Illegal
 */

public class GenericClass {
	public void addItem1(List<? extends Number> list) {
	    // list.add(10); // Compilation error
		//Instead, use ? super T if modification is required:
	}
	
	public void addItem2(List<? super Integer> list) {
	    list.add(10);
	}
	
	public static void main(String[] args) {
		//Using raw types defeats the purpose of generics.
		List list = new ArrayList(); // Avoid this
		list.add("Hello");
		list.add(123); // No type safety
		
		// instead of use
		List<String> list1 = new ArrayList<>();
		
		
	}
	

}
