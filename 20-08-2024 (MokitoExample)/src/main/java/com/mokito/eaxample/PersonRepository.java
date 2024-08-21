package com.mokito.eaxample;

import java.util.Arrays;
import java.util.List;

public class PersonRepository {
	
	public List<String> findAll(){
		System.out.println("Person Repository findAll()");
		return Arrays.asList("Tej","Narayan","Prajapati");
		}

}
