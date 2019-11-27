public class Ko³o {
	private double promieñ;
	private int id;
	private static int nextId=1;
	
		
public Ko³o()
{this(10000);}

public Ko³o(double r)
{this(r, "coœ");}

public Ko³o(double r, String j) 
{ 	id=nextId;
	nextId++;
	promieñ = r; 	
	if (j.equals("km")) 
	{promieñ= promieñ*1000;}
}
	
	public void setPromieñ(double promieñ)	{}
	public double getPromieñ()	{return promieñ;}
	
	public int getId() {return id;}
	
	public double obliczObwódKo³a()
	{return 2*Math.PI*promieñ;}
	
	public double obliczPoleKo³a()
	{return Math.PI*promieñ*promieñ;}
	
	
	public static void main (String[] args)

{// Ko³o kó³eczko = new Ko³o(3, "km");
//kó³eczko.setPromieñ(3.0);
		Ko³o[] kó³ka = new Ko³o[3]; 
		kó³ka[0]= new Ko³o();
		kó³ka[1]= new Ko³o(3.5);
		kó³ka[2]= new Ko³o(7, "km");

		for (Ko³o x: kó³ka) {
System.out.println("ID kó³eczka jest równe " + x.getId());		
System.out.println("Promieñ kó³eczka jest równy " + x.getPromieñ());
System.out.println("Obwód kó³eczka jest równy " + x.obliczObwódKo³a());
System.out.println("Pole kó³eczka jest równe " + x.obliczPoleKo³a());}

}
}