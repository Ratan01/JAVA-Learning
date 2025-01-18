package com.java.rk.collection;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

//List vs Set
public class ListVsSet {
	public static void main(String[] args) {
		List<String> lis = new LinkedList<>();
		lis.add("Ram");
		lis.add("Shyam");
		lis.add("Govind");
		lis.add(null);
		lis.add("Madhao");
		lis.add(null);
		System.out.println(lis);
		
		Set<String> st = new HashSet<>();
		st.add("Ram");
		st.add("Shyam");
		st.add("Govind");
		st.add(null);
		st.add("Madhao");
		st.add(null);
		System.out.println(st);
		
	}
}

/*
 * List vs Set
 * List is index bound. Set in not index bound.
 * List store duplicate data, Set store unique data.
 * List maintain insertion order, Set does not maintain insertion order. 
 */
