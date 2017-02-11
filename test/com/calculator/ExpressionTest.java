package com.calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class ExpressionTest {

	@Test
	public void testEvaluateForTwoIntegerAdd() {
		String input = "2+3";
		
		Expression expression = new Expression(input);
		double result = expression.evaluate();
		assertEquals(5, result, 0);
	}

	@Test
	public void testEvaluateForTwoIntegerAddOneIntegerSub() {
		String input = "2+3-1";
		
		Expression expression = new Expression(input);
		double result = expression.evaluate();
		assertEquals(4, result, 0);
	}

	@Test
	public void testEvaluateForTwoIntegerAddOneIntegerSubOneIntegerMul() {
		String input = "2+3-1*2";
		
		Expression expression = new Expression(input);
		double result = expression.evaluate();
		assertEquals(3, result, 0);
	}

}
