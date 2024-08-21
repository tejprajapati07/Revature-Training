//WAP to add 5 favorite movies in a list and display it.
//Now Sort it.
//extend the application to sort movie object. movie_name/release_year/movie_ratings

package com.practice;

import java.util.ArrayList;
import java.util.Collections;

public class Assigment {
	public static void main(String[] args) {
		ArrayList<String> myList = new ArrayList<String>();
		myList.add("Bahubali");
		myList.add("Hanuman");
		myList.add("3 idiots");
		myList.add("KGF");
		myList.add("Yamla Pagla Deewana");
		System.out.println(myList);
		
		Collections.sort(myList);
		System.out.println(myList);
	}

}
