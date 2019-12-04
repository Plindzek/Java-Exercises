public class Circle {
	private double radius;
	private int id;
	private static int nextId=1;
	
		
public Circle()
{this(10000);}

public Circle(double r)
{this(r, "something");}

public Circle(double r, String j) 
{ 	id=nextId;
	nextId++;
	radius = r; 	
	if (j.equals("km")) 
	{radius= radius*1000;}
}
	
	public void setRadius(double radius)	{}
	public double getRadius()	{return radius;}
	
	public int getId() {return id;}
	
	public double calcCircleCircuit()
	{return 2*Math.PI*radius;}
	
	public double surfaceArea()
	{return Math.PI*radius*radius;}
	
	
	public static void main (String[] args)

{// Ko�o k�eczko = new Ko�o(3, "km");
//k�eczko.setPromie�(3.0);
		Circle[] circlet = new Circle[3]; 
		circlet[0]= new Circle();
		circlet[1]= new Circle(3.5);
		circlet[2]= new Circle(7, "km");

		for (Circle x: circlet) {
System.out.println("ID k�eczka jest r�wne " + x.getId());		
System.out.println("Promie� k�eczka jest r�wny " + x.getRadius());
System.out.println("Obw�d k�eczka jest r�wny " + x.calcCircleCircuit());
System.out.println("Pole k�eczka jest r�wne " + x.surfaceArea());}

}
}