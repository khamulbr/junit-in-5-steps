package com.in28minutes.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AssertTest {

	@Test
	void test() {
		assertTrue(true);
		assertFalse(false);
		assertArrayEquals(new int[] {1}, new int[] {1});
	}

}
