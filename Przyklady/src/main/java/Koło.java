public class Ko�o {
	private double promie�;
	private int id;
	private static int nextId=1;
	
		
public Ko�o()
{this(10000);}

public Ko�o(double r)
{this(r, "co�");}

public Ko�o(double r, String j) 
{ 	id=nextId;
	nextId++;
	promie� = r; 	
	if (j.equals("km")) 
	{promie�= promie�*1000;}
}
	
	public void setPromie�(double promie�)	{}
	public double getPromie�()	{return promie�;}
	
	public int getId() {return id;}
	
	public double obliczObw�dKo�a()
	{return 2*Math.PI*promie�;}
	
	public double obliczPoleKo�a()
	{return Math.PI*promie�*promie�;}
	
	
	public static void main (String[] args)

{// Ko�o k�eczko = new Ko�o(3, "km");
//k�eczko.setPromie�(3.0);
		Ko�o[] k�ka = new Ko�o[3]; 
		k�ka[0]= new Ko�o();
		k�ka[1]= new Ko�o(3.5);
		k�ka[2]= new Ko�o(7, "km");

		for (Ko�o x: k�ka) {
System.out.println("ID k�eczka jest r�wne " + x.getId());		
System.out.println("Promie� k�eczka jest r�wny " + x.getPromie�());
System.out.println("Obw�d k�eczka jest r�wny " + x.obliczObw�dKo�a());
System.out.println("Pole k�eczka jest r�wne " + x.obliczPoleKo�a());}

}
}