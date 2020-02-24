package com.tdchien88.designParrtens.type03_Behavioral.chap303_InterpreterPattern;

public class SubtractExpression implements Expression {

	private String expression;

	public SubtractExpression(String expression) {
		this.expression = expression;
	}

	@Override
	public int interpret(InterpreterEngineContext context) {
		return context.subtract(expression);
	}
}