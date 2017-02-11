package com.calculator;

public class Expression {
	
	private CommandEvaluator commandEvaluator;
	
	public Expression(String expression) {
		analyzeExpression(expression);
	}
	
	private void analyzeExpression(String e) {
		for(int i = 0; i < e.length(); i++) {
			char currentChar = e.charAt(i);
			if((currentChar == '/')) {
				double divident = Double.parseDouble(e.charAt(i - 1) + "");
				double divisor = Double.parseDouble(e.charAt(i + 1) + "");
				if(commandEvaluator == null) {
					commandEvaluator = new SingleEvaluator(divident);
				}
				commandEvaluator = new DivisionEvaluator(commandEvaluator, divisor);
			} else if(currentChar == '*') {
				double factor = Double.parseDouble(e.charAt(i - 1) + "");
				double result = Double.parseDouble(e.charAt(i + 1) + "");
				if(commandEvaluator == null) {
					commandEvaluator = new SingleEvaluator(result);
					commandEvaluator = new MultiplicationEvaluator(commandEvaluator, factor);
				} else {
					commandEvaluator = new MultiplicationEvaluator(commandEvaluator, result);
				}
			} else if(currentChar == '+') {
				double factor = Double.parseDouble(e.charAt(i - 1) + "");
				double result = Double.parseDouble(e.charAt(i + 1) + "");
				if(commandEvaluator == null) {
					commandEvaluator = new SingleEvaluator(result);
					commandEvaluator = new AdditiontionEvaluator(commandEvaluator, factor);
				} else {
					commandEvaluator = new AdditiontionEvaluator(commandEvaluator, result);
				}
			} else if(currentChar == '-') {
				double factor = Double.parseDouble(e.charAt(i - 1) + "");
				double result = Double.parseDouble(e.charAt(i + 1) + "");
				if(commandEvaluator == null) {
					commandEvaluator = new SingleEvaluator(result);
					commandEvaluator = new SubstractionEvaluator(commandEvaluator, factor);
				} else {
					commandEvaluator = new SubstractionEvaluator(commandEvaluator, result);
				}
				
			}
		}
	}
	
	public double evaluate() {
		return commandEvaluator.evaluate();
	}

}
