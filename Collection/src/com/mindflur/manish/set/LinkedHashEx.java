package com.mindflur.manish.set;
import java.util.*;
public class LinkedHashEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashSet<String>st=new LinkedHashSet<String>();
		st.add("One");
		st.add("Two");
		st.add("Three");
  System.out.println("Data in Set\n\n");
		
		Iterator<String>itr=st.iterator()
;
		while(itr.hasNext())
		System.out.println(itr.next());
		System.out.println("Data after clone method\n\n");
		st.clone();
		System.out.println(st);
		System.out.println("chacking whether data is present or absent in Set ");
		if(st.contains("One")) {
			System.out.println("Data is present");
		}
		else {
			System.out.println("data is absent");
		}
		System.out.println("Size of LinkedHashSet::"+st.size());
		System.out.println("Is set Empty?:"+st.isEmpty());
		
		}
      
}
