package ytNauka;

public class Kolo extends Figura {
private double promien;

public double getPromien() //akcesor
{return promien;}

public void setPromien(double r)//mutator
{promien=r;}

public Kolo()
{
this(1.0);
}


public Kolo(double r) 
{
this (r , "niebieski", true);
}

public Kolo(double r, String k, boolean w) 
	{
	super();
	promien= r;
	}

public double obliczObwod()
{return 2*Math.PI*promien;}

public double obliczPole()
{return Math.PI*promien*promien;}
	
public String toString() {return "Nazwa: " + getClass().getName() 
		+ " Promie�: " + promien + ", Obw�d: "+ obliczObwod() + ", Pole: " + obliczPole() + " oraz " + super.toString();} 

	public static void main(String[] args) {
		Kolo kola = new Kolo(6, "bbb", true);
		System.out.println(kola );

	}

}
