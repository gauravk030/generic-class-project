package org.example.genericwildcard;

import java.util.ArrayList;
import java.util.List;

/**
 * Generic Unbounded Wildcard : Sometimes we have a situation where we want our
 * generic method to be working with all types, in this case, an unbounded
 * wildcard can be used. Its same as using <? extends Object>.
 */
public class GenericsUnboundedWildcard {

	public static void printData(List<?> list) {
		for (Object obj : list) {
			System.out.print(obj + "::");
		}
		System.out.println("");
	}

	public static void main(String[] args) {
		List<Double> numbers1 = new ArrayList<Double>();
		numbers1.add(1.2);
		numbers1.add(2.0);
		numbers1.add(3.5);
		
		printData(numbers1);
		
		List<Integer> numbers2 = new ArrayList<Integer>();
		numbers2.add(1);
		numbers2.add(2);
		numbers2.add(3);
		
		printData(numbers2);
	}

}
