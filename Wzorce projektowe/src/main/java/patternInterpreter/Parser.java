package patternInterpreter;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Parser {
        
    private List<Expression> parseTree = new ArrayList<Expression>();

        public Parser(String s)
        {
            for (String token : s.split(" "))
            {
                if (token.equals("+"))
                {
                    parseTree.add(new TerminalExpressionPlus());
                }
                else if (token.equals("-"))
                {
                    parseTree.add(new TerminalExpressionMinus());
                }
                else
                {
                    parseTree.add(new TerminalExpressionNumber(Integer.parseInt(token)));
                }
            }
        }

        public int evaluate()
        {
            Stack<Integer> context = new Stack<Integer>();

            for (Expression e : parseTree)
            {
                e.interpret(context);
            }

            return context.pop();
        }
    }
