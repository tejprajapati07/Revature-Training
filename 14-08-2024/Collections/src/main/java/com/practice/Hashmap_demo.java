package com.practice;

import java.util.*;
public class Hashmap_demo {
	public static void main(String[] args) {
		HashMap<String,Double> balance = new HashMap<String,Double>();
		balance.put("Tej", (double) 1054.00);
		balance.put("Narayan", (double) 366.50);
		balance.put("Prajapati", (double) 5454.0);
		balance.put("Shreya", (double) 984424.0);
		balance.put("Chaurasia", (double) 5452.0);
		balance.put("Somesh", (double) 7894.00);
		System.out.println(balance.get("Shreya"));
		
		Set<String> keys=balance.keySet();
		for(String key:keys)
			System.out.println(key+" : " + balance.get(key));
	}
}
