package com.TestClockAngles;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import com.ClockAngles.ClockAngles;

class ClockAnglesTest {

	ClockAngles a = new ClockAngles();
	@Test
	void Anglestest() {
		
		assertEquals(0.00,a.angles(12, 60),0.0);
		assertEquals(360.00,a.angles(12, 00),0.0);
		assertEquals(222.00,a.angles(4, 57),0.0);
		assertEquals(180.00,a.angles(3, 45),0.0);
		
		assertEquals(312.00,a.angles(6, 82),0.1);
		assertEquals(180.00,a.angles(12, 90),0.0);
		assertEquals(180.00,a.angles(12, 30),0.0);		
	}

}
