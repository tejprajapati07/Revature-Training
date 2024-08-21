package com.practice.strings;

public class Program2 {
	static void display(String str) {
		int len = str.length();
		str = str.trim();
		String t="";
		for(int i=0;i<len;i++) {
			char ch = str.charAt(i);
			if(ch!=' ') {
				t = t+ch;
			}
			else {
				System.out.print(t.charAt(0)+". ");
				t="";
			}
		}
		String temp = "";
		for(int j=0;j<t.length();j++) {
			if(j==0) {
				temp = temp + t.charAt(0);
			}
			else {
				temp = temp + t.charAt(j);
			}
		}
		System.out.print(temp);
	}
	public static void main(String[] args) {
		String str = "Tej Narayan Prajapati";;
		display(str);
	}
}
