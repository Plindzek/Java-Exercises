package ytNauka;

public class Prostok¹t extends Figura{
private double bokA;
private double bokB;

public Prostok¹t()	
{this(1.0,1.0);}

public Prostok¹t(double a, double b)

{	this( a, b, "bia³y" , false);}

public Prostok¹t(double a, double b, String k, boolean w)
{super (k,w);
bokA=a;
bokB=b;	}


public double obliczPole()
{return bokA*bokB;}

public double obliczObwód()
{return 2*(bokA+bokB);}

public String toString ()
{return "Nazwa: " + getClass().getName() + ", Bok a:"+bokA+", bok b: "+bokB+", Pole: "+obliczPole()+ 
		 ", Obwód: "+obliczObwód()+ " oraz "+ super.toString();}

public static void main(String[] args) {
	Prostok¹t pr = new Prostok¹t();
	System.out.println(pr);
	
}

}
