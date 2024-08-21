package com.practice.strings;

public class Program3 {
	static void find(String str) {
		int numbers=0, space=0, vovel=0, consonant=0;
		int len = str.length();
		for(int i=0;i<len;i++) {
			char ch = str.charAt(i);
			if(ch>='0' && ch<='9') {
				numbers++;
			}
			else if(ch==' ') {
				space++;
			}
			else if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				vovel++;
			}
			else {
				consonant++;
			}
		}
		System.out.println("The number of vovels are "+ vovel);
		System.out.println("The number of consonents are "+ consonant);
		System.out.println("The number of digits are "+ numbers);
		System.out.println("The number of spaces are "+ space);
	}
	public static void main(String[] args) {
		String str = "Tej Narayan Prajapati";;
		find(str);
	}
}
