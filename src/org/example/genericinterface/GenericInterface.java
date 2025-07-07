package org.example.genericinterface;


public class GenericInterface {
	public static void main(String[] args) {
		String str = "test";
		Object obj = new Object();
		
		obj = str; // is a type of relationship
		
		Myclass<String> myclass1 = new Myclass<String>();
		Myclass<Object> myclass2 = new Myclass<Object>();
		
		//myclass2 = myclass1; // Compilation error since MyClass<String> is not a MyClass<Object>
		
		//We are not allowed to assign MyClass<String> variable to MyClass<Object> variable because 
		//they are not related, in fact MyClass<T> parent is Object.
		
		obj = myclass2; //parent is a type of object
		
	}
	
	static class Myclass <T>{
	}

}
