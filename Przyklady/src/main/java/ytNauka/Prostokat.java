package ytNauka;

public class Prostokat extends Figura{
private double bokA;
private double bokB;

public Prostokat()	
{this(1.0,1.0);}

public Prostokat(double a, double b)

{	this( a, b, "bia�y" , false);}

public Prostokat(double a, double b, String k, boolean w)
{super (k,w);
bokA=a;
bokB=b;	}


public double obliczPole()
{return bokA*bokB;}

public double obliczObwod()
{return 2*(bokA+bokB);}

public String toString ()
{return "Nazwa: " + getClass().getName() + ", Bok a:"+bokA+", bok b: "+bokB+", Pole: "+obliczPole()+ 
		 ", Obw�d: "+obliczObwod()+ " oraz "+ super.toString();}

public static void main(String[] args) {
	Prostokat pr = new Prostokat();
	System.out.println(pr);
	
}

}
