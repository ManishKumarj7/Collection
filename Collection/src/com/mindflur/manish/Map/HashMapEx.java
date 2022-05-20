package com.mindflur.manish.Map;
import java.util.*;
public class HashMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map <Integer,String>map=new HashMap<Integer, String>();
map.put(1, "Avinash");
map.put(2, "Bera");
for(Map.Entry m:map.entrySet()){  
	   System.out.println(m.getKey()+" "+m.getValue());  
	  }  	}

}
