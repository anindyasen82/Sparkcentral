package com.calculator;

public class DivisionEvaluator implements CommandEvaluator {
	
	private CommandEvaluator evaluator;
	
	private double divisor;
	
	public DivisionEvaluator(CommandEvaluator evaluator, double divisor) {
		this.evaluator = evaluator;
		this.divisor = divisor;
	}
	

	@Override
	public double evaluate() {
		if(this.evaluator != null) {
			double divident = evaluator.evaluate();
			return divident/divisor;
		}
		return divisor;
	}

}
