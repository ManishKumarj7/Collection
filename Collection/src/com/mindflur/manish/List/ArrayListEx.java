package com.mindflur.manish.List;
import java.util.*;
public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String>list=new ArrayList<String>();
list.add("Manish");
list.add("Samaira");
list.add("Suraj");
list.add("Jenny");

for(String mni:list) 
	System.out.println(mni);
System.out.println("Data in list after remove()");
list.remove("Samaira");
System.out.println(list);
System.out.println("Data in list after removeAll()");
list.removeAll(list);
System.out.println(list);

		
	}

}
