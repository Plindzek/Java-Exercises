package ytNauka;

public class Prostok�t extends Figura{
private double bokA;
private double bokB;

public Prostok�t()	
{this(1.0,1.0);}

public Prostok�t(double a, double b)

{	this( a, b, "bia�y" , false);}

public Prostok�t(double a, double b, String k, boolean w)
{super (k,w);
bokA=a;
bokB=b;	}


public double obliczPole()
{return bokA*bokB;}

public double obliczObw�d()
{return 2*(bokA+bokB);}

public String toString ()
{return "Nazwa: " + getClass().getName() + ", Bok a:"+bokA+", bok b: "+bokB+", Pole: "+obliczPole()+ 
		 ", Obw�d: "+obliczObw�d()+ " oraz "+ super.toString();}

public static void main(String[] args) {
	Prostok�t pr = new Prostok�t();
	System.out.println(pr);
	
}

}
