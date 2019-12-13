package com.codewardev.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.codewardev.BraceChecker;

class BraceCheckerTests {

	  private BraceChecker checker = new BraceChecker();

		@Test
		public void testValid() {
	    assertEquals(true, checker.isValid("()"));
		}
	  
	  @Test
		public void testInvalid() {
	    assertEquals(false, checker.isValid("[(])"));
		}

}
