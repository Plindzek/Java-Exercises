package ytNauka;

public class Ko�o extends Figura {
private double promie�;

public double getPromie�() //akcesor
{return promie�;}

public void setPromie�(double r)//mutator
{promie�=r;}

public Ko�o()
{
this(1.0);
}


public Ko�o(double r) 
{
this (r , "niebieski", true);
}

public Ko�o(double r, String k, boolean w) 
	{
	super();
	promie�= r;
	}

public double obliczObw�d()
{return 2*Math.PI*promie�;}

public double obliczPole()
{return Math.PI*promie�*promie�;}
	
public String toString() {return "Nazwa: " + getClass().getName() 
		+ " Promie�: " + promie� + ", Obw�d: "+ obliczObw�d() + ", Pole: " + obliczPole() + " oraz " + super.toString();} 

	public static void main(String[] args) {
		Ko�o ko�a = new Ko�o(6, "bbb", true);
		System.out.println(ko�a );

	}

}
