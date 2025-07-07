package org.example.genericwildcard;

import java.util.ArrayList;
import java.util.List;

public class GenericSubtypingUsingWildcard {

	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		List<? extends Number>  numList = intList;  // OK. List<Integer> is a subtype of List<? extends Number>
		System.out.println(numList);
	}
}
