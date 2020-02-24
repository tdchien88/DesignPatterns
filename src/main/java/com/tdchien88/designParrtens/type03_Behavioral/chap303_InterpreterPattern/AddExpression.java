package com.tdchien88.designParrtens.type03_Behavioral.chap303_InterpreterPattern;

public class AddExpression implements Expression {

	private String expression;

	public AddExpression(String expression) {
		this.expression = expression;
	}

	@Override
	public int interpret(InterpreterEngineContext context) {
		return context.add(expression);
	}
}