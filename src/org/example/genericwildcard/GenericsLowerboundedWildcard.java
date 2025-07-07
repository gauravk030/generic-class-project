package org.example.genericwildcard;

import java.util.ArrayList;
import java.util.List;

/**
 * Generics Lower bounded Wildcard : Suppose we want to add Integers to a list
 * of integers in a method, we can keep the argument type as List<Integer> but
 * it will be tied up with Integers whereas List<Number> and List<Object> can
 * also hold integers, so we can use a lower bound wildcard to achieve this
 */
public class GenericsLowerboundedWildcard {

	public static void addIntegers(List<? super Integer> list) {
		list.add(new Integer(50));
		
		System.out.println(list);
	}

	public static void main(String[] args) {
		List<Integer> numbers1 = new ArrayList<Integer>();
		numbers1.add(1);
		numbers1.add(2);
		numbers1.add(3);
		
		addIntegers(numbers1);
		
		List<Number> numbers2 = new ArrayList<Number>();
		numbers2.add(1.2);
		numbers2.add(2.0);
		numbers2.add(3.5);
		
		addIntegers(numbers2);
		
		List<Object> numbers3 = new ArrayList<Object>();
		numbers3.add(1);
		numbers3.add(2);
		numbers3.add(3);
		
		addIntegers(numbers3);
	}

}
