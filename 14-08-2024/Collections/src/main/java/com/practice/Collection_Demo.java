//Input using the ArrayList

package com.practice;

import java.util.ArrayList;
import java.util.List;

public class Collection_Demo {
	public static void main(String[] args) {
		List<String> myList = new ArrayList();
		myList.add("Tej");
		myList.add("Narayan");
		myList.add("Prajapati");
		myList.add("Somesh");
		myList.add("kare");
		myList.add("Shreya");
		for(String name:myList)
			System.out.println(name);
		
		//Removing element from List
		myList.remove("Prajapati");
		myList.remove(3);
		for(String name:myList)
			System.out.println(name);
	}

}
