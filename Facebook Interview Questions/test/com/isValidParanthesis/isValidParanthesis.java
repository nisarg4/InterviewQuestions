package com.isValidParanthesis;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import com.validParanthesis.ValidParenthesis;

class isValidParanthesis {
	
	ValidParenthesis vp = new ValidParenthesis();

	@Test
	void test() {
		assertEquals(true,vp.isValid("()"));
		assertEquals(true,vp.isValid("()[]{}"));
		assertEquals(false,vp.isValid("(]"));
		assertEquals(false,vp.isValid("([)]"));
		assertEquals(true,vp.isValid("{[]}"));
		assertEquals(true,vp.isValid(null));
		assertEquals(false,vp.isValid("{{([{()])}}"));
		
	}

}
