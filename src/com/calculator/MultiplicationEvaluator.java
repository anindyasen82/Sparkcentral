package com.calculator;

public class MultiplicationEvaluator implements CommandEvaluator {
	
	private CommandEvaluator evaluator;
	
	private double factor;
	
	public MultiplicationEvaluator(CommandEvaluator evaluator, double factor) {
		this.evaluator = evaluator;
		this.factor = factor;
	}
	

	@Override
	public double evaluate() {
		if(this.evaluator != null) {
			double result = evaluator.evaluate();
			return result * factor;
		}
		return factor;
	}

}
