package czynnosciowe.interpreter;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Parser {
        
    private List<Expression> parseTree = new ArrayList<Expression>();

    /**
     * Interpretacja określonych wyrażeń np do określonego języka programowania.
     * 
     * Problem w którym można wykorzystać interpreter może dotyczyć dziedzin, które
     * dotyczą języków których nie chcemy tłumaczyć samodzielnie z każdym razem i
     * możemy stworzyć do nich interpreter, który będzie sam tłumaczył ich
     * gramatykę. Użyj wtedy kiedy: Chcesz stworzyć np własny kompilator, tworzysz
     * projekt, który posiada funkcjonalności, które muszę być zinterpretowane na
     * język zrozumiały dla użytkownika. Jakieś zadania w projekcie są zapisane w
     * interpretowanym języku oraz istnieje gramatyka do niego.
     * 
     * Interfejs wzorca interpreter definiuje metodę interpret() a każda klasa
     * konkretna dziedzicząca po nim implementuje metodę interpret(), która tłumaczy
     * wymaganą w tym momencie konkretną część języka.
     * 
     * @param expression wyrażenie do zinterpretowania
     * @author www
     */

    public Parser(String expression)
        {
	for (String token : expression.split(" "))
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
