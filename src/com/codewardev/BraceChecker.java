package com.codewardev;

// https://www.codewars.com/kata/valid-braces/train/java


public class BraceChecker {

	public boolean isValid(String string) {
		String brackets="[]";
		String cBraces="{}";
		String braces="()";
		

		while(true) {
			if(string.contains(braces)) {
				string = string.replace(braces, "");
				continue;
			}
			System.out.println("String: "+string);
			if(string.contains(cBraces)) {
				string = string.replace(cBraces, "");
				continue;
			}
			System.out.println("String: "+string);
			if(string.contains(brackets)) {
				string = string.replace(brackets, "");
				continue;
			}
			System.out.println("String: "+string);
			break;
		}
		
		if(string.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}

}
