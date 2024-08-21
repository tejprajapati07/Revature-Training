package com.practice.strings;

public class Program1 {
	void check(String str) {
		int len = str.length();
		for(int i=0;i<len;i++) {
			char ch = str.charAt(i);
			if(ch == 'e') {
				System.out.print("The alphabet e is present");
				break;
			}
		}
	}
	public static void main(String args[]) {
		String str = "Umbrella";
		Program1 obj = new Program1();
		obj.check(str);
	}
}
