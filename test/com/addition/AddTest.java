package com.addition;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AddTest {
	
	Addition addition;
	
	@Before
	public void init() {
		addition = new Addition();

	}

	@Test
	public void testAdd() {
		int result = addition.add(2, 3);
		assertEquals(5, result);
	}

}
