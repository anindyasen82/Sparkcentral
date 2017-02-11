package com.calculator;

public class AdditiontionEvaluator implements CommandEvaluator {
	
	private CommandEvaluator evaluator;
	
	private double factor;
	
	public AdditiontionEvaluator(CommandEvaluator evaluator, double factor) {
		this.evaluator = evaluator;
		this.factor = factor;
	}
	

	@Override
	public double evaluate() {
		if(this.evaluator != null) {
			double result = evaluator.evaluate();
			return result + factor;
		}
		return factor;
	}

}
