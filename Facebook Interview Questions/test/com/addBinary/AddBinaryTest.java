package com.addBinary;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AddBinaryTest {

	AddBinary add = new AddBinary();
	@Test
	void addBinaryTest() {
		assertEquals("",add.addBinary("", ""));
		assertEquals(null,add.addBinary("", null));
		assertEquals("10101",add.addBinary("1010","1011"));
		assertEquals("100",add.addBinary("11","1"));
		assertEquals("101",add.addBinary("101",""));
		assertEquals("1001",add.addBinary("","1001"));
		assertEquals("101110110",add.addBinary("10101010", "11001100"));
	}

}
