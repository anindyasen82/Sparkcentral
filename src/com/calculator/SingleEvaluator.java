package com.calculator;

public class SingleEvaluator implements CommandEvaluator {
	
	private double element;
	
	public SingleEvaluator(double element) {
		this.element = element;
	}
	

	@Override
	public double evaluate() {
		return element;
	}

}
