package com.codewardev;

// https://www.codewars.com/kata/valid-braces/train/java

public class BraceChecker {

	public boolean isValid(String string) {
		String brackets="[]", cBraces="{}", braces="()";

		while(!string.endsWith("#") && !string.isEmpty()) {
			string = (string.contains(braces) ? string.replace(braces, "") : 
				(string.contains(cBraces)?string.replace(cBraces, ""):
					(string.contains(brackets)?string.replace(brackets, ""):string.concat("#"))));
		}
		
		return string.isEmpty();
	}

}
