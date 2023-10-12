package com.sbi;

import pwd.encoder.PwdEncoder;

public class Userreg {

	public static void main(String[] args) {
		
		PwdEncoder pw= new PwdEncoder();
		
		String s=pw.Encode("Ram");
		
		System.out.println(s);
	}
}
