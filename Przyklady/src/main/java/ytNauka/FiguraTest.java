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
		Ko這 ko這 = new Ko這();
		Ko這 ko這2 = new Ko這(50);
		
		Prostok靖 prost = new Prostok靖();
		Prostok靖 prost2 = new Prostok靖(3,7, "be穎wy",true);
		
		Figura[] figury = new Figura[4];
		figury[0]=ko這;
		figury[1]=ko這2;
		figury[2]=prost;
		figury[3]=prost2;
		
		
		
		/* 
		for (int i=0;i<figury.length;i++)
		{if (figury[i] instanceof Ko這) 
		{System.out.println(((Ko這)figury[i]).obliczPole());}
		else {if (figury[i] instanceof Prostok靖)
		{System.out.println(((Prostok靖)figury[i]).obliczPole());}
		
		}}
		
		*/
			
		
		
		for ( int i=0; i<figury.length; i++)
		{System.out.println(figury[i].obliczPole());}
		
}
}