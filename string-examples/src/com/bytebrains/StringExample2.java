package com.bytebrains;

public class StringExample2 {

	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = new String("abc");
		String s3 = "abc";
		String s4 = new String("abc");
		String s5 = new String("abc").intern();
		System.out.println(s1 == s2); // false
		System.out.println(s1.equals(s2)); // true
		System.out.println(s1 == s3); // true
		System.out.println(s1 == s4); // false
		System.out.println(s2 == s4); // false
		System.out.println(s2 == s5); // false
		System.out.println(s1.length());

		StringBuilder sb = new StringBuilder("abc");
		StringBuilder sb2 = new StringBuilder("def");
		System.out.println(sb == sb2); // false

		String s6 = "xyz";

		String s8 = s1.concat(s6);
		
		System.out.println(s8);
		

	}

}
