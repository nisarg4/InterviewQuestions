package com.isValidPalindrome;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.validPalindrome.validPalindrome;

class isValidPalindromeTest {

	validPalindrome v = new validPalindrome();
	@Test
	void isValidPalindrome() {
		assertEquals(false,v.isValid("race a car"));
		assertEquals(true,v.isValid("A man, a plan, a canal: Panama"));
		assertEquals(true,v.isValid("race a e-car"));
		assertEquals(true,v.isValid(""));
		assertEquals(true,v.isValid(" "));
		assertEquals(true,v.isValid(null));
		assertEquals(true,v.isValid("Hi... hannah! IH,"));
		assertEquals(false,v.isValid("Good morning!!!"));
	}

}
