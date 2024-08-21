package com.practice.strings;

public class Program7 {
	public static void main(String[] args) {
		String str = "Bat is a well Batman of the Bat day.";
		String old_word = "Bat";
		String new_word = "snow";
		String update_str = str.replaceAll(old_word, new_word);
		
		System.out.println("Original sentence: " + str);
        System.out.println("Updated sentence: " + update_str);
	}
}
