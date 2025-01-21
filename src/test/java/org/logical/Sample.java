package org.logical;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class Sample {

	public static void main(String[] args) {
	
	List<Integer> li = new ArrayList();
	li.add(10);
	li.add(20);
	li.add(30);
	li.add(40);
	
	
	//apply listiterator
	ListIterator<Integer> listIterator = li.listIterator();
	
	//Forward Iteration
	System.out.println("========Forward Iteration======");
	while(listIterator.hasNext()) {
		System.out.println(listIterator.next());
		System.out.println(listIterator.nextIndex());
	}
	
	//Reverse Iteration
	System.out.println("========Reverse Iteration======");
	while(listIterator.hasPrevious()) {
		System.out.println(listIterator.previous());
		System.out.println(listIterator.previousIndex());
	}
	
	}
}
