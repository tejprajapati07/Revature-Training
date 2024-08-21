package com.practice;
import java.util.LinkedList;
import java.util.List;

public class Linkedlist_Demo {
	public static void main(String[] args) {
		List<String> myList = new LinkedList<String>();
		myList.add("Tej");
		myList.add("Narayan");
		myList.addLast("Prajapati");
		myList.add("Best");
		myList.addFirst("kare");
		myList.add(2,"Shreya");
		System.out.println(myList);
	}
}
