package org.example.genericwildcard;

import java.util.ArrayList;
import java.util.List;

/**
 * Question mark (?) is the wildcard in generics and represent an unknown type. The wildcard can be used as the type of a parameter,
 * field, or local variable and sometimes as a return type. We can’t use wildcards while invoking a generic method or instantiating 
 * a generic class.
 * 
 * Java Generics Upper Bounded Wildcard:
 */

public class GenericsUpperboundedWildcards {

	/*
	 * it won’t work with List of Integers or Doubles because we know that List<Integer> and List<Double> are not related, 
	 * this is when an upper bounded wildcard is helpful.
	 */
	public static double sum(List<Number> list) {
		double sum = 0;
		for (Number n : list) {
			sum += n.doubleValue();
		}
		return sum;
	}
	
	public static double sumAll(List<? extends Number> list) {
		double sum = 0;
		for (Number n : list) {
			sum += n.doubleValue();
		}
		return sum;
	}

	public static void main(String[] args) {
		List<Number> numbers = new ArrayList<Number>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		
		double total = sum(numbers);
		System.out.println("Total of numbers is :"+total);
		
		List<Double> numbers2 = new ArrayList<Double>();
		numbers2.add(1.2);
		numbers2.add(2.0);
		numbers2.add(3.5);
		
		double total2 = sumAll(numbers2);
		System.out.println("Total of doubles is :"+total2);
		
		List<Integer> numbers3 = new ArrayList<Integer>();
		numbers3.add(1);
		numbers3.add(2);
		numbers3.add(3);
		
		double total3 = sumAll(numbers3);
		System.out.println("Total of integers is :"+total3);
	}

}
