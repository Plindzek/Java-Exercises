package czynnosciowe.interpreter2;

public class ThousandExpression extends Expression{

    @Override
    public String One() {
	return "M";
    }

    @Override
    public String Four() {
	return " ";
    }

    @Override
    public String Five() {
	return " ";
    }

    @Override
    public String Nine() {
	return " ";
    }

    @Override
    public int Multiplier() {
	return 1000;
    }

    
}
