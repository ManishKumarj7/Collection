package com.mindflur.manish.set;
import java.util.*;
public class TreeSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method trub
TreeSet<String>tr=new TreeSet<String>();
tr.add("One");
tr.add("Two");
tr.add("Three");
		
		Iterator<String> itr=tr.descendingIterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
