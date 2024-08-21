package com.practice.strings;

public class Program4 {
	int palind(String str) {
		String t="",temp ="";
		temp =str;
		int len = str.length();
		for(int i=len-1;i>=0;i--) {
			char ch = str.charAt(i);
			t = t + ch;
		}
		if(t.equals(temp)) {
			return 1;
		}
		else {
			return 0;
		}
	}
	public static void main(String[] args) {
		String str = "mom";
		Program4 obj = new Program4();
		int k = obj.palind(str);
		if(k==1) {
			System.out.println("This is a palindrome String");
		}
		else {
			System.out.println("This is not a palindrome String");
		}
	}
}
