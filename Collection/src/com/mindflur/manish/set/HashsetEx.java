package com.mindflur.manish.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> st=new HashSet<String>();
		st.add("manis");
		st.add("manish");
		st.add("manishKr");
Iterator<String>itr=st.iterator();
while(itr.hasNext()) {
	System.out.println(itr.next());
}
	}

}
