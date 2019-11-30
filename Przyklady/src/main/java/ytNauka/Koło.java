package ytNauka;

public class Ko³o extends Figura {
private double promieñ;

public double getPromieñ() //akcesor
{return promieñ;}

public void setPromieñ(double r)//mutator
{promieñ=r;}

public Ko³o()
{
this(1.0);
}


public Ko³o(double r) 
{
this (r , "niebieski", true);
}

public Ko³o(double r, String k, boolean w) 
	{
	super();
	promieñ= r;
	}

public double obliczObwód()
{return 2*Math.PI*promieñ;}

public double obliczPole()
{return Math.PI*promieñ*promieñ;}
	
public String toString() {return "Nazwa: " + getClass().getName() 
		+ " Promieñ: " + promieñ + ", Obwód: "+ obliczObwód() + ", Pole: " + obliczPole() + " oraz " + super.toString();} 

	public static void main(String[] args) {
		Ko³o ko³a = new Ko³o(6, "bbb", true);
		System.out.println(ko³a );

	}

}
