package com.calculator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DivisionEvaluatorTest {
	
	private DivisionEvaluator divisionEvaluator;
	

	@Test
	public void testEvaluateForInteger() {
		SingleEvaluator singleEvaluator = new SingleEvaluator(4);
		divisionEvaluator = new DivisionEvaluator(singleEvaluator, 2);
		double result = divisionEvaluator.evaluate();
		assertEquals(2, result, 0);
	}

}
