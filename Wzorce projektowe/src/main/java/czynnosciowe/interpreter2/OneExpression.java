package czynnosciowe.interpreter2;

public class OneExpression extends Expression{

    @Override
    public String One() {
	return "I";
    }

    @Override
    public String Four() {
	return "IV";
    }

    @Override
    public String Five() {
	return "V";
    }

    @Override
    public String Nine() {
	return "IX";
    }

    @Override
    public int Multiplier() {
	return 1;
    }

    
}
