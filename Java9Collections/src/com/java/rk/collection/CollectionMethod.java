package com.java.rk.collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionMethod {
	public static void main(String[] args) {
		Collection<String> cs = new ArrayList<>();
		cs.add("Ram");
		cs.add("Shyam");
		cs.add("BabuRao");
		cs.add("Apte");
		System.out.println(cs);
		Collection<String> ec = new ArrayList<>();
		ec.add("Majnu");
		ec.add("Uday");
		ec.add("Ghungroo");
		ec.add("Rdx");
		System.out.println(ec);
		Collection<String> me = new ArrayList<>();
		me.add("Boman");
		System.out.println(me);
		Collection<String> eng = new ArrayList<>();
		eng.addAll(cs);
		eng.addAll(ec);
		eng.addAll(me);
		System.out.println(eng);
		System.err.println(eng.size());
		System.out.println(eng.isEmpty());
		
		cs.remove("Apte");
		System.out.println(cs);
		
		eng.removeAll(ec);
		eng.containsAll(cs);
		eng.clear();
		System.out.println(ec.contains("Uday"));
		
		//Object [] arr = cs.toArray();
		//System.out.println(arr);
 	}
}
