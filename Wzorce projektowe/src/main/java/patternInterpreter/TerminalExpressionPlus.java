package patternInterpreter;

import java.util.Stack;

public class TerminalExpressionPlus implements Expression{
       
    @Override
    public void interpret(Stack<Integer> s) {
	 s.push(s.pop() + s.pop());
	
    }
}