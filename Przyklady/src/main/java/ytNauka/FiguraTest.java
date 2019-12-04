package ytNauka;

public class FiguraTest {
private int doKonstruktora;
	
public FiguraTest()
{this(0);}
public FiguraTest(int doKonstruktora)
	{	
	this(doKonstruktora, "x");
	}

public FiguraTest(int doKonstruktora, String j)
{}


	public static void main(String[] args) {
		
		FiguraTest test = new FiguraTest(1);
		Kolo kolo = new Kolo();
		Kolo kolo2 = new Kolo(50);
		
		Prostokat prost = new Prostokat();
		Prostokat prost2 = new Prostokat(3,7, "be�owy",true);
		
		Figura[] figury = new Figura[4];
		figury[0]=kolo;
		figury[1]=kolo2;
		figury[2]=prost;
		figury[3]=prost2;
		
		
		
		/* 
		for (int i=0;i<figury.length;i++)
		{if (figury[i] instanceof Ko�o) 
		{System.out.println(((Ko�o)figury[i]).obliczPole());}
		else {if (figury[i] instanceof Prostok�t)
		{System.out.println(((Prostok�t)figury[i]).obliczPole());}
		
		}}
		
		*/
			
		
		
		for ( int i=0; i<figury.length; i++)
		{System.out.println(figury[i].obliczPole());}
		
}
}