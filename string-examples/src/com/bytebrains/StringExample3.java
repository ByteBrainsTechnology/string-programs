package com.bytebrains;

public class StringExample3 {
	public static void main(String[] args) {

		String s1 = "abc";
		String s2 = 40 + 50 + s1 + "xyz" + 60 + 70;
		
		// 90+s1+"xyz"+60+70
		// 90abc+"xyz"+60+70
		// 90abcxyz+60+70
		// 90abcxyz60 + 70 
		// 90abcxyz6070
		
		System.out.println(s2); 
		// 90abcxyz130 , 4050abcxyz130 , 90abcxyz6070
	}

}
