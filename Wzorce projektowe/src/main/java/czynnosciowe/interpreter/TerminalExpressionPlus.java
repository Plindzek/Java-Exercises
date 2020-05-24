package czynnosciowe.interpreter;

import java.util.Stack;

public class TerminalExpressionPlus implements Expression{
       
    @Override
    public void interpret(Stack<Integer> s) {
	 s.push(s.pop() + s.pop());
	
    }

    @Override
    public String toString() {
	return "" + getClass().getName();
    }
}