package com.mindflur.manish.Map;
import java.util.*;
public class Mapex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map=new HashMap<Integer,String>();          
	      map.put(100,"Amit");    
	      map.put(101,"Vijay");    
	      map.put(102,"Rahul");   
	      map.entrySet()  
	     	      .forEach(System.out::println);  
	}

}
