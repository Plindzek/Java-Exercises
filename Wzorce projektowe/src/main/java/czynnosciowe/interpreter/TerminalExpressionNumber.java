package interpreter;

import java.util.Stack;

public class TerminalExpressionNumber implements Expression {
        
            private int number;

            public TerminalExpressionNumber(int number)
            {
                this.number = number;
            }

            @Override
            public void interpret(Stack<Integer> s)
            {
                s.push(number);
            }

    @Override
    public String toString() {
	return "" + getClass().getName();
    }
}

